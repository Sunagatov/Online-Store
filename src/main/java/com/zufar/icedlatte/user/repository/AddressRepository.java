package com.zufar.icedlatte.user.repository;

import com.zufar.icedlatte.user.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository  extends JpaRepository<Address, UUID> {
}
