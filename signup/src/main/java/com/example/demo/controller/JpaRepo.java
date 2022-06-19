package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRepo extends JpaRepository<MyModal,Integer> {
	

}
