package com.csvreader.beans;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.csvreader.model.Product;

@Service
public class DataFilterImpl implements IDataFilter {

	@Override
	public List<Product> filterProducts(List<Product> products) {

		return products.stream().filter(p -> p.getProductPrice() > 1000).collect(Collectors.toList());
	}

}
