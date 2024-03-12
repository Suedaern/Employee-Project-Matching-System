package com.example.employee.service;

import com.example.employee.dto.UserDto;
import com.example.employee.entity.User;

public interface UserService
{
    UserDto getUserById(int id);
    String addUser(User user);
    String updateUserById(int id,User user);
    String deleteUserById(int id);
}
