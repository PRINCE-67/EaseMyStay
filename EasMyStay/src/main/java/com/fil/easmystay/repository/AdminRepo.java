package com.fil.easmystay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.easmystay.models.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long>{
}
