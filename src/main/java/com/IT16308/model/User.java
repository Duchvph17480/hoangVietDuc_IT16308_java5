package com.IT16308.model;

import java.util.Date;

import lombok.Data;
@Data
public class User {
	private Integer id;
	private String name;
	private String studentCode;
	private String email;
	private String password;
	private String passwordConfirm;
	private Date dob;
	private String avatar;
	private Integer role;
	private Integer gender;
	private Integer status;

}
