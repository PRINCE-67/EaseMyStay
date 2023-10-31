package com.fil.easmystay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fil.easmystay.models.Owner;
import com.fil.easmystay.service.OwnerService;

@Controller
@RequestMapping
public class OwnerController {

	private OwnerService ownerService;

	@PostMapping("/owners")
	public Owner createOwner(@RequestBody Owner owner) {
		return ownerService.createOwner(owner);
	}

	@GetMapping("/owners/{ownerId}")
	public Owner getOwnerById(@PathVariable long ownerId) {
		return ownerService.getOwnerById(ownerId);
	}

	@GetMapping("/owners")
	public List<Owner> getAllOwners() {
		return ownerService.getAllOwners();
	}

	@PutMapping("/owners/{ownerId}")
	public Owner updateOwner(@PathVariable long ownerId, @RequestBody Owner updatedOwner) {
		return ownerService.updateOwner(ownerId, updatedOwner);
	}

	@DeleteMapping("/owners/{ownerId}")
	public void deleteOwner(@PathVariable long ownerId) {
		ownerService.deleteOwner(ownerId);
	}
}