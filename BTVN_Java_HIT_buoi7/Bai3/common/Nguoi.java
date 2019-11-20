package Bai3.common;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen,que;
    protected int ngaySinh;

    public Nguoi(){

    }

    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap ho ten: ");
        hoTen=scan.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh=Integer.parseInt(scan.nextLine());
        System.out.println("nhap que: ");
        que=scan.nextLine();
    }
    public void output(){
        System.out.println("Ho va ten: "+hoTen);
        System.out.println("ngay sinh: "+ngaySinh);
        System.out.println("Que quan: "+que);
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
