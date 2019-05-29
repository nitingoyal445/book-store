package com.capgemini.Book_Store.DAO;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Book_Store.bean.Book;
import com.capgemini.Book_Store.bean.Category;

public interface IBookRepo extends JpaRepository<Book, Integer> {

	Category findByCategory(Category category);
	List<Book> findByCategory(String categoryName);
}
