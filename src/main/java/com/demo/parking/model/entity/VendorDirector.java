package com.demo.parking.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
public class VendorDirector {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int directorId;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn
    private VendorRegistration vendorId;
    private String name;
    private String fatherName;
    private String address;
    private long telephoneNo;
    private long mobNo;
}
