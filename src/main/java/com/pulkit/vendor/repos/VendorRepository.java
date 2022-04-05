package com.pulkit.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pulkit.vendor.entity.Vendor;

public interface VendorRepository extends JpaRepository<Vendor , Integer> {

}
