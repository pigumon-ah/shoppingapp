package com.example.demo.entity;

import java.time.LocalDateTime;

import lombok.Data;


@Data
public class Trx_order_pay{
	private String order_no;

	private String pay_no;

	private String pay_states;

	private String pay_method;

	private LocalDateTime pay_date;

	private double pay_amnt;

	private String card_no;

	private String card_nm;

	private String card_limit;

	private LocalDateTime modify_date;

	private String modify_staff;

}
