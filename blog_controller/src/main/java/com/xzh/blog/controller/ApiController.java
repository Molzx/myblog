/**
 * FileName: ApiController
 * Author:   xuzhenghao
 * Date:     2019/11/25 10:23
 * Description: API测试
 */
package com.xzh.blog.controller;

import com.xzh.blog.entity.User;
import com.xzh.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈API测试〉
 *
 */
@RestController
@RequestMapping("api")
public class ApiController {

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public User findById(){
        User a=userService.findByID(1);
        return a;
    }


}
