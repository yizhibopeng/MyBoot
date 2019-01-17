package com.sysyu.cmis.dao;

import com.sysyu.cmis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user_list where id=#{id}")
    User findById(@Param("id") long id);
    @Select("select * from user_list")
    List<User> findUserList();
}
