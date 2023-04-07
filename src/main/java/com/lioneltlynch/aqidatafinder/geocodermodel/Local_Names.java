package com.lioneltlynch.aqidatafinder.geocodermodel;

public class Local_Names {
    private String feature_name;
    private String ascii;
    private String ca;
    private String en;

    public Local_Names(String feature_name, String ascii, String ca, String en) {
        this.feature_name = feature_name;
        this.ascii = ascii;
        this.ca = ca;
        this.en = en;
    }

    public String getAscii() {
        return ascii;
    }

    public void setAscii(String ascii) {
        this.ascii = ascii;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getFeature_name() {
        return feature_name;
    }

    public void setFeature_name(String feature_name) {
        this.feature_name = feature_name;
    }

    public String get(String en) {
        return en;
    }
}
