package cn.background.service;

import java.util.List;

import cn.domain.Product;

public interface ProductService {

	List<Product> display();

	void save(Product product);

}
