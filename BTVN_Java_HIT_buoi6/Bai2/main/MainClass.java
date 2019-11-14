package Bai2.main;

import Bai2.common.MayTinh;

public class MainClass {
    public static void main(String[] args) {
       float []arr= {1,2,3,4,5};
        MayTinh mayTinh = new MayTinh();
        System.out.println("tong 2 so : "+mayTinh.TinhTong(10,10));
        System.out.println("tong 3 so : "+mayTinh.TinhTong(10,132.323f,3252.44f));
        System.out.println("tong mang : "+mayTinh.TinhTong(arr));
    }
}
