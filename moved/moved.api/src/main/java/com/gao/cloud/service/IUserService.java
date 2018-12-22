package com.gao.cloud.service;

import com.gao.cloud.UserVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(path = "/user", method = RequestMethod.GET)
public interface IUserService {

    @RequestMapping("/{id}")
    UserVO findUserById(Long id);
}
