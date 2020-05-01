package com.briup.service;

import java.util.List;

import com.briup.bean.Privilege;
import com.briup.util.CustomerException;
import com.briup.vm.PrivilegeTree;

public interface IPrivilegeService {
	List<Privilege> findAll();
    
    List<Privilege> findByParentId(Integer parentId);
    
    void saveOrUpdate(Privilege privilege) throws CustomerException;

    List<PrivilegeTree> findPrivilegeTree();
    
    void deleteById(Integer id) throws CustomerException;
    
    List<Privilege> findByUserId(Integer id);
    
    /**
     * @Description: 查询用户所有菜单
     */
    List<Privilege> findMenuByUserId(Integer id);
}
