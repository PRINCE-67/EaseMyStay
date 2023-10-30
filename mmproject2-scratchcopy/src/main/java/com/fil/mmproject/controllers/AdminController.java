package com.fil.mmproject.controllers;

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

import com.fil.mmproject.models.Admin;
import com.fil.mmproject.models.Customer;
import com.fil.mmproject.models.Hotel;
import com.fil.mmproject.models.Owner;
import com.fil.mmproject.models.Payment;
import com.fil.mmproject.models.Reservation;
import com.fil.mmproject.services.AdminServiceImpl;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminServiceImpl adminService;

	@GetMapping("/home")
	public String home() {
		System.out.println("Hi! Just an update. The One Piece is real.");
		return "Hello World!";
	}
	
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

	@GetMapping("/customers/{id}")
	public Customer getCustomerById(@PathVariable long id) {
		return adminService.getCustomerById(id);
	}

	@GetMapping("/hotels")
	public List<Hotel> getAllHotels() {
		return adminService.getAllHotels();
	}

	@GetMapping("/hotels/{hotelId}")
	public Hotel getHotelById(@PathVariable long hotelId) {
		return adminService.getHotelById(hotelId);
	}

	@GetMapping("/reservations")
	public List<Reservation> getAllReservations() {
		return adminService.getAllReservation();
	}

	@GetMapping("/reservations/{transactionId}")
	public Reservation getReservationByTransactionId(@PathVariable long transactionId) {
		return adminService.getReservationByTransactionId(transactionId);
	}

	@GetMapping("/payments")
	public List<Payment> getAllPayments() {
		return adminService.getAllPayments();
	}

	@GetMapping("/payments/{transactionId}")
	public Payment getPaymentByTransactionId(@PathVariable long transactionId) {
		return adminService.getPaymentByTransactionId(transactionId);
	}

	@PutMapping("/updateAdmin/{id}")
	public Admin updateAdmin(@PathVariable int id, @RequestBody Admin admin) {
		return adminService.updateAdmin(id, admin);
	}

	@PutMapping("/owners")
	public List<Owner> updateAllOwners() {
		return adminService.updateAllOwners();
	}

	@PutMapping("/owners/{id}")
	public Owner updateOwnerById(@PathVariable long id, @RequestBody Owner owner) {
		return adminService.updateOwnerById(id, owner);
	}

	@PutMapping("/customers")
	public List<Customer> updateAllCustomers() {
		return adminService.updateAllCustomers();
	}

	@PutMapping("/customers/{id}")
	public Customer updateCustomerById(@PathVariable long id, @RequestBody Customer customer) {
		return adminService.updateCustomerById(id, customer);
	}

	@PutMapping("/hotels")
	public List<Hotel> updateAllHotels() {
		return adminService.updateAllHotels();
	}

	@PutMapping("/hotels/{hotelId}")
	public Hotel updateHotelById(@PathVariable long hotelId, @RequestBody Hotel hotel) {
		return adminService.updateHotelById(hotelId, hotel);
	}

	@PutMapping("/reservations")
	public List<Reservation> updateAllReservations() {
		return adminService.updateAllReservation();
	}

	@PutMapping("/reservations/{transactionId}")
	public Reservation updateReservationByTransactionId(@PathVariable long transactionId,
			@RequestBody Reservation reservation) {
		return adminService.updateReservationByTransactionId(transactionId, reservation);
	}

	@PutMapping("/payments")
	public List<Payment> updateAllPayments() {
		return adminService.updateAllPayments();
	}

	@PutMapping("/payments/{transactionId}")
	public Payment updatePaymentByTransactionId(@PathVariable long transactionId, @RequestBody Payment payment) {
		return adminService.updatePaymentByTransactionId(transactionId, payment);
	}

	@DeleteMapping("/deleteAdmin/{id}")
	public void deleteAdmin(@PathVariable int id) {
		adminService.deleteAdmin(id);
	}

	@DeleteMapping("/deleteOwner/{id}")
	public void deleteOwnerById(@PathVariable long id) {
		adminService.deleteOwnerById(id);
	}

	@DeleteMapping("/customers")
	public void deleteAllCustomers() {
		adminService.deleteAllCustomers();
	}

	@DeleteMapping("/customers/{id}")
	public void deleteCustomerById(@PathVariable long id) {
		adminService.deleteCustomerById(id);
	}

	@DeleteMapping("/hotels")
	public void deleteAllHotels() {
		adminService.deleteAllHotels();
	}

	@DeleteMapping("/hotels/{hotelId}")
	public void deleteHotelById(@PathVariable long hotelId) {
		adminService.deleteHotelById(hotelId);
	}

	@DeleteMapping("/reservations")
	public void deleteAllReservations() {
		adminService.deleteAllReservation();
	}

	@DeleteMapping("/reservations/{transactionId}")
	public void deleteReservationByTransactionId(@PathVariable long transactionId) {
		adminService.deleteReservationByTransactionId(transactionId);
	}

	@DeleteMapping("/payments")
	public void deleteAllPayments() {
		adminService.deleteAllPayments();
	}

	@DeleteMapping("/payments/{transactionId}")
	public void deletePaymentByTransactionId(@PathVariable long transactionId) {
		adminService.deletePaymentByTransactionId(transactionId);
	}

}
