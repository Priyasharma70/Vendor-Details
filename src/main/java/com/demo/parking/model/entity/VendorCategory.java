package com.demo.parking.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
public class VendorCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn
    private VendorRegistration vendorId;
    private String categoryName;
}
