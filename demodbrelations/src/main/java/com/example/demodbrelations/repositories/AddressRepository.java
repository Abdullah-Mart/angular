package com.example.demodbrelations.repositories;

import com.example.demodbrelations.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
