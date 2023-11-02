package com.fil.easmystay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fil.easmystay.models.Room;
import com.fil.easmystay.repository.RoomRepo;


@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomRepo roomRepo;
	
	public Room createRoom(Room room) {
		return roomRepo.save(room);
	}

	public List<Room> getRooms() {
		return roomRepo.findAll();
	}

	public Room getRoomById(long id) {
		return roomRepo.findById(id).get();
	}

	public Room updateRoom(Room room) {
		Optional<Room> optionalRoom = roomRepo.findById(room.getRoomId());
		Room new_room = null;
		if (optionalRoom.isPresent()) {
			new_room = optionalRoom.get();
			new_room.setHotel(room.getHotel());
			new_room.setPrice(room.getPrice());
			new_room.setRoomId(room.getRoomId());
			new_room.setRoomNum(room.getRoomNum());
			new_room.setRoomType(room.getRoomType());

			roomRepo.save(new_room);
		} else {
			return new Room();
		}
		return new_room;
	}

	public String deleteRoomById(long id) {
		roomRepo.deleteById(id);
		return "Hotel got deleted";
	}

}
