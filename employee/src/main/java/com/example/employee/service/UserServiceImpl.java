package com.example.employee.service;

import com.example.employee.dto.UserDto;
import com.example.employee.entity.User;
import com.example.employee.enums.MessagesEnum;
import com.example.employee.mapper.Mapper;
import com.example.employee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }
    @Override
    public UserDto getUserById(int id)
    {
        return Mapper.userDtoMapper(userRepository.findById(id).get());
    }
    @Override
    public String addUser(User user)
    {
        userRepository.save(user);
        return MessagesEnum.successfullyAdded.getValue();
    }
    @Override
    public String updateUserById(int id, User user)
    {
        User emp = userRepository.findById(id).get();
        if(user.getUserName()!=null)
        {
            emp.setUserName(user.getUserName());
        }
        if(user.getUserSurname()!=null)
        {
            emp.setUserSurname(user.getUserSurname());
        }
        userRepository.save(emp);
        return MessagesEnum.successfullyUpdated.getValue();
    }
    @Override
    public String deleteUserById(int id)
    {
        userRepository.deleteById(id);
        return MessagesEnum.successfullyDeleted.getValue();
    }

}
