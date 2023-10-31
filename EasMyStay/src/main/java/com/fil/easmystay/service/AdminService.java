package com.fil.easmystay.service;

import java.util.List;

import com.fil.easmystay.models.Admin;
import com.fil.easmystay.models.Customer;
import com.fil.easmystay.models.Hotel;
import com.fil.easmystay.models.Owner;
import com.fil.easmystay.models.Payment;
import com.fil.easmystay.models.Reservation;

public interface AdminService {

	// creating all the data.
	public String createAdmin(Admin admin);

	public List<Owner> createAllOwners();

	public String createOwner(Owner owner);

	public List<Customer> createAllCustomers();

	public String createCustomer(Customer customer);

	public List<Hotel> createAllHotels();

	public String createHotel(Hotel hotel);

	public List<Reservation> createAllReservation();

	public String createReservation(Reservation reservation);

	public List<Payment> createAllPayments();

	public String createPayment(Payment payment);

	// Getting all the entity data.
	public Admin getAdmin(long id);

	public List<Owner> getAllOwners();

	public Owner getOwnerById(long id);

	public List<Customer> getAllCustomers();

	public Customer getCustomerById(long id);

	public List<Hotel> getAllHotels();

	public Hotel getHotelById(long hotelId);

	public List<Reservation> getAllReservation();

	public Reservation getReservationByTransactionId(long transactionId);

	public List<Payment> getAllPayments();

	public Payment getPaymentByTransactionId(long transactionId);

	// updating all the data.
	public Admin updateAdmin(long id,Admin admin);

	public List<Owner> updateAllOwners();

	public Owner updateOwnerById(long id,Owner owner);

	public List<Customer> updateAllCustomers();

	public Customer updateCustomerById(long id,Customer customer);

	public List<Hotel> updateAllHotels();

	public Hotel updateHotelById(long hotelId,Hotel hotel);

	public List<Reservation> updateAllReservation();

	public Reservation updateReservationByTransactionId(long transactionId,Reservation reservation);

	public List<Payment> updateAllPayments();

	public Payment updatePaymentByTransactionId(long transactionId,Payment payment);

	// delete all the data
	public void deleteAdmin(long id);

	public void deleteAllOwners();

	public void deleteOwnerById(long id);

	public void deleteAllCustomers();

	public void deleteCustomerById(long id);

	public void deleteAllHotels();

	public void deleteHotelById(long hotelId);

	public void deleteAllReservation();

	public void deleteReservationByTransactionId(long transactionId);

	public void deleteAllPayments();

	public void deletePaymentByTransactionId(long transactionId);


}
