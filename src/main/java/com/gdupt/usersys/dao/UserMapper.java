package com.gdupt.usersys.dao;

import java.util.List;
import com.gdupt.usersys.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    /**
     * 根据主键id查找指定用户记录
     * @param id 主键
     * @return
     */
    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    /**
     * 得到所有用户记录
     * @return
     */
    List<User> selectAll();
    
    User getUserByNamePwd(User user);
}