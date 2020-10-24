package com.cofangqi.demo.demogc.controller;

import com.cofangqi.demo.demogc.domain.GcTestEntity;
import com.cofangqi.demo.demogc.req.GcTestReq;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caofangqi
 * @since 2019/11/14 12:21 上午
 */
@RestController
@RequestMapping("/gcTest")
public class GcTestController {


    List<GcTestEntity> rootList = new ArrayList<>();

    @RequestMapping("/addMemory")
    public String addMemory(@RequestBody GcTestReq req){
        rootList = new ArrayList<>();
        for (int i = 0; i < req.getSize(); i++) {
            rootList.add(new GcTestEntity(req.getBytesSize()));
        }
        return "当前rootList 大小:"+rootList.size();
    }

}
