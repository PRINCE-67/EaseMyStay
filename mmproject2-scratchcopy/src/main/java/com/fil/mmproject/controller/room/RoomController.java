package com.fil.mmproject.controller.room;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fil.mmproject.models.Room;
import com.fil.mmproject.repositories.RoomRepo;

@RestController
@RequestMapping("/rooms")
public class RoomController {

private RoomRepo roomRepo;
	
	@GetMapping("/getAllRooms")
	@ResponseBody
	public Object getRooms(Pageable pageable) {
		return roomRepo.findAll(pageable);
	}
	
	@PostMapping("/addRoom")
	@ResponseBody
	public String addRooms(@RequestBody Room room) {

		Room room1 = new Room();
		room1.setRoomId(room.getRoomId());
		room1.setRoomNum(room.getRoomNum());
		room1.setRoomType(room.getRoomType());
		room1.setPrice(room.getPrice());
		room1.setHotel(room.getHotel());
		room1.setReservation(room.getReservation());

		roomRepo.saveAndFlush(room1);

		return "room added";
	}
	
	@DeleteMapping("/deleteRoom/{roomId}")
	@ResponseBody
	public String deleteRoom(@PathVariable("hotelId") Long roomId) {
		
		roomRepo.deleteById(roomId);
		return "Successfully room deleted!";
	}
	
}
