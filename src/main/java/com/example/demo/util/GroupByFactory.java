package com.example.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GroupByFactory {

	@Autowired
	ByDefault byDefault;
	
	@Autowired
	ByBrand byBrand;
	
	@Autowired
	ByColor byColor;
	
	@Autowired
	ByPrice byPrice;
	
	@Autowired
	BySeller bySeller;
	
	@Autowired
	BySize bySize;
	
	public GroupBy getGroupClause(String groupBy) {
		if (groupBy == null) {
			return byDefault;
		} else if (groupBy.equalsIgnoreCase("by-brand")) {
			return byBrand;
		} else if (groupBy.equalsIgnoreCase("by-color")) {
			return byColor;
		} else if (groupBy.equalsIgnoreCase("by-price")) {
			return byPrice;
		} else if (groupBy.equalsIgnoreCase("by-seller")) {
			return bySeller;
		} else if (groupBy.equalsIgnoreCase("by-size")) {
			return bySize;
		}
		return byDefault;
	}
}
