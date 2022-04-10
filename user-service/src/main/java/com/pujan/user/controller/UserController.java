package com.pujan.user.controller;


import com.pujan.user.VO.ResponseTemplateVO;
import com.pujan.user.entiry.User;
import com.pujan.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping()
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);

    }


}
