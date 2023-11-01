package com.hsy.lxw.controller;

import com.hsy.lxw.pojo.Supplier;
import com.hsy.lxw.service.SupplierService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SupplierController {
    @Resource
    private SupplierService supplierService;

    @GetMapping("/getSupplier")
    public Supplier getSupplier(@RequestParam("name") String name){
        Supplier supplier = supplierService.getSupplierByName(name);
        return supplier;
    }

}
