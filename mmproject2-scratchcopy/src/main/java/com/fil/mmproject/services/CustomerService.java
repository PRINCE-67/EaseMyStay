package com.fil.mmproject.services;

import java.util.List;

import com.fil.mmproject.models.Customer;

public interface CustomerService {

	List<Customer> getAllCustomers();

	Customer getCustomerById(long customerId);

	Customer updateCustomer(long customerId, Customer updatedCustomer);

	void deleteCustomer(long customerId);

	Customer createCustomer(Customer customer);
}