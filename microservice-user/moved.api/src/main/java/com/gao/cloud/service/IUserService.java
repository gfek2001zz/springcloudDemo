package com.gao.cloud.service;

import com.gao.cloud.UserVO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/user")
@Produces({MediaType.APPLICATION_JSON})
public interface IUserService {

    @GET
    @Path("/{id}")
    UserVO findUserById(@PathParam("id") Long id);
}
