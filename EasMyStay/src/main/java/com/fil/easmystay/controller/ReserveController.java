//package com.fil.easmystay.controller;
//
//import com.fil.easmystay.models.Hotel;
//import com.fil.easmystay.models.Room;
//import com.fil.easmystay.repository.HotelRepo;
//import com.fil.easmystay.repository.RoomRepo;
//import com.fil.easmystay.service.HotelService;
//import com.fil.easmystay.service.RoomService;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class ReserveController {
//
//	private HotelService hotelService;
//	private RoomService roomService;
//	
//    @GetMapping("/reserve")
//    public String showSelectedHotelRoom(Model model) {
//        // Add logic to retrieve the selected hotel and room
//        // Example:
//        model.addAttribute("selectedHotel",hotelService.getHotels());
//        model.addAttribute("selectedRoom", new Room());
//        return "reserve";
//    }
//
//    @PostMapping("/reserve")
//    public String reserveRoom(Model model) {
//        // Add logic to handle room reservation
//        return "reservation-success"; // Show a success page
//    }
//}
