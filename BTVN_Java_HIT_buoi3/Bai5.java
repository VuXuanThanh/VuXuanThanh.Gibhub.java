import java.math.BigInteger;
import java.util.Scanner;
// tính số nguyên lớn
public class Bai5 {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        BigInteger a,b;
        System.out.println("nhap so a: ");
        a = scanner.nextBigInteger();
        System.out.println("nhap so b: ");
        b = scanner.nextBigInteger();
        BigInteger c = a.add(b);
        System.out.println(c);

    }
}
