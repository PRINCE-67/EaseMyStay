package com.fil.mmproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.mmproject.models.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
