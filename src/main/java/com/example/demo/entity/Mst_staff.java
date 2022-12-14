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
@Table(name="MstStaff")
@Data
public class Mst_staff{

	@Id
	@Column(name="staffCd", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String staffCd;

	@Column(name="staffPw", nullable=false)
	private String staffPw;

	@Column(name="staffNm")
	private String staffNm;

	@Column(name="staffKn")
	private String staffKn;

	@Column(name="staffPostCd")
	private String staffPostCd;

	@Column(name="staffAddress")
	private String staffAddress;

	@Column(name="staffTel")
	private String staffTel;

	@Column(name="staffEmail")
	private String staffEmail;

	@Column(name="useFlg", nullable=false)
	private String useFlg;

	@Column(name="createDate")
	private LocalDateTime createDate;

	@Column(name="createStaff")
	private String createStaff;

	@Column(name="modifyDate")
	private LocalDateTime modifydate;

	@Column(name="modifyStaff")
	private String modifystaff;
}
