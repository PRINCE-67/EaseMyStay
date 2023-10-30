package com.fil.mmproject.controllers;

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

import com.fil.mmproject.models.Room;
import com.fil.mmproject.services.RoomServiceImpl;

@RestController
@RequestMapping("/room")
public class RoomController {

	@Autowired
	private RoomServiceImpl roomService;

	@GetMapping("/home")
	public String home() {
		System.out.println("Hi! Just an update. The One Piece is real.");
		return "Hello World!";
	}

	@GetMapping("/getAllRooms")
	public List<Room> getRooms() {
		return (List<Room>) roomService.getRooms();
	}

	@GetMapping("/getRoom/{roomId}")
	public Room getRoomById(@PathVariable long roomId) {
		return roomService.getRoomById(roomId);
	}

	@PostMapping("/addRoom")
	public Room addRoom(@RequestBody Room room) {
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