package com.capgemini.Book_Store.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Book_Store.bean.Book;
import com.capgemini.Book_Store.bean.Category;

public interface ICategoryRepo extends JpaRepository<Category, Integer> {
	
	
}
