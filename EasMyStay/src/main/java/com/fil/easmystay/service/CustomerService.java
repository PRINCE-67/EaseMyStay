package com.fil.easmystay.service;

import java.util.List;

import com.fil.easmystay.models.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers();

	public Customer getCustomerById(long customerId);

	public Customer updateCustomer(long customerId, Customer updatedCustomer);

	public void deleteCustomer(long customerId);

	public Customer createCustomer(Customer customer);

}