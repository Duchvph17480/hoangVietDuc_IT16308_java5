package com.IT16308.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import lombok.Data;
@Data
public class User {
	@Null
	private Integer id;
	
	@NotNull
	@NotBlank
	private String name;
	
	@NotNull
	@NotBlank
	private String studentCode;
	
	@NotNull
	@NotBlank
	@Email
	private String email;
	
	@NotNull
	@NotBlank
	private String password;
	
	@NotNull
	@NotBlank
	private String passwordConfirm;
	
	@NotNull
	private Date dob;
	
	@NotNull
	@NotBlank
	private String avatar;
	
	@NotNull
	private Integer role;
	
	@NotNull
	private Integer gender;
	
	@NotNull
	private Integer status;

}
