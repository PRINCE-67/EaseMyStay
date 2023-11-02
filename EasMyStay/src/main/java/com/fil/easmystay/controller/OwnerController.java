package com.fil.easmystay.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fil.easmystay.models.Owner;
import com.fil.easmystay.service.AdminService;
import com.fil.easmystay.service.HotelService;
import com.fil.easmystay.service.OwnerService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Owners")
public class OwnerController {

	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@PostMapping("/createOwner")
	public Owner createOwner(
			@RequestBody Owner owner) {
		// Retrieve admin and hotel data using the provided IDs and associate them with
		// the owner
		return ownerService.createOwner(owner);
	}

	@GetMapping("/{ownerId}")
	public Owner getOwnerById(@PathVariable long ownerId) {
		Owner owner = ownerService.getOwnerById(ownerId);
		return owner;
	}

	@GetMapping("/getAllOwners")
	public List<Owner> getAllOwners() {
		List<Owner> owners = ownerService.getAllOwners();
		return owners;
	}

	@PutMapping("/{ownerId}")
	public Owner updateOwner(@PathVariable long ownerId,@RequestBody Owner updatedOwner) {
		return ownerService.updateOwner(ownerId, updatedOwner);
	}

	@DeleteMapping("/{ownerId}")
	public void deleteOwner(@PathVariable long ownerId) {
		ownerService.deleteOwner(ownerId);
	}
}