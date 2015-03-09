package com.gdupt.usersys.dao;

import com.gdupt.usersys.entity.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}