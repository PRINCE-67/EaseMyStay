package com.fil.easmystay.service;

import com.fil.easmystay.models.PaymentDetails;
import com.fil.easmystay.repository.PaymentDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentDetailsServiceImpl implements PaymentDetailsService {

    private final PaymentDetailsRepo paymentDetailsRepo;

    @Autowired
    public PaymentDetailsServiceImpl(PaymentDetailsRepo paymentDetailsRepo) {
        this.paymentDetailsRepo = paymentDetailsRepo;
    }

    @Override
    public PaymentDetails savePaymentDetails(PaymentDetails paymentDetails) {
        return paymentDetailsRepo.save(paymentDetails);
    }
}
