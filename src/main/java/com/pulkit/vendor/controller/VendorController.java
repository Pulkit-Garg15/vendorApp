package com.pulkit.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pulkit.vendor.entity.Vendor;
import com.pulkit.vendor.service.VendorService;

@Controller
public class VendorController {
	
	@Autowired
	VendorService service;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createVendor";
	}
	
	@RequestMapping("/saveVen")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor , ModelMap map) {
		Vendor savedVendor = service.saveVendor(vendor);
		String msg = "Vendor saved with id: " + savedVendor.getId();
		map.addAttribute("msg", msg);
		return "createVendor";
	}
	
	@RequestMapping("/displayVendors")
	public String displayVendors(ModelMap map) {
		List<Vendor> vendors = service.getAllVendors();
		map.addAttribute("vendors" , vendors);
		return "displayVendors";
	}
	
	@RequestMapping("/deleteVendor")
	public String deleteVendor(@ModelAttribute("id") int id , ModelMap map) {
		service.deleteVendor(service.getVendorById(id));
		List<Vendor> vendors = service.getAllVendors();
		map.addAttribute("vendors" , vendors);
		return "displayVendors";
	}
	
	@RequestMapping("/updateVendor")
	public String showUpdateVendor(@ModelAttribute("id") int id , ModelMap map) {
		Vendor vendor = service.getVendorById(id);
		map.addAttribute("vendor", vendor);
		return "updateVendor";
	}
	
	@RequestMapping("/updateVen")
	public String updateVendor(@ModelAttribute("vendor") Vendor vendor , ModelMap map) {
		service.updateVendor(vendor);
		List<Vendor> vendors = service.getAllVendors();
		map.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
}
