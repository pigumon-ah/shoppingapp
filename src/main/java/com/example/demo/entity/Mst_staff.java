package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="mst_staff")
@Data
public class Mst_staff{

	@Id
	@Column(name="staff_cd", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String staff_cd;

	@Column(name="staff_pw", nullable=false)
	private String staff_pw;

	@Column(name="staff_nm")
	private String staff_nm;

	@Column(name="staff_kn")
	private String staff_kn;

	@Column(name="staff_post_cd")
	private String staff_post_cd;

	@Column(name="staff_address")
	private String staff_address;

	@Column(name="staff_tel")
	private String staff_tel;

	@Column(name="staff_email")
	private String staff_email;

	@Column(name="use_flg", nullable=false)
	private String use_flg;

	@Column(name="create_date")
	private LocalDateTime create_date;

	@Column(name="create_staff")
	private String create_staff;

	@Column(name="modify_date")
	private LocalDateTime modify_date;

	@Column(name="modify_staff")
	private String modify_staff;
}
