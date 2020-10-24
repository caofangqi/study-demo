package com.caofangqi.study;

/*
 *
 * 插头
 * 这是一个 双孔插头
 * */
public class DoubleOrificePlug {


    private PowerSource powerSource;

    public DoubleOrificePlug() {
    }

    public DoubleOrificePlug(PowerSource powerSource) {
        this.powerSource = powerSource;
    }

    //通电
    public void powerOn() {
        //插入插座 通电
        powerSource.insert();
    }


    public void setPowerSource(PowerSource powerSource) {
        this.powerSource = powerSource;
    }
}
