package com.xzh.blog.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author xuzhenghao
 * @date 2019-11-25
 * 数据表tb_sys_user映射bean
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    /**
     * 主键ID
     * 列名:id 类型:INTEGER(10) 允许空:false 缺省值:null
     */
    private Integer id;

    /**
     * 账号
     * 列名:user_name 类型:VARCHAR(100) 允许空:true 缺省值:null
     */
    private String userName;

    /**
     * 登录密码
     * 列名:password 类型:VARCHAR(100) 允许空:true 缺省值:null
     */
    private String password;

    /**
     * 头像地址
     * 列名:avatar 类型:VARCHAR(255) 允许空:true 缺省值:null
     */
    private String avatar;

    /**
     * 昵称
     * 列名:nick_name 类型:VARCHAR(50) 允许空:true 缺省值:null
     */
    private String nickName;

    /**
     * 个性签名
     * 列名:autograph 类型:VARCHAR(255) 允许空:true 缺省值:这个人有点懒，什么都不想说。
     */
    private String autograph;

    /**
     * 性别（0保密，1男，2女）
     * 列名:gender 类型:VARCHAR(1) 允许空:true 缺省值:null
     */
    private String gender;

    /**
     * 手机号码
     * 列名:phone 类型:VARCHAR(11) 允许空:true 缺省值:null
     */
    private String phone;

    /**
     * 邮箱
     * 列名:email 类型:VARCHAR(50) 允许空:true 缺省值:null
     */
    private String email;

    /**
     * 状态（0正常，1冻结，2禁言）
     * 列名:status 类型:VARCHAR(1) 允许空:true 缺省值:null
     */
    private String status;

    /**
     * 盐值
     * 列名:salt 类型:VARCHAR(50) 允许空:true 缺省值:null
     */
    private String salt;

    /**
     * token
     * 列名:token 类型:VARCHAR(200) 允许空:true 缺省值:null
     */
    private String token;

    /**
     * QQ 第三方登录Oppen_ID唯一标识
     * 列名:oppen_id 类型:VARCHAR(100) 允许空:true 缺省值:null
     */
    private String oppenId;

    /**
     * 明文密码
     * 列名:pwd 类型:VARCHAR(100) 允许空:true 缺省值:null
     */
    private String pwd;

    /**
     * 创建时间
     * 列名:created_time 类型:TIMESTAMP(19) 允许空:true 缺省值:null
     */
    private LocalDateTime createdTime;

    /**
     * 上次登录时间
     * 列名:logined_time 类型:TIMESTAMP(19) 允许空:true 缺省值:null
     */
    private LocalDateTime loginedTime;

    /**
     * 更新时间
     * 列名:modified_time 类型:TIMESTAMP(19) 允许空:true 缺省值:null
     */
    private LocalDateTime modifiedTime;

    private static final long serialVersionUID = 1L;
}