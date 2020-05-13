package com.cts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Vendor;

@Repository
public interface VendorRepository extends CrudRepository<Vendor, Long> {

}
