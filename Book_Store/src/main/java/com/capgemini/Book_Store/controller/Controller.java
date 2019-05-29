package com.capgemini.Book_Store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Book_Store.bean.Book;
import com.capgemini.Book_Store.bean.Category;
import com.capgemini.Book_Store.bean.Customer;
import com.capgemini.Book_Store.service.IAdminService;

@RestController
public class Controller {
	
	@Autowired
	IAdminService iAdminService;
	
	@RequestMapping(value = "/showAllCustomers", method=RequestMethod.GET)
	public List<Customer> showAllCustomer()
	{
		return iAdminService.showAllCustomer();
		
	}
	
	@RequestMapping(value="/deleteCustomer/{customerId}", method=RequestMethod.DELETE)
	public boolean deleteCustomer(@PathVariable int customerId) {
		
		
		return iAdminService.deleteCustomer(customerId);
	}
	
	@RequestMapping(value="/createCustomer", method=RequestMethod.PUT)
	public Customer createCustomer(@RequestBody Customer customer ) 
	{
	return iAdminService.createCustomer(customer);
	}
	
	@RequestMapping(value="/updateCustomer",method=RequestMethod.PUT)
	public boolean updateCustomer(@RequestBody Customer customer)
	{
		return iAdminService.updateCustomer(customer);
	}
	
	

	@RequestMapping(value = "/showAllCategory", method=RequestMethod.GET)
	public List<Category> showAllCategory()
	{
		return iAdminService.showAllCategory();
		
	}
	
	@RequestMapping(value="/deleteCategory", method=RequestMethod.DELETE)
	public boolean deleteCategory(@PathVariable int categoryId) {
		
		
		return iAdminService.deleteCategory(categoryId);
	}
	
	@RequestMapping(value="/createCategory", method=RequestMethod.POST)
	public Category createCategory(@RequestBody Category category ) 
	{
	return iAdminService.createCategory(category);
	}
	
	@RequestMapping(value="/updateCategory",method=RequestMethod.PUT)
	public Category updateCategory(@PathVariable String categoryName, @PathVariable String upCategoryName)
	{
		return iAdminService.updateCategory(categoryName,upCategoryName);
	}
	
	@RequestMapping(value="/searchByCategory", method=RequestMethod.GET)
	public List<Book> searchByCategory(@PathVariable String categoryName){
		return iAdminService.searchByCategory(categoryName);
	}
	
	
}
