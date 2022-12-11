package com.example.demo.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Trx_item_stock{
	private String item_cd;

	private String stock_no;

	private double in_num;

	private double out_num;

	private double pre_out_num;

	private double dispose_num;

	private double stock_buy_unit;

	private LocalDateTime expiry_date;

	private LocalDateTime create_date;

	private String create_staff;

	private LocalDateTime modify_date;

	private String modify_staff;

}
