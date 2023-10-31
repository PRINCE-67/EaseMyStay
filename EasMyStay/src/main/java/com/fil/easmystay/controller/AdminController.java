package com.fil.easmystay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fil.easmystay.models.Admin;
import com.fil.easmystay.models.Customer;
import com.fil.easmystay.models.Hotel;
import com.fil.easmystay.models.Owner;
import com.fil.easmystay.models.Payment;
import com.fil.easmystay.models.Reservation;
import com.fil.easmystay.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	// Creating data
	@PostMapping("/createAdmin")
	public String createAdmin(@RequestBody Admin admin) {
		return adminService.createAdmin(admin);
	}

	@PostMapping("/createOwner")
	public String createOwner(@RequestBody Owner owner) {
		return adminService.createOwner(owner);
	}

	@PostMapping("/createCustomer")
	public String createCustomer(@RequestBody Customer customer) {
		return adminService.createCustomer(customer);
	}

	@PostMapping("/createHotel")
	public String createHotel(@RequestBody Hotel hotel) {
		return adminService.createHotel(hotel);
	}

	@PostMapping("/createReservation")
	public String createReservation(@RequestBody Reservation reservation) {
		return adminService.createReservation(reservation);
	}

	@PostMapping("/createPayment")
	public String createPayment(@RequestBody Payment payment) {
		return adminService.createPayment(payment);
	}

	// Getting data
	@GetMapping("/getAdmin/{id}")
	public Admin getAdmin(@PathVariable long id) {
		return adminService.getAdmin(id);
	}

	@GetMapping("/getOwner/{id}")
	public Owner getOwnerById(@PathVariable long id) {
		return adminService.getOwnerById(id);
	}

	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return adminService.getAllCustomers();
	}

	// Retrieve a customer by ID
	@GetMapping("/customers/{id}")
	public Customer getCustomerById(@PathVariable long id) {
		return adminService.getCustomerById(id);
	}

	// Retrieve all hotels
	@GetMapping("/hotels")
	public List<Hotel> getAllHotels() {
		return adminService.getAllHotels();
	}

	// Retrieve a hotel by ID
	@GetMapping("/hotels/{hotelId}")
	public Hotel getHotelById(@PathVariable long hotelId) {
		return adminService.getHotelById(hotelId);
	}

	// Retrieve all reservations
	@GetMapping("/reservations")
	public List<Reservation> getAllReservations() {
		return adminService.getAllReservation();
	}

	// Retrieve a reservation by transaction ID
	@GetMapping("/reservations/{transactionId}")
	public Reservation getReservationByTransactionId(@PathVariable long transactionId) {
		return adminService.getReservationByTransactionId(transactionId);
	}

	// Retrieve all payments
	@GetMapping("/payments")
	public List<Payment> getAllPayments() {
		return adminService.getAllPayments();
	}

	// Retrieve a payment by transaction ID
	@GetMapping("/payments/{transactionId}")
	public Payment getPaymentByTransactionId(@PathVariable long transactionId) {
		return adminService.getPaymentByTransactionId(transactionId);
	}

	// Add similar endpoints for other entities...

	// Updating data
	@PutMapping("/updateAdmin/{id}")
	public Admin updateAdmin(@PathVariable int id, @RequestBody Admin admin) {
		return adminService.updateAdmin(id, admin);
	}

	@PutMapping("/owners")
	public List<Owner> updateAllOwners() {
		return adminService.updateAllOwners();
	}

	// Update an owner by ID
	@PutMapping("/owners/{id}")
	public Owner updateOwnerById(@PathVariable long id, @RequestBody Owner owner) {
		return adminService.updateOwnerById(id, owner);
	}

	// Update all customers
	@PutMapping("/customers")
	public List<Customer> updateAllCustomers() {
		return adminService.updateAllCustomers();
	}

	// Update a customer by ID
	@PutMapping("/customers/{id}")
	public Customer updateCustomerById(@PathVariable long id, @RequestBody Customer customer) {
		return adminService.updateCustomerById(id, customer);
	}

	// Update all hotels
	@PutMapping("/hotels")
	public List<Hotel> updateAllHotels() {
		return adminService.updateAllHotels();
	}

	// Update a hotel by ID
	@PutMapping("/hotels/{hotelId}")
	public Hotel updateHotelById(@PathVariable long hotelId, @RequestBody Hotel hotel) {
		return adminService.updateHotelById(hotelId, hotel);
	}

	// Update all reservations
	@PutMapping("/reservations")
	public List<Reservation> updateAllReservations() {
		return adminService.updateAllReservation();
	}

	// Update a reservation by transaction ID
	@PutMapping("/reservations/{transactionId}")
	public Reservation updateReservationByTransactionId(@PathVariable long transactionId,
			@RequestBody Reservation reservation) {
		return adminService.updateReservationByTransactionId(transactionId, reservation);
	}

	// Update all payments
	@PutMapping("/payments")
	public List<Payment> updateAllPayments() {
		return adminService.updateAllPayments();
	}

	// Update a payment by transaction ID
	@PutMapping("/payments/{transactionId}")
	public Payment updatePaymentByTransactionId(@PathVariable long transactionId, @RequestBody Payment payment) {
		return adminService.updatePaymentByTransactionId(transactionId, payment);
	}
	// Add similar endpoints for other entities...

	// Deleting data
	@DeleteMapping("/deleteAdmin/{id}")
	public void deleteAdmin(@PathVariable int id) {
		adminService.deleteAdmin(id);
	}

	@DeleteMapping("/deleteOwner/{id}")
	public void deleteOwnerById(@PathVariable long id) {
		adminService.deleteOwnerById(id);
	}

	// Delete all customers
	@DeleteMapping("/customers")
	public void deleteAllCustomers() {
		adminService.deleteAllCustomers();
	}

	// Delete a customer by ID
	@DeleteMapping("/customers/{id}")
	public void deleteCustomerById(@PathVariable long id) {
		adminService.deleteCustomerById(id);
	}

	// Delete all hotels
	@DeleteMapping("/hotels")
	public void deleteAllHotels() {
		adminService.deleteAllHotels();
	}

	// Delete a hotel by ID
	@DeleteMapping("/hotels/{hotelId}")
	public void deleteHotelById(@PathVariable long hotelId) {
		adminService.deleteHotelById(hotelId);
	}

	// Delete all reservations
	@DeleteMapping("/reservations")
	public void deleteAllReservations() {
		adminService.deleteAllReservation();
	}

	// Delete a reservation by transaction ID
	@DeleteMapping("/reservations/{transactionId}")
	public void deleteReservationByTransactionId(@PathVariable long transactionId) {
		adminService.deleteReservationByTransactionId(transactionId);
	}

	// Delete all payments
	@DeleteMapping("/payments")
	public void deleteAllPayments() {
		adminService.deleteAllPayments();
	}

	// Delete a payment by transaction ID
	@DeleteMapping("/payments/{transactionId}")
	public void deletePaymentByTransactionId(@PathVariable long transactionId) {
		adminService.deletePaymentByTransactionId(transactionId);
	}

}
