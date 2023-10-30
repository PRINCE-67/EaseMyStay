package com.fil.mmproject.services;

import java.util.List;

import com.fil.mmproject.models.Payment;

public interface PaymentService {

	List<Payment> getAllPayments();

	Payment getPaymentById(long transactionId);

	Payment updatePayment(long transactionId, Payment updatedPayment);

	void deletePayment(long transactionId);

	Payment createPayment(Payment payment);
}