package com.example.mybatisplus.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author test
 * @since 2019-01-07
 */
@RestController
@RequestMapping("/api")
@Api(description = "用户管理")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @GetMapping(value="user")
    @ApiOperation(value = "查询")
    @ResponseBody
    public IPage<User> list(User user){
        IPage<User> page = new Page<>(1,10);
        QueryWrapper<User> wrapper = new QueryWrapper<User>().like("name",user.getName());
        return userService.page(page);
    }

    @PutMapping(value="user")
    @ApiOperation(value = "新建")
    @ResponseBody
    public boolean save(User user){
        return userService.save(user);
    }

    @PostMapping(value="user")
    @ApiOperation(value = "修改")
    @ResponseBody
    public boolean update(User user){
        return userService.updateById(user);
    }

    @DeleteMapping(value="user")
    @ApiOperation(value="删除",notes = "根据id删除")
    @ResponseBody
    public boolean delete(Integer id){
       return userService.removeById(id);
    }

}
