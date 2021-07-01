package com.elltor.consumer;

import com.elltor.api.IUserService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserInit implements CommandLineRunner {

    @Reference(version = "1.0",parameters = {"unicast","false"})
    private IUserService userService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(userService.selectUserById(12));
    }
}
