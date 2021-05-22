package com.atguigu.mpdemo1010.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
public class User {

    //@TableId(type = IdType.ID_WORKER) //mp自带策略，生成19位值，数字类型使用这种策略，比如long
    //@TableId(type = IdType.ID_WORKER_STR) //mp自带策略，生成19位值，字符串类型使用这种策略
    private Long id;

    private String name;
    private Integer age;
    private String email;
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setAge(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setId(long l) {
		// TODO Auto-generated method stub
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}

    //create_time
//    @TableField(fill = FieldFill.INSERT)
//    private Date createTime;
//
//    //update_time
//    @TableField(fill = FieldFill.INSERT_UPDATE)
//    private Date updateTime;
//
//    @Version
//    @TableField(fill = FieldFill.INSERT)
//    private Integer version;//版本号
//
//    @TableLogic
//    private Integer deleted;
}
