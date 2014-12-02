package com.gdupt.usersys.entity;

public class User {
    private Integer id;

    private String name;

    private String password;

    private String email;

    private String phone;

    private String remark;
    
    /**
     * 无参构造方法
     */
    public User() {
    	
	}
    
    /**
     * 参数为用户名name和密码password的构造方法
     * 主要用来登陆验证
     * @param name 用户名
     * @param password 密码
     */
    public User(String name,String password){
    	this.name=name;
    	this.password=password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}