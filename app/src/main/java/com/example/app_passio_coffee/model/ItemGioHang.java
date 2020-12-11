package com.example.app_passio_coffee.model;

import android.widget.TextView;

public class ItemGioHang {
    private int imgMon;
    private String tenMon, soLuongMon, giaMon;

    public ItemGioHang(int imgMon, String tenMon, String soLuongMon, String giaMon) {
        this.imgMon = imgMon;
        this.tenMon = tenMon;
        this.soLuongMon = soLuongMon;
        this.giaMon = giaMon;
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

    public String getSoLuongMon() {
        return soLuongMon;
    }

    public void setSoLuongMon(String soLuongMon) {
        this.soLuongMon = soLuongMon;
    }

    public String getGiaMon() {
        return giaMon;
    }

    public void setGiaMon(String giaMon) {
        this.giaMon = giaMon;
    }
}
