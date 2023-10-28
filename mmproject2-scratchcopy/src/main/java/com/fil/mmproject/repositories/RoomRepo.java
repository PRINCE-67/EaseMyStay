package com.fil.mmproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.mmproject.models.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long>{

}
