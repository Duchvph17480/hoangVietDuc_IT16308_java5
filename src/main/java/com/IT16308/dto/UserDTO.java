package com.IT16308.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import lombok.Data;
@Data
public class UserDTO {
	private Integer id;
	
	@NotNull
	@NotBlank
	private String username;
	
	@NotNull
	@NotBlank
	@Email
	private String email;
	

	private String password;
	
	@NotNull
	@NotBlank
	private String photo;

	@NotNull
	private Integer activated;
	
	@NotNull
	private Integer admin;

}
