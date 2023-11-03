package com.fil.easmystay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fil.easmystay.models.PaymentDetails;
import com.fil.easmystay.repository.PaymentDetailsRepo;

@Controller
public class PaymentDetailsController {

    private final PaymentDetailsRepo paymentDetailsRepo;

    @Autowired
    public PaymentDetailsController(PaymentDetailsRepo paymentDetailsRepo) {
        this.paymentDetailsRepo = paymentDetailsRepo;
    }

    @GetMapping("/payment")
    public String showPaymentForm() {
        return "payment-form";
    }

    @PostMapping("/payment")
    public String submitPaymentForm(PaymentDetails paymentDetails) {
        paymentDetailsRepo.save(paymentDetails);
        return "payment-success";
    }
}
