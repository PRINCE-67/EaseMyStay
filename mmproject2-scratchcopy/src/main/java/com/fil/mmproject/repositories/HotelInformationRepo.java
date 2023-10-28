package com.fil.mmproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.mmproject.models.HotelInformation;

@Repository
public interface HotelInformationRepo extends JpaRepository<HotelInformation, String>{

}
