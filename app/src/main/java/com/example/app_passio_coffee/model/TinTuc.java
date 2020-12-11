package com.example.app_passio_coffee.model;

public class TinTuc {
    private int img;
    private String titletintuc, noidungtintuc ;

    public TinTuc(int img, String titletintuc, String noidungtintuc) {
        this.img = img;
        this.titletintuc = titletintuc;
        this.noidungtintuc = noidungtintuc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitletintuc() {
        return titletintuc;
    }

    public void setTitletintuc(String titletintuc) {
        this.titletintuc = titletintuc;
    }

    public String getNoidungtintuc() {
        return noidungtintuc;
    }

    public void setNoidungtintuc(String noidungtintuc) {
        this.noidungtintuc = noidungtintuc;
    }
}
