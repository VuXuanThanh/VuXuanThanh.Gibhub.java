package Bai1.common;

import java.util.Scanner;

public class Member {
    private int maSV;
    private String ten;
    private int tuoi;
    private String lop;

    public Member(){
    }
    public Member(int maSV, String ten, int tuoi, String lop){
        this.ten=ten;
        this.maSV=maSV;
        this.tuoi=tuoi;
        this.lop=lop;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
