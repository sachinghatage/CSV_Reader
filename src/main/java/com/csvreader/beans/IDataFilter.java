package com.csvreader.beans;

import java.util.List;

import com.csvreader.model.Product;

public interface IDataFilter {

	public List<Product> filterProducts(List<Product> products);

}
