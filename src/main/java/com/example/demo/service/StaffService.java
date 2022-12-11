package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Mst_staff;
import com.example.demo.repsitry.StaffRepositorydao;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StaffService {

	private final StaffRepositorydao staffrepository;

	public Optional<Mst_staff> selectOneUser(String code){//認証
		return staffrepository.findById(code);
	}

}
