package com.example.demo.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Trx_order_detail{
	private String order_no;

	private String order_detail_no;

	private String item_cd;

	private String stock_no;

	private double order_num;

	private double order_amnt;

	private LocalDateTime modify_date;

	private String modify_staff;


}