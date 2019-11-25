package com.xzh.blog.dao;

import com.xzh.blog.entity.User;
import com.xzh.blog.entity.UserQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @author xuzhenghao

* @date 2019-11-25

* org.mybatis.generator.api.dom.java.Interface
*/
public interface UserDao {
    /**
	* 
	* 描述： 
	* @param example
	* @return long
	*/
    long countByExample(UserQuery example);

    /**
	* 
	* 描述： 
	* @param example
	* @return int
	*/
    int deleteByExample(UserQuery example);

    /**
	* 
	* 描述： 
	* @param id
	* @return int
	*/
    int deleteByPrimaryKey(Integer id);

    /**
	* 
	* 描述： 
	* @param record
	* @return int
	*/
    int insert(User record);

    /**
	* 
	* 描述： 
	* @param record
	* @return int
	*/
    int insertSelective(User record);

    /**
	* 
	* 描述： 
	* @param example
	* @return java.util.List<com.xzh.blog.entity.User>
	*/
    List<User> selectByExample(UserQuery example);

    /**
	* 
	* 描述： 
	* @param id
	* @return com.xzh.blog.entity.User
	*/
    User selectByPrimaryKey(Integer id);

    /**
	* 
	* 描述： 
	* @param record
	* @param example
	* @return int
	*/
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserQuery example);

    /**
	* 
	* 描述： 
	* @param record
	* @param example
	* @return int
	*/
    int updateByExample(@Param("record") User record, @Param("example") UserQuery example);

    /**
	* 
	* 描述： 
	* @param record
	* @return int
	*/
    int updateByPrimaryKeySelective(User record);

    /**
	* 
	* 描述： 
	* @param record
	* @return int
	*/
    int updateByPrimaryKey(User record);
}