package com.fil.mmproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fil.mmproject.models.Availability;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface AvailabilityRepo extends JpaRepository<Availability, Long> {

}
