package com.example.demo.repsitry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Mst_genre;

@Repository
public interface GenreRepository extends JpaRepository<Mst_genre, String>{

	List<Mst_genre> findAll();
}
