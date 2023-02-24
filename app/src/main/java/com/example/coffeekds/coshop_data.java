package com.example.coffeekds;

public class coshop_data {
    private String coshopName;
    private String coshopLocate;
    private Integer coshopImg;

    public coshop_data(String coshopName, String coshop_Locate, Integer coshopImg ) {
        this.coshopName = coshopName;
        this.coshopLocate = coshop_Locate;
        this.coshopImg = coshopImg;
    }

    public String getCoshopName() {
        return coshopName;
    }
    public void setCoshopName(String coshopName) {
        this.coshopName = coshopName;
    }
    public String getCoshopData(){
        return coshopLocate;
    }
    public void setCoshopData(String coshopData) {
        this.coshopLocate = coshopData;
    }
    public Integer getCoshopImg(){
        return coshopImg;
    }
    public void setCoshopImg(Integer coshopImg) {
        this.coshopImg = coshopImg;
    }
}
