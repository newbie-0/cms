package com.briup.config;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.briup.bean.Privilege;
import com.briup.service.IPrivilegeService;
import com.briup.util.JwtTokenUtil;
import com.briup.util.PermissionException;
import com.briup.util.UnAuthorizedException;

public class JwtInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	private IPrivilegeService privilegeService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 如果是options请求，直接返回true，不进行拦截
		if (request.getMethod().equals("OPTIONS")) {
			response.setStatus(HttpServletResponse.SC_OK);
			return true;
		}
		// 获取请求头信息authorization信息
		final String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY);
		if (StringUtils.isEmpty(token)) {
			throw new UnAuthorizedException("用户还未登录");
		}
		// 验证token是否有效--无效已做异常抛出，由全局异常处理后返回对应信息
		JwtTokenUtil.parseJWT(token, JwtTokenUtil.base64Secret);
		// 验证权限，通过token获取用户id，通过用户id获取权限，这里可以使用redis将用户信息维护在缓存中，减少与数据库交互次数
		Integer id = Integer.parseInt(JwtTokenUtil.getUserId(token, JwtTokenUtil.base64Secret));
		this.auth(id, request.getServletPath());

		return true;
	}

    private boolean auth(Integer userId,String path){
        // 查询出该用户的所有权限
        List<Privilege> privileges = privilegeService.findByUserId(userId);
        // 匹配
		for (Privilege p : privileges) {
            if(p.getRoute().matches(path)){
                return true;
            }
        }
        throw new PermissionException("权限不足");
	}
}