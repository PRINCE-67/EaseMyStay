package com.fil.mmproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fil.mmproject.models.Owner;
import com.fil.mmproject.repositories.OwnerRepo;

@Service
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerRepo ownerRepository;

	@Override
	public List<Owner> getAllOwners() {
		return ownerRepository.findAll();
	}

	@Override
	public Owner getOwnerById(long ownerId) {
		return ownerRepository.findById(ownerId).orElse(null);
	}

	@Override
	public Owner updateOwner(long ownerId, Owner updatedOwner) {
		if (ownerRepository.existsById(ownerId)) {
			updatedOwner.setOwnerId(ownerId);
			return ownerRepository.save(updatedOwner);
		}
		return null; // Return null if owner with given ID does not exist.
	}

	@Override
	public void deleteOwner(long ownerId) {
		ownerRepository.deleteById(ownerId);
	}

	@Override
	public Owner createOwner(Owner owner) {
		return ownerRepository.save(owner);
	}
}