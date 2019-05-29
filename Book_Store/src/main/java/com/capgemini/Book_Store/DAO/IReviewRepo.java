package com.capgemini.Book_Store.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Book_Store.bean.Customer;
import com.capgemini.Book_Store.bean.Review;

public interface IReviewRepo extends JpaRepository<Review, Integer>{
	
	Customer findByCustomer(Customer customer);

}
