package com.thinkconstructive.restdemo.repo;

import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudVendorRepo extends JpaRepository<CloudVendor,String> {
}
