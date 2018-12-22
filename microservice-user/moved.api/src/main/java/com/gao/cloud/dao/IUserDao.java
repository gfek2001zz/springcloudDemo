package com.gao.cloud.dao;

import com.gao.cloud.UserVO;

public interface IUserDao {

    UserVO findUserById(Long id);
}
