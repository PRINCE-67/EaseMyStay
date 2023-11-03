package com.fil.easmystay.controller;

import com.fil.easmystay.models.Hotel;
import com.fil.easmystay.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultsController {

    private HotelService hotelService;

    @Autowired
    public ResultsController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/results")
    public String showSearchResults(Model model) {
        // Add logic to retrieve hotels and add them to the model
        // Example:
        model.addAttribute("hotels", hotelService.getHotels());
        return "results";
    }
}

