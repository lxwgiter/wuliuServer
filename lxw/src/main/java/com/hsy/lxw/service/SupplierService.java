package com.hsy.lxw.service;

import com.hsy.lxw.mapper.SupplierMapper;
import com.hsy.lxw.pojo.Supplier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SupplierService {
    @Resource
    private SupplierMapper supplierMapper;

    public Supplier getSupplierByName(String name){
        Supplier supplier = supplierMapper.getSupplierByName(name);
        return supplier;
    }
}
