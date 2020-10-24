package com.caofangqi.study;
/*
*
* 三孔插座适配器
* */
public class TripiexReceptacleAdapter implements PowerSource {

    TripiexReceptacle tripiexReceptacle;
    public TripiexReceptacleAdapter(TripiexReceptacle tripiexReceptacle){
        this.tripiexReceptacle=tripiexReceptacle;
    }
    @Override
    public void insert() {
        tripiexReceptacle.tripiexReceptacle();
    }
}
