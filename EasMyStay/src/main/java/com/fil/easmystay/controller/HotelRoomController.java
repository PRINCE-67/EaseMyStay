package com.fil.easmystay.controller;

import com.fil.easmystay.models.Hotel;
import com.fil.easmystay.models.Room;
import com.fil.easmystay.service.HotelService;
import com.fil.easmystay.service.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HotelRoomController {

	
	private Hotel selectedHotel;
    private Room selectedRoom;
    
	@Autowired
	private HotelService hotelService;
	@Autowired
	private RoomService roomService;
	
	
	
    @GetMapping("/available")
    public String showSelectedHotelRoom(Model model) {
        // Add logic to retrieve the selected hotel and room
        // Example:
        model.addAttribute("selectedHotel", hotelService.getHotels());
//        model.addAttribute("selectedRoom", roomService.getRooms());
        model.addAttribute("rooms", roomService.getRooms());
        return "available";
    }

    
    @GetMapping("/reserve")
    public String showSelectedRoom(Model model) {
        // Add logic to retrieve the selected hotel and room
        // Example:
        model.addAttribute("selectedHotel",hotelService.getHotels());
        model.addAttribute("selectedRoom", roomService.getRooms());
        return "reserve";
    }
    
//    @GetMapping("/reserve/{roomId}")
//    public String showSelectedRoom(@RequestParam("roomId") int roomId, Model model) {
//        // Retrieve the selected room
//    	selectedRoom = roomService.getRoomById(roomId);
//        return "reserve";
//    }
    
//    @GetMapping("/reserve")
//    public String showSelectedRoom( Model model) {
//        Retrieve the selected room 	
//        selectedRoom = roomService.getRoomById(roomId);
//        model.addAttribute("selectedHotel",hotelService.getHotels());
//    	model.addAttribute("selectedRoom", roomService.getRooms());
//        return "reserve";
//    }

    @PostMapping("/reserve")
    public String reserveRoom(Model model) {
        // Add logic to handle room reservation
        return "reservation-success"; // Show a success page
    }
   
}
