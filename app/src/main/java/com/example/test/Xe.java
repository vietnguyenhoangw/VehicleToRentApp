package com.example.test;

public class Xe {
    int hinh;
    String ten;
    int giathuengay;
    int giathuegio;

    public Xe(int hinh, String ten, int giathuengay, int giathuegio) {
        this.hinh = hinh;
        this.ten = ten;
        this.giathuengay = giathuengay;
        this.giathuegio = giathuegio;
    }

    public Xe(String ten, int giathuengay, int giathuegio) {
        this.ten = ten;
        this.giathuengay = giathuengay;
        this.giathuegio = giathuegio;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGiathuengay() {
        return giathuengay;
    }

    public void setGiathuengay(int giathuengay) {
        this.giathuengay = giathuengay;
    }

    public int getGiathuegio() {
        return giathuegio;
    }

    public void setGiathuegio(int giathuegio) {
        this.giathuegio = giathuegio;
    }
}
