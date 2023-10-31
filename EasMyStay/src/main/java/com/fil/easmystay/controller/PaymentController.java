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

import com.fil.easmystay.models.Payment;
import com.fil.easmystay.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	private final PaymentService paymentService;

	@Autowired
	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@PostMapping
	public Payment createPayment(@RequestBody Payment payment) {
		return paymentService.createPayment(payment);
	}

	@GetMapping("/{transactionId}")
	public Payment getPaymentById(@PathVariable long transactionId) {
		return paymentService.getPaymentById(transactionId);
	}

	@GetMapping
	public List<Payment> getAllPayments() {
		return paymentService.getAllPayments();
	}

	@PutMapping("/{transactionId}")
	public Payment updatePayment(@PathVariable long transactionId, @RequestBody Payment updatedPayment) {
		return paymentService.updatePayment(transactionId, updatedPayment);
	}

	@DeleteMapping("/{transactionId}")
	public void deletePayment(@PathVariable long transactionId) {
		paymentService.deletePayment(transactionId);
	}
}
