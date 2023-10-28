package com.fil.mmproject.controller.customer;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fil.mmproject.models.Customer;
import com.fil.mmproject.repositories.CustomerRepo;

@RestController
@RequestMapping("/customers")
public class CustomerController {

private CustomerRepo customerRepo;
	
	@GetMapping("/getAllCustomers")
	@ResponseBody
	public Object getCustomers(Pageable pageable) {
		return customerRepo.findAll(pageable);
	}
	
	@PostMapping("/addCustomer")
	@ResponseBody
	public String addCustomer(@RequestBody Customer customer) {

		Customer customer1 = new Customer();
		customer1.setAdmin(customer.getAdmin());
		customer1.setCustomerEmail(customer.getCustomerEmail());
		customer1.setCustomerId(customer.getCustomerId());
		customer1.setCustomerName(customer.getCustomerName());
		customer1.setCustomerPhoneNum(customer.getCustomerPhoneNum());
		customer1.setHotel(customer.getHotel());
		customer1.setReservation(customer.getReservation());

		customerRepo.saveAndFlush(customer1);

		return "Customer added";
	}
	
	@DeleteMapping("/deleteCustomer/{customerId}")
	@ResponseBody
	public String deleteCustomer(@PathVariable("customerId") Long customerId) {
		
		customerRepo.deleteById(customerId);
		return "Customer Successfully deleted!";
	}
	
}
