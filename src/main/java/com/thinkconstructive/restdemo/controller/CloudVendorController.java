package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import com.thinkconstructive.restdemo.response.Reply;
import com.thinkconstructive.restdemo.service.CloudVendorService;
import io.swagger.annotations.ResponseHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cloudvendor")
public class CloudVendorController {

    @Autowired
    CloudVendorService cloudVendorService;
    @GetMapping("/{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable String vendorId){
      return   Reply.responseBuilder("Requested vendor details",HttpStatus.OK,cloudVendorService.getCloudVendor(vendorId));
    }
    @GetMapping
    public List<CloudVendor> getAllCloudVendors(){
        return cloudVendorService.getAllCloudVendors();
    }
    @PostMapping("/createVendor")
    public  String createCloudVendor(@RequestBody CloudVendor cloudVendor){
      return cloudVendorService.createCloudVendor(cloudVendor);
    }
    @PutMapping
    public String updateVendorDetails(@RequestBody CloudVendor cloudVendor){
       return cloudVendorService.updateCloudVendor(cloudVendor);
    }
    @DeleteMapping("/{vendorId}")
    public String deleteVendor(@PathVariable("vendorId") String vendorId){
       return cloudVendorService.deleteCloudVendor(vendorId);
    }


}
