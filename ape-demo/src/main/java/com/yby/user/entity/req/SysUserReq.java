package com.yby.user.entity.req;

import com.yby.bean.PageRequest;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2022-09-10 21:14:44
 */
@Data
public class SysUserReq extends PageRequest implements Serializable {

    private Long id;
    
    private String name;
    
    private Integer age;
    
    private String createBy;
    
    private Date createTime;
    
    private String updateBy;
    
    private Date updateTime;
    
    private Integer deleteFlag;
    
    private Integer version;

}

