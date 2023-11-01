package com.hsy.lxw.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Supplier {
    private int id;
    private String supplierName;
    private String weightPrice;
    private String des;
    private Date createTime;
    private int adminId;
}
