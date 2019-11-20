package Bai1.main;

import Bai1.common.KySu;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,max;
        System.out.println("so ki su: ");
        n = scan.nextInt();
        KySu[] kySu = new KySu[n];
        for(int i=0;i<kySu.length;i++){
            kySu[i] = new KySu();
            kySu[i].input();
        }
        System.out.println("Xuat thong tin: ");
        for(KySu ks: kySu){
            ks.output();
        }
        max = kySu[0].namTotNghiep;
        for(int i=0;i<kySu.length;i++){
            if(kySu[i].namTotNghiep>max)
                max=kySu[i].namTotNghiep;
        }
        System.out.println("Ky su tot nghiep gan day nhat: ");
        for(KySu ks: kySu){
            if(ks.namTotNghiep==max){
                ks.output();
            }
        }
    }
}
