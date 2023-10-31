package com.fil.easmystay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fil.easmystay.models.Customer;
import com.fil.easmystay.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/createCustomer")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable long customerId) {
		return customerService.getCustomerById(customerId);
	}

	@GetMapping("/getCustomers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@PutMapping("/{customerId}")
	public Customer updateCustomer(@PathVariable long customerId, @RequestBody Customer updatedCustomer) {
		return customerService.updateCustomer(customerId, updatedCustomer);
	}

	@DeleteMapping("/{customerId}")
	public void deleteCustomer(@PathVariable long id) {
		customerService.deleteCustomer(id);
	}
}
