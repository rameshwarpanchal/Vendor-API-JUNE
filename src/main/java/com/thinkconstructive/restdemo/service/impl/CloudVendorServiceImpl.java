package com.thinkconstructive.restdemo.service.impl;

import com.thinkconstructive.restdemo.exception.CloudVendorNotFoundException;
import com.thinkconstructive.restdemo.model.CloudVendor;
import com.thinkconstructive.restdemo.repo.CloudVendorRepo;
import com.thinkconstructive.restdemo.service.CloudVendorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    private static final Logger logInfo = LoggerFactory.getLogger(CloudVendorServiceImpl.class);

    CloudVendorRepo cloudVendorRepo;

    public CloudVendorServiceImpl(CloudVendorRepo cloudVendorRepo) {
        this.cloudVendorRepo = cloudVendorRepo;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        CloudVendor save = cloudVendorRepo.save(cloudVendor);
        logInfo.info("in the logger");
        return "Vendor Created";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepo.save(cloudVendor);
        return "Vendor Updated";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepo.deleteById(vendorId);
        return "Deleted successfully";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        if (cloudVendorRepo.findById(vendorId).isEmpty())
            throw new CloudVendorNotFoundException("Vendor not Found");
        CloudVendor cloudVendor = cloudVendorRepo.findById(vendorId).get();

        return cloudVendor;
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepo.findAll();
    }
}
