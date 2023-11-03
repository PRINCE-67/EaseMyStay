package com.fil.easmystay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fil.easmystay.models.PaymentDetails;
import com.fil.easmystay.repository.PaymentDetailsRepo;

@Service
public class PaymentDetailsServiceImpl implements PaymentDetailsService {

    private final PaymentDetailsRepo paymentDetailsRepo;

    @Autowired
    public PaymentDetailsServiceImpl(PaymentDetailsRepo paymentDetailsRepo) {
        this.paymentDetailsRepo = paymentDetailsRepo;
    }

	@Override
	public PaymentDetails savePaymentDetails(PaymentDetails paymentDetails) {
		// TODO Auto-generated method stub
		return paymentDetailsRepo.save(paymentDetails);
	}
}