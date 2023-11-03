package com.fil.easmystay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fil.easmystay.models.PaymentDetails;

public interface PaymentDetailsRepo extends JpaRepository<PaymentDetails, Long> {
}