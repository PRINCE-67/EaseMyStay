package com.fil.easmystay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.easmystay.models.Admin;
import com.fil.easmystay.models.Reservation;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long>{
}
