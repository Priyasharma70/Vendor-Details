package com.demo.parking.service;

import com.demo.parking.model.entity.*;
import com.demo.parking.repository.VendorInfoRepository;
import com.demo.parking.web.rest.vm.RegistrationRequestVM;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VendorService {
    private final VendorInfoRepository vendorInfoRepository;

    public VendorService(VendorInfoRepository vendorInfoRepository) {
        this.vendorInfoRepository = vendorInfoRepository;
    }

    public void vendorDetails(RegistrationRequestVM registrationRequestVM) {

        VendorRegistration vendorRegistration = new VendorRegistration();

        List<VendorCategory> vendorCategoryList = new ArrayList<>();
        registrationRequestVM.getVendorsRegistrationList().stream().forEach(vendors -> {
            VendorCategory vendorCategory = new VendorCategory();
            vendorCategory.setCategoryName(vendors);
            vendorCategoryList.add(vendorCategory);
        });

        List<VendorDirector> detailsOfDirectorList = new ArrayList<>();
        registrationRequestVM.getDetailsOfDirectorList().stream().forEach(detailsOfDirector -> {
            VendorDirector vendorDirector = new VendorDirector();
            vendorDirector.setAddress(detailsOfDirector.getAddress());
            vendorDirector.setName(detailsOfDirector.getName());
            vendorDirector.setMobNo(detailsOfDirector.getMobNo());
            vendorDirector.setTelephoneNo(detailsOfDirector.getTelephoneNo());
            vendorDirector.setFatherName(detailsOfDirector.getFatherName());
            detailsOfDirectorList.add(vendorDirector);
        });

        vendorRegistration.setAddress(registrationRequestVM.getAddress());
        vendorRegistration.setName(registrationRequestVM.getName());
        vendorRegistration.setStar(registrationRequestVM.getStar().toString());
        vendorRegistration.setFactoryAddress(registrationRequestVM.getFactoryAddress());
        vendorRegistration.setIECNumber(registrationRequestVM.getIECNumber());
        vendorRegistration.setVendorNonFarmerSector(registrationRequestVM.getVendorNonFarmerSector());
        vendorRegistration.setDetailsOfDirector(detailsOfDirectorList);
        vendorRegistration.setVendorsCategory(vendorCategoryList);

        vendorInfoRepository.save(vendorRegistration);
    }
}




