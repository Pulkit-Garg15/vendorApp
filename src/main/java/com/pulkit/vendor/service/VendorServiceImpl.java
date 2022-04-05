package com.pulkit.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulkit.vendor.entity.Vendor;
import com.pulkit.vendor.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository repository;
	
	@Override
	public Vendor saveVendor(Vendor vendor) {
		return repository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return repository.save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		repository.delete(vendor);
	}

	@Override
	public Vendor getVendorById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Vendor> getAllVendors() {
		return repository.findAll();
	}

}
