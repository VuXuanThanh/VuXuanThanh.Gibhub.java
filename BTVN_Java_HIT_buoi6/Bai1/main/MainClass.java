package Bai1.main;

import Bai1.common.ConHeo;

public class MainClass {
    public static void main(String[] args) {
        ConHeo conHeo1 = new ConHeo("AA", 100.3f, 10);
        ConHeo conHeo2 = new ConHeo("BB", 100, 11);
        ConHeo conHeo3 = new ConHeo("CC", 100.45f, 12);
        ConHeo conHeo4 = new ConHeo("DD", 120, 12);
        ConHeo conHeo5 = new ConHeo("EE", 150.4343f, 15);

        System.out.println("thong tin: ");
        conHeo1.showInfor();
        conHeo2.showInfor();
        conHeo3.showInfor();
        conHeo4.showInfor();
        conHeo5.showInfor();

    }
}
