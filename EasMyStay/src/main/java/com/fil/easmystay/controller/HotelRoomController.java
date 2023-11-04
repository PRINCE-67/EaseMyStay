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


	
    public HotelRoomController(HotelService hotelService) {
        this.hotelService = hotelService;
    }
    @Autowired
    public HotelRoomController(RoomService roomService) {
        this.roomService = roomService;
    }
    
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

    

    @GetMapping("/photel")
    public String showHotelRegistrationForm(Model model) {
        model.addAttribute("hotel", new Hotel());
        return "photel"; // Thymeleaf template name for the registration page
    }

    @PostMapping("/photel")
    public String registerHotel(Hotel hotel) {
        // Implement the logic to save the hotel details to the database using the hotelService
        hotelService.createHotel(hotel);

        // After successful registration, you can redirect to the "proom" page
        return "redirect:/proom";
    }
    
    @GetMapping("/proom")
    public String showRoomRegistrationPage(Model model) {
        model.addAttribute("room", new Room());
        return "proom";
    }

    @PostMapping("/proom")
    public String registerRoom(Room room) {
        // Add logic to save the room details to the database
        roomService.createRoom(room);

        // Redirect to a success page
        return "redirect:/last";
    }

    @GetMapping("/last")
    public String showRegistrationSuccessPage() {
        return "last";
    }
    
//    @GetMapping("/reserve")
//    public String showSelectedRoom(Model model) {
//        // Add logic to retrieve the selected hotel and room
//        // Example:
//        model.addAttribute("selectedHotel",hotelService.getHotels());
//        model.addAttribute("selectedRoom", roomService.getRooms());
//        return "reserve";
//    }
    
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

//    @PostMapping("/reserve")
//    public String reserveRoom(Model model) {
//        // Add logic to handle room reservation
//        return "reservation-success"; // Show a success page
//    }
   
}
