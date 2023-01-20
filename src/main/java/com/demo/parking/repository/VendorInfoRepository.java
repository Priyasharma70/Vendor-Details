package com.demo.parking.repository;

import com.demo.parking.model.entity.VendorRegistration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorInfoRepository  extends CrudRepository<VendorRegistration, Long>  {
}
