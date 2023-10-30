package com.online.ShoppingBackend.dao;

import java.util.List;

import com.online.ShoppingBackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
