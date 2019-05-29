package com.capgemini.Book_Store.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Book_Store.bean.Book;
import com.capgemini.Book_Store.bean.Category;
import com.capgemini.Book_Store.bean.Customer;
import com.capgemini.Book_Store.DAO.IBookRepo;
import com.capgemini.Book_Store.DAO.ICategoryRepo;
import com.capgemini.Book_Store.DAO.ICustomerRepo;
import com.capgemini.Book_Store.DAO.IOrderRepo;
import com.capgemini.Book_Store.DAO.IReviewRepo;

@Service
public class AdminServiceImpl implements IAdminService {

	
	@Autowired
	IAdminService iAdminService;
	
	@Autowired
	ICustomerRepo customerRepo;
	
	@Autowired 
	ICategoryRepo categoryRepo;
	
	@Autowired
	IOrderRepo orderRepo;
	
	@Autowired
	IReviewRepo reviewRepo;
	
	@Autowired
	IBookRepo bookRepo;
	

	@Override
	public List<Customer> showAllCustomer()
	{
		
		return customerRepo.findAll();
	}
	
	
	@Override
	public boolean deleteCustomer(int customerId) {
		
		if(reviewRepo.findByCustomer(customerRepo.findById(customerId).get()) != null  || orderRepo.findByCustomer(customerRepo.findById(customerId).get())!=null) 
		{  return false;  }
		customerRepo.deleteById(customerId);
		return true;
	}
	
	
	@Override
	public Customer createCustomer(Customer customer) {
		if(customerRepo.findByEmailId(customer.getEmailId()) != null) {
			return null;
		}
		return customerRepo.save(customer);
	}
	
	
	@Override
	public boolean updateCustomer(Customer customer) {
		
		Customer cust=customerRepo.findById(customer.getCustomerId()).get();
		cust.setCustomerName(customer.getCustomerName());
		cust.setCity(customer.getCity());
		cust.setCountry(customer.getCountry());
		cust.setMobileNumber(customer.getMobileNumber());
		cust.setZipcode(customer.getZipcode());
		cust.setAddress(customer.getAddress());
		if(customerRepo.findByEmailId(customer.getEmailId()) == null) {
			cust.setEmailId(cust.getEmailId());
		}
		cust.setEmailId(customer.getEmailId());
		cust.setPassword(customer.getPassword());
		customerRepo.save(cust);
		return true;
		
	}
	
	
	@Override
	public List<Category> showAllCategory()
	{
		List<Category> li= categoryRepo.findAll();
		return li;
	}
	
	
	@Override
	public boolean deleteCategory(int categoryId) {
		
		if(bookRepo.findByCategory(categoryRepo.findById(categoryId).get()) != null) {
			return false;
		}
		categoryRepo.deleteById(categoryId);
		return true;
	}
	
	@Override
	public Category createCategory(Category category) {
		
		return categoryRepo.save(category);
	}
	
	
	@Override
	public Category updateCategory(String categoryName, String upcategoryName) {
		
		List<Category> li = categoryRepo.findAll();
		for(Category c : li)
		{
			if(c.getCategoryName().equals(categoryName))
			{
				c.setCategoryName(upcategoryName);
			}
		}
		return null;
		
		
	}
	@Override
	public List<Book> searchByCategory(String categoryName){
				
		return bookRepo.findByCategory(categoryName);
		
		
	}

}
