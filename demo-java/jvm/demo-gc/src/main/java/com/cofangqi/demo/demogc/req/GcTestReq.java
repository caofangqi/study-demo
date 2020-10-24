package com.cofangqi.demo.demogc.req;

import lombok.Builder;
import lombok.Data;

/**
 * @author caofangqi
 * @since 2019/11/14 5:57 下午
 */
@Data
@Builder
public class GcTestReq {

    private int bytesSize;
    private int size;

    public GcTestReq() {
    }

    public GcTestReq(int size) {
        this.size = size;
    }

    public GcTestReq(int bytesSize, int size) {
        this.bytesSize = bytesSize;
        this.size = size;
    }
}
