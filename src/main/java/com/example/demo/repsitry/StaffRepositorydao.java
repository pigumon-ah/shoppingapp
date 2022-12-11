package com.example.demo.repsitry;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Mst_staff;

@Repository
public interface StaffRepositorydao extends JpaRepository<Mst_staff, String>{


	Optional<Mst_staff> findById(String staff_cd);

	List<Mst_staff> findAll();




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
