package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;



public interface Categoryrepository extends JpaRepository<Category, Long> {

}
