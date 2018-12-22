package com.gao.cloud.service.impl;

import com.gao.cloud.UserVO;
import com.gao.cloud.dao.IUserDao;
import com.gao.cloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public UserVO findUserById(@PathVariable Long id) {
        return userDao.findUserById(id);
    }
}
