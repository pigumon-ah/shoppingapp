package com.example.demo.entity;

import java.time.LocalDateTime;

import lombok.Data;


@Data
public class Trx_order_send{

	private String order_no;

	private String order_detail_no;

	private String order_send_no;

	private String send_states;

	private LocalDateTime send_date;

	private String send_no;

	private String send_company;

	private LocalDateTime modify_date;

	private String modify_staff;

}
