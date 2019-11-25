/**
 * FileName: UserServiceImpl
 * Author:   xuzhenghao
 * Date:     2019/11/25 11:18
 * Description: User服务操作
 */
package com.xzh.blog.serviceImpl;

import com.xzh.blog.dao.UserDao;
import com.xzh.blog.entity.User;
import com.xzh.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈User服务操作〉
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByID(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
}
