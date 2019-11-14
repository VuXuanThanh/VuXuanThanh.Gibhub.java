package Bai3.main;

import Bai3.common.CauLacbo;
import Bai3.common.Leader;
import Bai3.common.Member;
import Bai3.common.Support;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member[] members = new Member[10];
        Support support = new Support("Tung", 30);
        Leader leader = new Leader("Tu", 19, 20);
       CauLacbo cauLacBo = new CauLacbo();
        CauLacbo cauLacbo = new CauLacbo(leader, support);

        System.out.println("thanh vien trong nhom: ");
        for(int i=0;i<members.length;i++){
            System.out.println("nhap ten: ");
            String ten = scanner.nextLine();
            System.out.println("nhap ngay hd: ");
            int ngayHD= scanner.nextInt();
            scanner.nextLine();
            System.out.println("nhap so ngay nghi: ");
            int soNgayNghi=scanner.nextInt();
            scanner.nextLine();

            members[i]= new Member(ten, ngayHD, soNgayNghi);
            cauLacBo = new CauLacbo(members[i]);
        }
        System.out.println("Thong tin ve cau lac bo: ");
        cauLacbo.hienThiThongTin();
        for(int i=0;i<members.length;i++){
            System.out.println("thong tin thanh vien trong clb: ");
            cauLacBo.Display(members[i]);
        }
    }
}
