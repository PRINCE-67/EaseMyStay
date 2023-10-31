package com.fil.easmystay.repository;

import com.fil.easmystay.models.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDetailsRepo extends JpaRepository<PaymentDetails, Long> {
}