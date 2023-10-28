package com.fil.mmproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.mmproject.models.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
