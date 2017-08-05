package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.UserMapper;
import com.kindArt.manager.domain.User;
import com.kindArt.manager.service.IUserService;


@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserMapper userDao;  
    @Override  
    public User getUserById(int userId) {  
        
        return this.userDao.selectByPrimaryKey(userId); 
    }
}
