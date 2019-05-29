package com.capgemini.Book_Store.service;

import java.util.List;

import com.capgemini.Book_Store.bean.Book;
import com.capgemini.Book_Store.bean.Category;
import com.capgemini.Book_Store.bean.Customer;

public interface IAdminService {

	
	List<Customer> showAllCustomer();

	
	boolean deleteCustomer(int customerId);

	
	Customer createCustomer(Customer customer);

	
	boolean updateCustomer(Customer customer);


	List<Category> showAllCategory();

	
	boolean deleteCategory(int categoryId);

	
	Category createCategory(Category category);

	
	Category updateCategory(String categoryName, String upcategoryName);


	List<Book> searchByCategory(String categoryName);

}