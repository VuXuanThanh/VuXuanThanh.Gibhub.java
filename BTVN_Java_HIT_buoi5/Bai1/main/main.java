package Bai1.main;

import Bai1.common.Member;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("nhap so luong thanh vien: ");
        n =scanner.nextInt();
        Member[] Club = new Member[n];
        for(int i=0;i<Club.length;i++){
            System.out.println("nhap ma sv:");
            int maSV=scanner.nextInt();
            System.out.println("nhap ten: ");
            scanner.nextLine();
            String ten=scanner.nextLine();
            System.out.println("nhap tuoi: ");
            int tuoi=scanner.nextInt();
            System.out.println("nhap lop: ");
            String lop=scanner.nextLine();

            Club[i]= new Member(maSV, ten, tuoi, lop);
            scanner.nextLine();
            System.out.println();
        }
        for(Member me: Club){
           if(me.getTen().equals("HIT")){
               System.out.println(me.getMaSV()+" "+me.getTen()+" "+
                       me.getTuoi()+" "+me.getLop());
           }
        }

    }
}
