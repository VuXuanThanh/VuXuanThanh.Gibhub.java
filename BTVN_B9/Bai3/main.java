package Bai3;

import java.util.Scanner;

public class main {
    public static void taoMang(Hacker[] hacker){
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<hacker.length;i++){
            System.out.println("nhap ten: ");
            String ten= scan.nextLine();
            System.out.println("nhap dia chi: ");
            String diaChi = scan.nextLine();
            System.out.println("nhap nam sinh: ");
            int namSinh = Integer.parseInt(scan.nextLine());
            System.out.println("nhap so thich: ");
            String soThich = scan.nextLine();

            hacker[i] = new Hacker(ten, diaChi, namSinh, soThich);

        }
    }
    public static void timKiem(Hacker[] hacker){

        System.out.println("tim kiem1: ");
        for(int i=0;i<hacker.length;i++){
            if(2019-hacker[i].getNamSinh()==18){
                hacker[i].HienThiThongTin();
            }
        }
    }

    public static void timKiem2(Hacker[] hacker){
        System.out.println("tim kiem 2: ");
        for(int i=0;i<hacker.length;i++){
            if(hacker[i].getTen().charAt(0)=='t'){
                hacker[i].HienThiThongTin();
            }
            if(hacker[i].getTen().charAt(0)=='T'){
                hacker[i].HienThiThongTin();
            }
        }
    }
    public static void main(String[] args) {
        Hacker hacker1 = new Hacker();
        hacker1.setTen("A");
        hacker1.setNamSinh(2000);
        hacker1.setDiaChi("Ha Noi");
        hacker1.setSoThich("Bong da");
        System.out.println(hacker1.getTen()+" "+hacker1.getNamSinh()+" "+hacker1.getSoThich()+" "+
                hacker1.getSoThich());
        System.out.println();
        Hacker hacker2 = new Hacker("B", "Thai Binh", 2000, "Anime");
        hacker2.HienThiThongTin();

        Hacker[] hacker = new Hacker[10];
        taoMang(hacker);
        timKiem(hacker);
        timKiem2(hacker);
    }
}
