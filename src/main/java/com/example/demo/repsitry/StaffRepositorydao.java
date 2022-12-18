package com.example.demo.repsitry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Mst_staff;

@Repository
public interface StaffRepositorydao extends JpaRepository<Mst_staff, String>{

	List<Mst_staff> findBystaffNm(String staff_nm);

	Mst_staff findBystaffCd(String staffCd);


//	List<Mst_staff> findById(String id);

//	List<Mst_staff> seachByword(String word);
//
//	Optional<Mst_staff> selectOneUser(String code);
//
//	void insert_staff(Mst_staff staff);
//
//	void update_staff(Mst_staff staff);
//
//	void delete_staff(String code);

}
