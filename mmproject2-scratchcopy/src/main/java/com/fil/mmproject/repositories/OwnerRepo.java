package com.fil.mmproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.mmproject.models.Owner;

@Repository
public interface OwnerRepo extends JpaRepository<Owner, Long>{

}
