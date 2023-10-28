package com.fil.mmproject.controller.owner;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fil.mmproject.models.Owner;
import com.fil.mmproject.repositories.OwnerRepo;

@RestController
@RequestMapping("/owner")
public class OwnerController {

private OwnerRepo ownerRepo;
	
	@GetMapping("/getOwners")
	@ResponseBody
	public Object getOwners(Pageable pageable) {
		return ownerRepo.findAll(pageable);
	}
	
	@PostMapping("/addOwner")
	@ResponseBody
	public String addOwner(@RequestBody Owner owner) {

		Owner owner1 = new Owner();
		owner1.setAdmin(owner.getAdmin());
		owner1.setHotel(owner.getHotel());
		owner1.setOwnerEmail(owner.getOwnerEmail());
		owner1.setOwnerId(owner.getOwnerId());
		owner1.setOwnerName(owner.getOwnerName());
		
		ownerRepo.saveAndFlush(owner1);

		return "Owner added";
	}
	
	@DeleteMapping("/deleteOwner/{ownerId}")
	@ResponseBody
	public String deleteOwner(@PathVariable("hotelId") Long ownerId) {
		
		ownerRepo.deleteById(ownerId);
		return "Owner Successfully deleted!";
	}
	
	
}
