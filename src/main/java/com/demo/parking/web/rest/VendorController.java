package com.demo.parking.web.rest;

import com.demo.parking.service.VendorService;
import com.demo.parking.web.rest.vm.RegistrationRequestVM;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendorController {
    private final VendorService vendorService;


    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @PostMapping("/Vendor-Details")
    public void vendorDetails(@RequestBody RegistrationRequestVM registrationRequestVM) {
        vendorService.vendorDetails(registrationRequestVM);
    }


    }

