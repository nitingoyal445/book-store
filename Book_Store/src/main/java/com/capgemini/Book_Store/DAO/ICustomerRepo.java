package com.capgemini.Book_Store.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Book_Store.bean.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {
	
	Customer findByEmailId(String email);

}
