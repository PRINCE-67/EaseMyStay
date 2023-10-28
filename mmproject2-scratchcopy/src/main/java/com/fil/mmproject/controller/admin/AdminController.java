package com.fil.mmproject.controller.admin;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fil.mmproject.models.Admin;
import com.fil.mmproject.repositories.AdminRepo;

@RestController
@RequestMapping("/")
public class AdminController {

private AdminRepo adminRepo;
	
	@GetMapping("/getAdmins")
	@ResponseBody
	public Object getHotels(Pageable pageable) {
		return adminRepo.findAll(pageable);
	}
	
	@PostMapping("/addadmin")
	@ResponseBody
	public String addHotel(@RequestBody Admin admin) {

		Admin admin1 = new Admin();
		admin1.setAdminId(admin.getAdminId());
		admin1.setCustomer(admin.getCustomer());
		admin1.setHotel(admin.getHotel());
		admin1.setOwner(admin.getOwner());
		admin1.setReservation(admin.getReservation());

		adminRepo.saveAndFlush(admin1);

		return "Admin added";
	}
	
//	@DeleteMapping("/deleteAdmin/{adminId}")
//	@ResponseBody
//	public String deleteHotel(@PathVariable("hotelId") Integer adminId) {
//		
//		adminRepo.deleteById(adminId);
//		return "Admin Successfully deleted!";
//	}
	
}
