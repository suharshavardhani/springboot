package com.harsha.customer.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.harsha.customer.dal.entities.Customer;
import com.harsha.customer.dal.repository.CustomerRepository;

@SpringBootTest
class CustomerdalApplicationTests {
	
	@Autowired
	private CustomerRepository repo;

	@Test
	void testInsertCustomerData() {
		Customer cust =  new Customer();
		cust.setName("leonard");
		cust.setEmail("leonard@gmail.com");
		repo.save(cust);
	}
	
	@Test
	void testUpdateCustomerData() {
		Customer cust = repo.findById(1l).get();
		cust.setEmail("lanny@gmail.com");
		repo.save(cust);
	}

}
