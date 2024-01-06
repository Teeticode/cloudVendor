package com.example.cloudvendor.controller;

import com.example.cloudvendor.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return new CloudVendor("C1","vendor 1",
                "Address One", "xxxx");
    }
}
