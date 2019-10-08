import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        float delta;
        do{
            System.out.println("Nhập hệ số a: ");
            a = scanner.nextInt();
        }while(a==0);
        System.out.println("nhập hệ số b,c:");
        b = scanner.nextInt();
        c = scanner.nextInt();
        delta=b*b-4*a*c;
        if(delta<0)
            System.out.println("phương trình vô nghiệm");
        else if(delta==0)
            System.out.println("phương trình có nghiệm duy nhất: "+(-b/(2*a)));
        else{
            System.out.println("PT có nghiệm x1 = "+ ((-b-Math.sqrt(delta))/(2*a)));
            System.out.println("PT có nghiệm x2 = "+ ((-b+Math.sqrt(delta))/(2*a)));
        }
}
}
