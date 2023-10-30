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

import com.fil.mmproject.models.Payment;
import com.fil.mmproject.services.PaymentServiceImpl;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
    private PaymentServiceImpl paymentService;

	@GetMapping("/home")
	public String home() {
		System.out.println("Hi! Just an update. The One Piece is real.");
		return "Hello World!";
	}
	
    @PostMapping("/showPayment")
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.createPayment(payment);
    }

    @GetMapping("/getPayment/{transactionId}")
    public Payment getPaymentById(@PathVariable long transactionId) {
        return paymentService.getPaymentById(transactionId);
    }

    @GetMapping("/getPayments")
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @PutMapping("/updatePayment/{transactionId}")
    public Payment updatePayment(@PathVariable long transactionId, @RequestBody Payment updatedPayment) {
        return paymentService.updatePayment(transactionId, updatedPayment);
    }

    @DeleteMapping("/deletePayment/{transactionId}")
    public void deletePayment(@PathVariable long transactionId) {
        paymentService.deletePayment(transactionId);
    }
}