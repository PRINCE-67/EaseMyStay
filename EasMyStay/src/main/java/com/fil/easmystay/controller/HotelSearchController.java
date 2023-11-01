package com.fil.easmystay.controller;

import com.fil.easmystay.models.Hotel;
import com.fil.easmystay.models.HotelSearch;
import com.fil.easmystay.service.HotelSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1.0")
public class HotelSearchController {

	@Autowired
	private HotelSearchService hotelSearchService;

	@GetMapping
	public List<HotelSearch> getAllHotelSearches() {
		return hotelSearchService.getAllHotelSearches();
	}

	@GetMapping("/homepage")
	public String showSearchPage(Model model) {
		model.addAttribute("hotelSearch", new HotelSearch());
		return "homepage";
	}
	
	@GetMapping("/login")
	public String showIndexPage(Model model) {
		model.addAttribute("hotelSearch", new HotelSearch());
		return "login";
	}
	
	@GetMapping("/homepage2")
	public String showNewPage(Model model) {
		model.addAttribute("hotelSearch", new HotelSearch());
		return "homepage2";
	}
	
	@GetMapping("/signup")
	public String showNewUserPage(Model model) {
		model.addAttribute("hotelSearch", new HotelSearch());
		return "signup";
	}
	
//	@GetMapping("/update")
//	public String showUpdatePage(Model model) {
//		model.addAttribute("hotelSearch", new HotelSearch());
//		return "update";
//	}
	
	

	@GetMapping("/results")
//    public String showResultPage(@RequestParam("state") String state, @RequestParam("suburb") String suburb, @RequestParam("postcode") String postcode, Model model) {
//        List<Hotel> hotelSearch = hotelSearchService.searchHotels(state, suburb, postcode);
	public String showResultPage(Model model) {
		model.addAttribute("hotelSearch", new HotelSearch());
		return "results";
	}

	@GetMapping("/available")
	public String showRoomPage(Model model) {
		model.addAttribute("hotelSearch", new HotelSearch());
		return "available";
	}

	@GetMapping("/reserve")
	public String showReservePage(Model model) {
		model.addAttribute("hotelSearch", new HotelSearch());
		return "reserve";
	}

//	@GetMapping("/hotelSearch")
//	public String searchHotels(@ModelAttribute HotelSearch hotelSearch, Model model) {
//		// Perform the search using HotelSearchService and populate the searchResults
//		List<Hotel> searchResults = hotelSearchService.searchHotels(hotelSearch);
//
//		model.addAttribute("searchResults", searchResults);
//
//		return "search"; // Return the same page to display search results changes i have made
//	}

	@GetMapping("/{id}")
	public HotelSearch getHotelSearchById(@PathVariable long id) {
		return hotelSearchService.getHotelSearchById(id);
	}

	@PostMapping
	public HotelSearch createHotelSearch(@RequestBody HotelSearch hotelSearch) {
		return hotelSearchService.createHotelSearch(hotelSearch);
	}

	@PutMapping("/{id}")
	public HotelSearch updateHotelSearch(@PathVariable long id, @RequestBody HotelSearch updatedHotelSearch) {
		return hotelSearchService.updateHotelSearch(id, updatedHotelSearch);
	}

	@DeleteMapping("/{id}")
	public void deleteHotelSearch(@PathVariable long id) {
		hotelSearchService.deleteHotelSearch(id);
	}
}