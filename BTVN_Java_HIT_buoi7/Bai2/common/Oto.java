package Bai2.common;

import java.util.Scanner;

public class Oto extends Vehicle {
    private int soGhe;
    private double dungTich;

    @Override
    public void input(){
        Scanner scan = new Scanner(System.in);
        super.input();
        System.out.println("nhap so ghe ngoi: ");
        soGhe=Integer.parseInt(scan.nextLine());
        System.out.println("nhap dung tich: ");
        dungTich=scan.nextDouble();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("So ghe ngoi: "+soGhe);
        System.out.println("Dung tich: "+dungTich);
    }
    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public double getDungTich() {
        return dungTich;
    }

    public void setDungTich(double dungTich) {
        this.dungTich = dungTich;
    }
}
