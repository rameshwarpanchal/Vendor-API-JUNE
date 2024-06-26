package com.thinkconstructive.restdemo.service;

import com.thinkconstructive.restdemo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    String createCloudVendor(CloudVendor cloudVendor);
    String updateCloudVendor(CloudVendor cloudVendor);
    String deleteCloudVendor(String vendorId);
    CloudVendor getCloudVendor(String vendorId);
    List<CloudVendor> getAllCloudVendors();

}
