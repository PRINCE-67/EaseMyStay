package com.fil.mmproject.services;

import java.util.List;

import com.fil.mmproject.models.Owner;

public interface OwnerService {

    List<Owner> getAllOwners();

    Owner getOwnerById(long ownerId);

    Owner updateOwner(long ownerId, Owner updatedOwner);

    void deleteOwner(long ownerId);

    Owner createOwner(Owner owner);
}