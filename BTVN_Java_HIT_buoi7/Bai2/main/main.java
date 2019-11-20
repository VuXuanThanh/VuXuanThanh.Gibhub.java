package Bai2.main;

import Bai2.common.Moto;
import Bai2.common.Oto;

public class main {
    public static void main(String[] args) {
        Oto oto = new Oto();
        Moto moto = new Moto();

        System.out.println("thong tin ve oto: ");
        oto.input();
        oto.output();

        System.out.println("thong tin ve moto: ");
        moto.input();
        moto.output();


    }
}
