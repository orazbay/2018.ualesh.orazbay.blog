package kz.sdu.blog.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.*;
import kz.sdu.blog.register.Response;
import kz.sdu.blog.register.TestRegister;
import kz.sdu.blog.utils.Controller;


@Bean
public class TestController implements Controller{
    public BeanGetter<TestRegister> testRegisterBeans;

    public static class User{
        String username;
        String password;
    }

    @ToJson
    @AsIs
    @Mapping("/getMainText")
    public Response getText(@Par("username") String username, @Par("password") String password){
        return testRegisterBeans.get().login(username,password);
    }

}
