package com.example.demo.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ProductDetailsDao;

@Component
public class BySize implements GroupBy{

	@Autowired
	ProductDetailsDao productDetailsDao;
	
	@Override
	public List<Object[]> group() {
		// TODO Auto-generated method stub
		return productDetailsDao.findProductDetailsGroupBySize();
	}

}
