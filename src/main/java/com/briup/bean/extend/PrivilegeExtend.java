package com.briup.bean.extend;

import java.util.List;

import com.briup.bean.Privilege;

public class PrivilegeExtend extends Privilege {
    private List<Privilege> children;

    public List<Privilege> getChildren() {
        return children;
    }

    public void setChildren(List<Privilege> children) {
        this.children = children;
    }
}