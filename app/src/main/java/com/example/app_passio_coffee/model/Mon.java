package com.example.app_passio_coffee.model;

public class Mon {
    private int imgMon;
    private String tenMon, giaMon, soLuong;

    public Mon(int imgMon, String tenMon, String giaMon) {
        this.imgMon = imgMon;
        this.tenMon = tenMon;
        this.giaMon = giaMon;
    }

    public Mon(int imgMon, String tenMon, String giaMon, String soLuong) {
        this.imgMon = imgMon;
        this.tenMon = tenMon;
        this.giaMon = giaMon;
        this.soLuong = soLuong;
    }

    public int getImgMon() {
        return imgMon;
    }

    public void setImgMon(int imgMon) {
        this.imgMon = imgMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getGiaMon() {
        return giaMon;
    }

    public void setGiaMon(String giaMon) {
        this.giaMon = giaMon;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
}
