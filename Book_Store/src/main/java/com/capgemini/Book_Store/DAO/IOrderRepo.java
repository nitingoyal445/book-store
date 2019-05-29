package com.capgemini.Book_Store.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Book_Store.bean.Customer;
import com.capgemini.Book_Store.bean.Order;

public interface IOrderRepo extends JpaRepository<Order, Integer> {

	Customer findByCustomer(Customer customer);
}
