package com.example.employee.controller;

import com.example.employee.entity.User;
import com.example.employee.dto.UserDto;
import com.example.employee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController
{
    private final UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService=userService;
    }
    @GetMapping("get")
    public UserDto getUserById(@RequestParam int id)
    {
        return userService.getUserById(id);
    }
    @PostMapping("add")
    public String addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }
    @PutMapping("update")
    public String updateUserById(@RequestParam int id, @RequestBody User user)
    {
        return userService.updateUserById(id,user);
    }
    @DeleteMapping("delete")
    public String deleteUserById(@RequestParam int id)
    {
        return userService.deleteUserById(id);
    }
}
