package com.fil.easmystay.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fil.easmystay.models.HotelInformation;
import com.fil.easmystay.service.HotelInformationService;

@RestController
@RequestMapping("/hotel-information")
public class HotelInformationController {

    private final HotelInformationService hotelInformationService;

    public HotelInformationController(HotelInformationService hotelInformationService) {
        this.hotelInformationService = hotelInformationService;
    }

    @PostMapping
    public ResponseEntity<HotelInformation> createHotelInformation(@RequestBody HotelInformation hotelInformation) {
        HotelInformation createdHotelInfo = hotelInformationService.createHotelInformation(hotelInformation);
        return new ResponseEntity<>(createdHotelInfo, HttpStatus.CREATED);
    }

    @GetMapping("/{email}")
    public ResponseEntity<HotelInformation> getHotelInformation(@PathVariable String email) {
        HotelInformation hotelInfo = hotelInformationService.getHotelInformationByEmail(email);
        if (hotelInfo != null) {
            return new ResponseEntity<>(hotelInfo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{email}")
    public ResponseEntity<HotelInformation> updateHotelInformation(
            @PathVariable String email,
            @RequestBody HotelInformation hotelInformation) {
        hotelInformation.setHotelEmail(email);
        HotelInformation updatedHotelInfo = hotelInformationService.updateHotelInformation(hotelInformation);
        if (updatedHotelInfo != null) {
            return new ResponseEntity<>(updatedHotelInfo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<String> deleteHotelInformation(@PathVariable String email) {
        hotelInformationService.deleteHotelInformationByEmail(email);
        return new ResponseEntity<>("Hotel Information with email " + email + " got deleted", HttpStatus.OK);
    }
}
