package com.cofangqi.demo.demogc.domain;

import lombok.Data;

/**
 * @author caofangqi
 * @since 2019/11/14 5:55 下午
 */
@Data
public class GcTestEntity {

    private byte [] bytes= null;


    public GcTestEntity(int size){
        bytes = new byte[size];
    }

}
