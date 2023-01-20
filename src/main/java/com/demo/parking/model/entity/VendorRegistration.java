package com.demo.parking.model.entity;

import com.demo.parking.web.rest.vm.Star;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@ToString
public class VendorRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vendorId;

    private String name;
    private String address;
    private String factoryAddress;
    private Long IECNumber;
    private Long registrationNo;
    private String star;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn
    private List<VendorDirector> detailsOfDirector;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn
    private List<VendorCategory> vendorsCategory;
    private String vendorNonFarmerSector;
}
