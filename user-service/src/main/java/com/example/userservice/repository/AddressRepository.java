package com.example.userservice.repository;

import com.example.userservice.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,String> {
    List<Address> findAllByUserId(String userId);
}
