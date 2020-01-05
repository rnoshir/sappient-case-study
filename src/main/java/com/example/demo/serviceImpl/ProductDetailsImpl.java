package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import com.example.demo.service.ProductDetails;
import com.example.demo.util.GroupBy;
import com.example.demo.util.GroupByFactory;

@Service("productDetails")
@RequestScope
public class ProductDetailsImpl implements ProductDetails {
	
	@Autowired
	GroupByFactory factory;
	@Override
	public List<?> getProductDetails(String groupBy) {
		
		GroupBy groupClause = factory.getGroupClause(groupBy);
		
		List<Object[]> findProductDetails = groupClause.group();
		
		return findProductDetails;
	}

}
