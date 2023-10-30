package com.fil.mmproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.mmproject.models.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long>{

}
