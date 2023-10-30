package com.fil.mmproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.mmproject.models.Reservation;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long>{

}
