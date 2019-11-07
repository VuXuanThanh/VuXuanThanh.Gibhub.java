package Bai2.main;

import Bai2.common.HiepSi;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        HiepSi hiepSi = new HiepSi();
        hiepSi.nhapThongTin();
        while(hiepSi.HP>50){
            hiepSi.hoiMau();
            hiepSi.inThongTin();
            System.out.println();
        }

    }
}
