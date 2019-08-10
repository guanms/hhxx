package com.gms.user.service.impl;

import com.gms.user.dao.UsersMapper;
import com.gms.user.entity.Users;
import com.gms.user.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users findById(Long id) {
        Users users = new Users();
        users = this.usersMapper.selectByPrimaryKey(id);
        return users;
    }
}
