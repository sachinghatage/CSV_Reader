package com.csvreader;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.csvreader.beans.CsvReader;
import com.csvreader.model.Product;

@SpringBootApplication
public class SpringBootCsvReaderAppApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootCsvReaderAppApplication.class, args);
		CsvReader csvReader = context.getBean(CsvReader.class);
		List<Product> filteredProducts = csvReader.readAndFilterProductsData();
		filteredProducts.forEach(System.out::println);
	}

}
