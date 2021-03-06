package com.capgemini.Book_Store.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {
	
	@Id
	@GeneratedValue(generator="category",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="category",sequenceName="3",initialValue=100,allocationSize=1)
	private int categoryId;
	
	private String categoryName;


	
	public int getCategoryId() {
		return categoryId;
	}

	/*public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}*/

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	};
	

}