package com.capgemini.Book_Store.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Book_Store.bean.Admin;

public interface IAdminRepo extends JpaRepository<Admin, Integer> {


}
