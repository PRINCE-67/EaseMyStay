package com.fil.mmproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fil.mmproject.models.Payment;
import com.fil.mmproject.repositories.PaymentRepo;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
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