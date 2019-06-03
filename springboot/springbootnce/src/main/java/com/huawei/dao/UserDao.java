package com.huawei.dao;

import com.huawei.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
     List<User> findAll();
}
