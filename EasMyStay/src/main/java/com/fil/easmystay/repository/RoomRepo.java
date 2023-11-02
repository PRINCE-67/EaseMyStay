package com.fil.easmystay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.easmystay.models.Room;

@Repository 
public interface RoomRepo extends JpaRepository<Room, Long>{
	
}
