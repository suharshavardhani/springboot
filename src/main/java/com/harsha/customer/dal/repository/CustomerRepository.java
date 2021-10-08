package com.harsha.customer.dal.repository;

import org.springframework.data.repository.CrudRepository;

import com.harsha.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
