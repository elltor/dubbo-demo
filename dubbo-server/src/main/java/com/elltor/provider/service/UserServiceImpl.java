package com.elltor.provider.service;


import com.elltor.api.IUserService;
import com.elltor.api.User;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0")
public class UserServiceImpl implements IUserService {

    @Override
    public User selectUserById(Integer id) {
        User u = new User();
        u.setId(id);
        u.setName("zhangsan");
        return u;
    }
}
