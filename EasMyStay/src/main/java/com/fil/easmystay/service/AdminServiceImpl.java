package com.fil.easmystay.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fil.easmystay.models.Admin;
import com.fil.easmystay.models.Customer;
import com.fil.easmystay.models.Hotel;
import com.fil.easmystay.models.Owner;
import com.fil.easmystay.models.Payment;
import com.fil.easmystay.models.Reservation;
import com.fil.easmystay.repository.AdminRepo;
import com.fil.easmystay.repository.CustomerRepo;
import com.fil.easmystay.repository.HotelRepo;
import com.fil.easmystay.repository.OwnerRepo;
import com.fil.easmystay.repository.PaymentRepo;
import com.fil.easmystay.repository.ReservationRepo;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	public AdminRepo adminDao;
	@Autowired
	public CustomerRepo customerDao;
	@Autowired
	public OwnerRepo ownerDao;
	@Autowired
	public PaymentRepo paymentDao;
	@Autowired
	public HotelRepo hotelDao;
	@Autowired
	public ReservationRepo reservationDao;

	@Override
	public String createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.save(admin);
		return "You are an admin now.";
	}

	@Override
	public List<Owner> createAllOwners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createOwner(Owner owner) {
		// TODO Auto-generated method stub
		ownerDao.save(owner);
		return "Successfully created the Owner.";
	}

	@Override
	public List<Customer> createAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.save(customer);
		return "Successfully created the customers.";
	}

	@Override
	public List<Hotel> createAllHotels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		hotelDao.save(hotel);
		return "Successfully created the hotel.";
	}

	@Override
	public List<Reservation> createAllReservation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		reservationDao.save(reservation);
		return "Successfully created the reservation.";
	}

	@Override
	public List<Payment> createAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createPayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.save(payment);
		return "Successfully created the payment.";
	}

	@Override
	public Admin getAdmin(long id) {
		// TODO Auto-generated method stub
		return adminDao.findById(id).get();
	}

	@Override
	public List<Owner> getAllOwners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner getOwnerById(long id) {
		// TODO Auto-generated method stub
		return ownerDao.findById(id).get();
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerById(long id) {
		// TODO Auto-generated method stub
		return customerDao.findById(id).get();
	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotel getHotelById(long hotelId) {
		// TODO Auto-generated method stub
		return hotelDao.findById(hotelId).get();
	}

	@Override
	public List<Reservation> getAllReservation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation getReservationByTransactionId(long transactionId) {
		// TODO Auto-generated method stub
		return reservationDao.findById(transactionId).get();
	}

	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getPaymentByTransactionId(long transactionId) {
		// TODO Auto-generated method stub
		return paymentDao.findById(transactionId).get();
	}

	@Override
	public Admin updateAdmin(long id, Admin updatedAdmin) {
		// Retrieve the existing admin by ID
		Admin existingAdmin = adminDao.findById(id).get();

		if (existingAdmin != null) {
			// Perform the update by copying attributes from the updatedAdmin object
			existingAdmin.setAdminFirstname(updatedAdmin.getAdminFirstname());
			existingAdmin.setAdminLastname(updatedAdmin.getAdminLastname());
			existingAdmin.setHotel(updatedAdmin.getHotel());
			existingAdmin.setOwner(updatedAdmin.getOwner());
			existingAdmin.setCustomer(updatedAdmin.getCustomer());

			// Save the updated admin back to the database
			Admin savedAdmin = adminDao.save(existingAdmin);

			return savedAdmin; // Return the updated admin
		} else {
			// If the admin with the given ID is not found, you can choose how to handle
			// this scenario
			// You can throw an exception, return null, or handle it in an appropriate way.
			return null;
		}
	}

	@Override
	public List<Owner> updateAllOwners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner updateOwnerById(long id, Owner updatedOwner) {
		// Retrieve the existing owner by ID
		Owner existingOwner = ownerDao.findById(id).get();

		if (existingOwner != null) {
			// Perform the update by copying attributes from the updatedOwner object
			existingOwner.setOwnerName(updatedOwner.getOwnerName());
			existingOwner.setOwnerId(updatedOwner.getOwnerId());
			existingOwner.setOwnerEmail(updatedOwner.getOwnerEmail());
			// Add additional attributes to update as needed

			// Save the updated owner back to the database
			Owner savedOwner = ownerDao.save(existingOwner);

			return savedOwner; // Return the updated owner
		} else {
			// If the owner with the given ID is not found, you can choose how to handle
			// this scenario
			// You can throw an exception, return null, or handle it in an appropriate way.
			return null;
		}
	}

	@Override
	public List<Customer> updateAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomerById(long id, Customer updatedCustomer) {
		// Retrieve the existing customer by ID
		Customer existingCustomer = customerDao.findById(id).get();

		if (existingCustomer != null) {
			// Perform the update by copying attributes from the updatedCustomer object
			existingCustomer.setCustomerName(updatedCustomer.getCustomerName());
			existingCustomer.setCustomerPhoneNum(updatedCustomer.getCustomerPhoneNum());
			existingCustomer.setCustomerEmail(updatedCustomer.getCustomerEmail());
			// Add additional attributes to update as needed

			// Save the updated customer back to the database
			Customer savedCustomer = customerDao.save(existingCustomer);

			return savedCustomer; // Return the updated customer
		} else {
			// If the customer with the given ID is not found, you can choose how to handle
			// this scenario
			// You can throw an exception, return null, or handle it in an appropriate way.
			return null;
		}
	}

	@Override
	public List<Hotel> updateAllHotels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotel updateHotelById(long hotelId, Hotel updatedHotel) {
		// Retrieve the existing hotel by ID
		Hotel existingHotel = hotelDao.findById(hotelId).get();

		if (existingHotel != null) {
			// Perform the update by copying attributes from the updatedHotel object
			existingHotel.setHotelName(updatedHotel.getHotelName());
			existingHotel.setOwner(updatedHotel.getOwner());
			existingHotel.setRating(updatedHotel.getRating());
			// Add additional attributes to update as needed

			// Save the updated hotel back to the database
			Hotel savedHotel = hotelDao.save(existingHotel);

			return savedHotel; // Return the updated hotel
		} else {
			// If the hotel with the given ID is not found, you can choose how to handle
			// this scenario
			// You can throw an exception, return null, or handle it in an appropriate way.
			return null;
		}
	}

	@Override
	public List<Reservation> updateAllReservation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation updateReservationByTransactionId(long transactionId, Reservation updatedReservation) {
	    // Retrieve the existing reservation by transaction ID
	    Reservation existingReservation = reservationDao.findById(transactionId).get();

	    if (existingReservation != null) {
	        // Perform the update by copying attributes from the updatedReservation object
	        existingReservation.setBookingStatus(updatedReservation.getBookingStatus());
	        existingReservation.setCheckInDate(updatedReservation.getCheckInDate());
	        existingReservation.setCheckOutDate(updatedReservation.getCheckOutDate());
	        // Add additional attributes to update as needed

	        // Save the updated reservation back to the database
	        Reservation savedReservation = reservationDao.save(existingReservation);

	        return savedReservation; // Return the updated reservation
	    } else {
	        // If the reservation with the given transaction ID is not found, you can choose how to handle this scenario
	        // You can throw an exception, return null, or handle it in an appropriate way.
	        return null;
	    }
	}


	@Override
	public List<Payment> updateAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment updatePaymentByTransactionId(long transactionId, Payment updatedPayment) {
		// Find the existing payment record in the database using transactionId
		Payment existingPayment = paymentDao.findById(transactionId).get();

		if (existingPayment != null) {
			// Update the existing payment with the information from updatedPayment
			existingPayment.setReservation(updatedPayment.getReservation());
			existingPayment.setTransactionId(transactionId);

			// Save the updated payment back to the database
			Payment savedPayment = paymentDao.save(existingPayment);

			return savedPayment; // Return the updated payment
		} else {
			// If the payment record with the given transactionId is not found, you may
			// choose to handle this case as needed.
			// You can throw an exception or return null or an appropriate response.
			return updatedPayment;
		}
	}

	@Override
	public void deleteAdmin(long id) {
		// TODO Auto-generated method stub
		adminDao.deleteById( id);
	}

	@Override
	public void deleteAllOwners() {
		// TODO Auto-generated method stub
		ownerDao.deleteAll();
	}

	@Override
	public void deleteOwnerById(long id) {
		// TODO Auto-generated method stub
		ownerDao.deleteById(id);
	}

	@Override
	public void deleteAllCustomers() {
		// TODO Auto-generated method stub
		customerDao.deleteAll();
	}

	@Override
	public void deleteCustomerById(long id) {
		// TODO Auto-generated method stub
		customerDao.deleteById(id);
	}

	@Override
	public void deleteAllHotels() {
		// TODO Auto-generated method stub
		hotelDao.deleteAll();
	}

	@Override
	public void deleteHotelById(long hotelId) {
		// TODO Auto-generated method stub
		hotelDao.deleteById(hotelId);
	}

	@Override
	public void deleteAllReservation() {
		// TODO Auto-generated method stub
		reservationDao.deleteAll();
	}

	@Override
	public void deleteReservationByTransactionId(long transactionId) {
		// TODO Auto-generated method stub'
		reservationDao.deleteById(transactionId);
		;
	}

	@Override
	public void deleteAllPayments() {
		// TODO Auto-generated method stub
		paymentDao.deleteAll();
	}

	@Override
	public void deletePaymentByTransactionId(long transactionId) {
		// TODO Auto-generated method stub
		paymentDao.deleteById(transactionId);
	}

}
