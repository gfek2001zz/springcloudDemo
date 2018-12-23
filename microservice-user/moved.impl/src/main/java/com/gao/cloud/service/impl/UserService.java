package com.gao.cloud.service.impl;

import com.gao.cloud.UserVO;
import com.gao.cloud.dao.IUserDao;
import com.gao.cloud.service.IUserService;
import org.springframework.web.bind.annotation.PathVariable;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class UserService implements IUserService {

    @Inject
    private IUserDao userDao;


    public UserVO findUserById(@PathVariable Long id) {
        return userDao.findUserById(id);
    }
}
