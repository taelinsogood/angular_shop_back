package com.shop.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.shop.exception.ProductException;
import com.shop.model.Product;
import com.shop.request.CreateProductRequest;

public interface ProductService {
	
	public Product createProduct(CreateProductRequest req);
	
	public String deleteProduct(Long productId) throws ProductException;
	
	public Product updateProduct(Long productId, Product product) throws ProductException;

	public Product findProductById(Long id) throws ProductException;
	
	public List<Product> findProductByCategory(String category);
	
	public Page<Product> getAllProduct(String category, List<String> colors, List<String> sizes, Integer minPrice, Integer maxPrice,
			Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSizw);
}