package com.pulkit.vendor.service;

import java.util.List;

import com.pulkit.vendor.entity.Vendor;

public interface VendorService {
	
	Vendor saveVendor(Vendor vendor);

	Vendor updateVendor(Vendor vendor);

	void deleteVendor(Vendor vendor);

	Vendor getVendorById(int id);

	List<Vendor> getAllVendors();
	
}
