package com.example.demo.app.validation;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class UserForm{

	public UserForm() {

	}

	@Size(min = 1, max=7, message="1文字～７文字で入力してください")
	@NotBlank
	private String code;

	@Size(min = 8, max=200, message="8文字～200文字で入力してください")
	@NotBlank
	private String password;

	@Size(min=1,max=40,message="1文字～40文字で入力してください")
	@NotBlank
	private String name;

	@Size(min=1, max=80,message="1文字～40文字で入力してください")
	@NotBlank
	private String kname;

	@Size(min=7, max=7,message="7文字で入力してください")
	@NotBlank
	private String postcd;

	@Size(min=1, max=100,message="1文字～100文字で入力してください")
	@NotBlank
	private String address;

	@Size(min=1, max=13,message="1文字～13文字で入力してください")
	@NotBlank
	private String tel;

	@Size(min=1, max=400,message="1文字～400文字で入力してください")
	@NotBlank
	private String email;

}

