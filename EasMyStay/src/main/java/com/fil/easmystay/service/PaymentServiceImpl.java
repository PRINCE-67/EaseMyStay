package com.fil.easmystay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fil.easmystay.models.Payment;
import com.fil.easmystay.repository.PaymentRepo;

@Service
public class PaymentServiceImpl implements PaymentService {

	private PaymentRepo paymentRepository;

	@Override
	public List<Payment> getAllPayments() {
		return paymentRepository.findAll();
	}

	@Override
	public Payment getPaymentById(long transactionId) {
		return paymentRepository.findById(transactionId).orElse(null);
	}

	@Override
	public Payment updatePayment(long transactionId, Payment updatedPayment) {
		if (paymentRepository.existsById(transactionId)) {
			updatedPayment.setTransactionId(transactionId);
			return paymentRepository.save(updatedPayment);
		}
		return null; // Return null if payment with given ID does not exist.
	}

	@Override
	public void deletePayment(long transactionId) {
		paymentRepository.deleteById(transactionId);
	}

	@Override
	public Payment createPayment(Payment payment) {
		return paymentRepository.save(payment);
	}
}