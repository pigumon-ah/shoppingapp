package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Mst_staff;
import com.example.demo.repsitry.StaffRepositorydao;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StaffService {

	private final StaffRepositorydao staffrepository;

	public Optional<Mst_staff> findById(String code){//認証
		return staffrepository.findById(code);
	}

	public List<Mst_staff> findAll() {
		return staffrepository.findAll();
	}

	public List<Mst_staff> findBystaffNm(String staffNm) {
		return staffrepository.findBystaffNm(staffNm);
	}

	public Mst_staff findBystaffCd(String staffCd) {
		return staffrepository.findBystaffCd(staffCd);
	}

}
