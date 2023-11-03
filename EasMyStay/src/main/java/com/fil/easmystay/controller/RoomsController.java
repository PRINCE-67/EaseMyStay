package com.fil.easmystay.controller;

import com.fil.easmystay.models.Room;
import com.fil.easmystay.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomsController {

    private RoomService roomService;

    @Autowired
    public RoomsController(RoomService roomService) {
        this.roomService = roomService;
    }

//    @GetMapping("/available")
//    public String showAvailableRooms(Model model) {
//        // Add logic to retrieve available rooms and add them to the model
//        // Example:
//        model.addAttribute("rooms", roomService.getRooms());
//        return "available";
//    }
}

