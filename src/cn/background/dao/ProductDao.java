package cn.background.dao;

import java.util.List;

import cn.domain.Product;

public interface ProductDao {

	List<Product> display();

	void save(Product product);

}
