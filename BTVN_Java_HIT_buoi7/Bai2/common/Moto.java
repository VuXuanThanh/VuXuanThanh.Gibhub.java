package Bai2.common;

import java.util.Scanner;

public class Moto extends Vehicle{
    private double phanKhoi;

    public Moto(){

    }

    @Override
    public void input(){
        Scanner scan = new Scanner(System.in);
        super.input();
        System.out.println("nhap so phan khoi : ");
        phanKhoi=scan.nextDouble();
    }

    @Override
    public void output(){
        super.output();
        System.out.println("Phan khoi cua xe: "+phanKhoi);
    }
    public double getPhanKhoi() {
        return phanKhoi;
    }

    public void setPhanKhoi(double phanKhoi) {
        this.phanKhoi = phanKhoi;
    }
}
