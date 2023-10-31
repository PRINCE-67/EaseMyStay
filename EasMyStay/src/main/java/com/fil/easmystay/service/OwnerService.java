package com.fil.easmystay.service;

import java.util.List;

import com.fil.easmystay.models.Owner;

public interface OwnerService {

	public List<Owner> getAllOwners();

	public Owner getOwnerById(long ownerId);

	public Owner updateOwner(long ownerId, Owner updatedOwner);

	public void deleteOwner(long ownerId);

	public Owner createOwner(Owner owner);
}