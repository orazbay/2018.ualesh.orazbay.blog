package kz.sdu.blog.register_impl;

import kz.greetgo.depinject.core.Bean;
import kz.sdu.blog.register.Response;
import kz.sdu.blog.register.TestRegister;
import kz.sdu.blog.register.User;


@Bean
public class TestRegisterImpl implements TestRegister{
    private User[] registeredUsers=new User[]{
            new User("orazbay","qwerty"),
            new User("manr","123"),
            new User("nurkanat","karim")

    };

    @Override
    public Response login(String username, String password) {
        Response response=new Response();
        response.setResponseCode(Response.RESPONSE_CODE_FAIL);
        response.setResponseMessage(Response.RESPONSE_MESSAGE_NOT_REGISTERED_YET);
        for (User userI:registeredUsers){
            if (username.equals(userI.getUsername())){
                if (password.equals(userI.getPassword())){
                    response.setResponseCode(Response.RESPONSE_CODE_SUCCESS);
                    response.setResponseMessage(String.format(Response.RESPONSE_MESSAGE_SUCCESS,username));
                }else {
                    response.setResponseCode(Response.RESPONSE_CODE_FAIL);
                    response.setResponseMessage(Response.RESPONSE_MESSAGE_INVALID_PASSWORD);
                }
                break;
            }
        }
        return response;
    }
}
