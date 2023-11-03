package com.fil.easmystay.controller;

import com.fil.easmystay.models.Hotel;
import com.fil.easmystay.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HotelRoomController {

    @GetMapping("/selected")
    public String showSelectedHotelRoom(Model model) {
        // Add logic to retrieve the selected hotel and room
        // Example:
        model.addAttribute("selectedHotel", new Hotel());
        model.addAttribute("selectedRoom", new Room());
        return "selected";
    }

    @PostMapping("/reserve")
    public String reserveRoom(Model model) {
        // Add logic to handle room reservation
        return "reservation-success"; // Show a success page
    }
}
