package com.gao.cloud;

import com.gao.cloud.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieService implements IMovieService {

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public UserVO findUserById(@PathVariable Long id) {
        return restTemplate.getForObject("http://localhost:8000/user/" + id, UserVO.class);
    }
}
