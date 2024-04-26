package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.shop.exception.ProductException;
import com.shop.model.Category;
import com.shop.model.Product;
import com.shop.repository.CategoryRepository;
import com.shop.repository.ProductRepository;
import com.shop.request.CreateProductRequest;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Product createProduct(CreateProductRequest req) {
		Category topLavel = categoryRepository.findByName(req.getTopLavelCategory());
		
		if(topLavel == null) {
			Category topLavelCategory = new Category();
			topLavelCategory.setName(req.getThirdLavelCategory());
			topLavelCategory.setLevel(1);
			
			topLavel = categoryRepository.save(topLavelCategory);
		}
		
		Category secondLavel = categoryRepository.findByName(req.getTopLavelCategory());
		
		if(secondLavel == null) {
			Category secondLavelCategory = new Category();
			secondLavelCategory.setName(req.getThirdLavelCategory());
			secondLavelCategory.setLevel(1);
			
			secondLavel = categoryRepository.save(secondLavelCategory);
		}
		
		Category thirdLavel = categoryRepository.findByName(req.getTopLavelCategory());
		
		if(thirdLavel == null) {
			Category thirdLavelCategory = new Category();
			thirdLavelCategory.setName(req.getThirdLavelCategory());
			thirdLavelCategory.setLevel(1);
			
			thirdLavel = categoryRepository.save(thirdLavelCategory);
		}
		return null;
	}

	@Override
	public String deleteProduct(Long productId) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Long productId, Product product) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findProductById(Long id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findProductByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Product> getAllProduct(String category, List<String> colors, List<String> sizes, Integer minPrice,
			Integer maxPrice, Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSizw) {
		// TODO Auto-generated method stub
		return null;
	}

}
