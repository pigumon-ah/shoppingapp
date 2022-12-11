package com.example.demo.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Trx_order{
	private String order_no;

	private String order_nm;

	private String order_kn;

	private String order_post_cd;

	private String order_address;

	private String order_tel;

	private String order_email;

	private String send_nm;

	private String send_kn;

	private String send_post_cd;

	private String send_address;

	private String send_tel;

	private String order_states;

	private double order_amnt;

	private LocalDateTime order_date;

	private LocalDateTime modify_date;

	private String modify_staff;
}