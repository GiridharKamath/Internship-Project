package com.intership.dlithe.dlitheProjectMall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public Product newadd(Product product)
	{
		return repo.save(product);
	}
	
	public List<Product> every()
	{
		return repo.findAll();
	}
	
	public Product single(int id)
	{
		return repo.findById(id).orElse(new Product());
	}

	public Product alter(Product product)
	{
		return repo.save(product);
	}
	
	public String remove(Product product)
	{
		String model=product.getPname();
		repo.delete(product);
		return model;
	}
}
