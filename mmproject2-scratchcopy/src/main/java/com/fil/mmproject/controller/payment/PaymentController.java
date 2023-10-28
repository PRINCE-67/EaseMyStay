package com.fil.mmproject.controller.payment;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fil.mmproject.models.Hotel;
import com.fil.mmproject.models.Payment;
import com.fil.mmproject.repositories.HotelRepo;
import com.fil.mmproject.repositories.PaymentRepo;

@RestController
@RequestMapping("/payments")
public class PaymentController {

private PaymentRepo paymentRepo;
	
	@GetMapping("/getAllPayments")
	@ResponseBody
	public Object getPayments(Pageable pageable) {
		return paymentRepo.findAll(pageable);
	}
	
	@PostMapping("/addPayment")
	@ResponseBody
	public String addPayment(@RequestBody Payment payment) {

		Payment payment1 = new Payment();
		payment1.setReservation(payment.getReservation());
		payment1.setTransactionId(payment.getTransactionId());
		
		paymentRepo.saveAndFlush(payment1);

		return "payment added";
	}
	
	@DeleteMapping("/deletePayment/{transactionId}")
	@ResponseBody
	public String deleteHotel(@PathVariable("transactionId") Long transactionId) {
		
		paymentRepo.deleteById(transactionId);
		return "Successfully payment deleted!";
	}
	
}
