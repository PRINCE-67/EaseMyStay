package com.fil.mmproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fil.mmproject.models.Customer;
import com.fil.mmproject.repositories.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(long customerId) {
		return customerRepository.findById(customerId).orElse(null);
	}

	@Override
	public Customer updateCustomer(long customerId, Customer updatedCustomer) {
		if (customerRepository.existsById(customerId)) {
			updatedCustomer.setCustomerId(customerId);
			return customerRepository.save(updatedCustomer);
		}
		return null; // Return null if the customer with the given ID does not exist.
	}

	@Override
	public void deleteCustomer(long customerId) {
		customerRepository.deleteById(customerId);
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
}