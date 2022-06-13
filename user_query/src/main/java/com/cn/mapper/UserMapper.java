package com.cn.mapper;

import com.cn.domain.LoginUser;
import com.cn.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper {
    //DQL
    @Select("select * from user")
    List<User> findAll();
    @Select("select * from user where id=#{id}")
    User find(int id);
    @Select("select * from user where name=#{name} or address=#{address} or email=#{email}")
    List<User> findByNameAndAddressAndEmail(String name,String address,String email);
    @Select("select * from loginuser where username=#{username} and password=#{password}")
    LoginUser login(LoginUser loginUser);
    //DML
    @Insert("INSERT INTO user VALUES(#{id},#{name},#{sex},#{age},#{qq},#{address},#{email})")
    void insert(User user);
    @Delete("DELETE FROM user WHERE id=#{id}")
    void delete(int id);


    @Update("UPDATE user SET name=#{name},sex=#{sex},age=#{age},address=#{address},qq=#{qq},email=#{email} where id=#{id}")
    void update(User user);
}
