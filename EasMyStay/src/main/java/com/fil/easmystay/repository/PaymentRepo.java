package com.fil.easmystay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.easmystay.models.Admin;
import com.fil.easmystay.models.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long>{
}
