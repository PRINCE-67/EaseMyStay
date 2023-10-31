package com.fil.easmystay.service;

import java.util.List;

import com.fil.easmystay.models.Payment;

public interface PaymentService {

	public void deletePayment(long transactionId);

	public Payment updatePayment(long transactionId, Payment updatedPayment);

	public List<Payment> getAllPayments();

	public Payment getPaymentById(long transactionId);

	public Payment createPayment(Payment payment);

}
