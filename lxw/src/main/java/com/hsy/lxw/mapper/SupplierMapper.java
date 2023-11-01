package com.hsy.lxw.mapper;

import com.hsy.lxw.pojo.Supplier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierMapper {
    Supplier getSupplierByName(@Param("name") String name);
}
