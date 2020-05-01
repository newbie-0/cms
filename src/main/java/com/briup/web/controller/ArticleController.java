package com.briup.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.bean.Article;
import com.briup.bean.extend.ArticleExtend;
import com.briup.service.IArticleService;
import com.briup.util.ExcelUtils;
import com.briup.util.Message;
import com.briup.util.MessageUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(description = "文章相关接口")
@RestController
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	private IArticleService articleService;
	
	@ApiOperation(value="将文章导入到Excel中",notes="注意！测试的时候请将地址粘贴到浏览器地址栏测试",produces="application/octet-stream")
    @GetMapping("download")
    public void download(HttpServletResponse response) throws Exception{
        // 查询出所有文章信息
        String excelName = "article_list";
        String[] headList = new String[]{"编号","标题","内容"};
        String[] fieldList = new String[]{"id","title","content"};
        List<Map<String, Object>> dataList = new ArrayList<>();
        List<Article> list =articleService.findAll();
        for(Article a : list){
            Map<String, Object> map = new HashMap<>();
            map.put("id",a.getId());
            map.put("title",a.getTitle());
            map.put("content",a.getContent());
            dataList.add(map);
        }

        //调用工具类导出excel
        ExcelUtils.createExcel(response,excelName,headList,fieldList,dataList);

    }
	
	@ApiOperation("查询所有文章信息")
	@GetMapping("/findAll")
	public Message findAll() {
		List<Article> list = articleService.findAll();
		return MessageUtil.success(list);
	}
	
	@ApiOperation("查询文章及其相关的所有信息")
	@GetMapping("/cascadeFindAll")
	public Message caecadeFindAll() {
		List<ArticleExtend> list = articleService.cascadeFindAll();
		return MessageUtil.success(list);
	}
	
	@ApiOperation("根据id查询")
	@GetMapping("/findById")
	public Message findById(Integer id) {
		ArticleExtend articleExtend = articleService.findById(id);
		return MessageUtil.success(articleExtend);
	}
	
	@ApiOperation("通过id删除")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "id", value = "编号", required = true, paramType = "query")
	})
	@GetMapping("/deleteById")
	public Message deleteById(@RequestParam("id") Integer id) {
		articleService.deleteById(id);
		return MessageUtil.success("删除成功");
	}
	
	@ApiOperation(value = "保存或更新")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "id", value = "编号", required = true, paramType = "query"),
		@ApiImplicitParam(name = "title", value = "标题", required = true, paramType = "query"),
		@ApiImplicitParam(name = "content", value = "内容", required = true, paramType = "query"),
		@ApiImplicitParam(name = "source", value = "源内容", required = true, paramType = "query"),
		@ApiImplicitParam(name = "categoryId", value = "栏目id", required = true, paramType = "query"),
		@ApiImplicitParam(name = "authorId", value = "作者id", required = true, paramType = "query")
	})
	@PostMapping("/saveOrUpdate")
	public Message saveOrUpdate(
			Integer id, 
			String title, 
			String content, 
			String source, 
			Integer categoryId, 
			Integer authorId) {
		Article article = new Article();
		article.setId(id);
		article.setTitle(title);
		article.setContent(content);
		article.setSource(source);
		article.setCategoryId(categoryId);
		article.setAuthorId(authorId);
		articleService.saveOrUpdate(article);
		return MessageUtil.success("更新成功");
	}
}
