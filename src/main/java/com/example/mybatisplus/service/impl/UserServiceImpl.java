package com.example.mybatisplus.service.impl;

import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.mapper.UserMapper;
import com.example.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author test
 * @since 2019-01-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
