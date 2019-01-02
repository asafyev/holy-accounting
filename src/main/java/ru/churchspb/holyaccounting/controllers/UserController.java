package ru.churchspb.holyaccounting.controllers;

import accounting.beans.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping
    public User createNewUser(@RequestBody User user) {
        return null;
    }

}
