import java.util.Scanner;
// em gộp bài 5,6 ạ!!
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,m1;
        float n2,m2;
        System.out.println("nhập số nguyên n1:");
        n1 = scanner.nextInt();
        System.out.println("Nhập số nguyên m1: ");
        m1 = scanner.nextInt();
        System.out.println("tổng 2 số nguyên: "+ (n1+m1));
        System.out.println("nhập số thực n2: ");
        n2 = scanner.nextFloat();
        System.out.println("nhập số thực m2: ");
        m2 = scanner.nextFloat();
        System.out.println("tổng 2 số thực là: "+ (n2+m2));
        System.out.println("tổng của "+ n1+" và "+n2+" 1" +
                "là: "+(n1+n2));


    }
}