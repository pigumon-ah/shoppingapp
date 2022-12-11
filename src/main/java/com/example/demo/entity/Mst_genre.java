package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="mst_genre")
public class Mst_genre {

	@Id
	@Column(name="genre_cd", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String genre_cd;

	@Column(name="genre_nm" ,nullable=false)
	private String genre_nm;

	@Column(name="use_flg", nullable=false)
	private int use_flg;

	@Column(name="create_date")
	private LocalDateTime create_date;

	@Column(name="create_staff")
	private String create_staff;

	@Column(name="modify_date")
	private LocalDateTime modify_date;

	@Column(name="modify_staff")
	private String modify_staff;

}
