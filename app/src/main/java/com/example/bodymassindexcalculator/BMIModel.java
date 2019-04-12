package com.example.bodymassindexcalculator;

public class BMIModel {
    String et_height, et_weight;

    public BMIModel(String et_height, String et_weight) {
        this.et_height = et_height;
        this.et_weight = et_weight;
    }

    public String getEt_height() {
        return et_height;
    }

    public String getEt_weight() {
        return et_weight;
    }

    public void setEt_height(String et_height) {
        this.et_height = et_height;
    }

    public void setEt_weight(String et_weight) {
        this.et_weight = et_weight;
    }
}


