package com.fil.easmystay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fil.easmystay.models.Room;
import com.fil.easmystay.service.OwnerService;
import com.fil.easmystay.service.RoomService;
import com.fil.easmystay.service.RoomServiceImpl;


@RestController
@RequestMapping("/Room")
public class RoomController {

	
	private final RoomService roomService;

	public RoomController(RoomService roomService) {
		this.roomService = roomService;
	}

	@GetMapping("/getAllRooms")
	public List<Room> getRooms() {
		return (List<Room>) roomService.getRooms();
	}

	@GetMapping("/getRoom/{roomId}")
	public Room getRoomById(@PathVariable long roomId) {
		return roomService.getRoomById(roomId);
	}

	@PostMapping("/createRoom")
	public Room createRoom(@RequestBody Room room) {
		return roomService.createRoom(room);
	}

	@PutMapping("/updateRoom")
	public Room updateRoom(@RequestBody Room room) {
		return roomService.updateRoom(room);
	}

	@DeleteMapping("/deleteRoom/{roomId}")
	public String deleteHotel(@PathVariable long roomId) {
		return roomService.deleteRoomById(roomId);
	}

}