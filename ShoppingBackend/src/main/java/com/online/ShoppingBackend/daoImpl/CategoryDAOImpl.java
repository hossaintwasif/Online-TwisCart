package com.online.ShoppingBackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.online.ShoppingBackend.dao.CategoryDAO;
import com.online.ShoppingBackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	static {

		Category category = new Category();

		// Adding first category
		category.setId(1);
		category.setName("Telivision");
		category.setDescription("This is some description for telivision");
		category.setImageURL("Cat_1.png");
		// category.setActive(false);

		categories.add(category);

		category = new Category();

		// Adding second category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for mobile");
		category.setImageURL("Phone_1.png");
		// category.setActive(false);

		categories.add(category);

		category = new Category();

		// Adding third category
		category.setId(3);
		category.setName("WebBook");
		category.setDescription("This is some description for WebBook");
		category.setImageURL("WebBook_1.png");
		// category.setActive(false);

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category:categories ) {
			if(category.getId()==id)
				return category;
		}
		return null;
	}

}
