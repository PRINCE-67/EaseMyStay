package com.fil.mmproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fil.mmproject.models.Owner;
import com.fil.mmproject.services.OwnerServiceImpl;

@RestController
@RequestMapping("/owner")
public class OwnerController {

	@Autowired
    private OwnerServiceImpl ownerService;

	@GetMapping("/home")
	public String home() {
		System.out.println("Hi! Just an update. The One Piece is real.");
		return "Hello World!";
	}
	
    @PostMapping("/addOwner")
    public Owner createOwner(@RequestBody Owner owner) {
        return ownerService.createOwner(owner);
    }

    @GetMapping("/getOwner/{ownerId}")
    public Owner getOwnerById(@PathVariable long ownerId) {
        return ownerService.getOwnerById(ownerId);
    }

    @GetMapping("/getOwners")
    public List<Owner> getAllOwners() {
        return ownerService.getAllOwners();
    }

    @PutMapping("/updateOwnerById/{ownerId}")
    public Owner updateOwner(@PathVariable long ownerId, @RequestBody Owner updatedOwner) {
        return ownerService.updateOwner(ownerId, updatedOwner);
    }

    @DeleteMapping("/deleteOwner/{ownerId}")
    public void deleteOwner(@PathVariable long ownerId) {
        ownerService.deleteOwner(ownerId);
    }
}