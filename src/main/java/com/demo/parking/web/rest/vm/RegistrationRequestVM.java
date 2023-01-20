package com.demo.parking.web.rest.vm;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegistrationRequestVM {
    private String name;
    private String address;
    private String factoryAddress;
    private Long IECNumber;
    private Long registrationNo;
    private Star star;
    private List<DetailsOfDirector> detailsOfDirectorList;
    private List<String> vendorsRegistrationList;
    private String vendorNonFarmerSector;
}
