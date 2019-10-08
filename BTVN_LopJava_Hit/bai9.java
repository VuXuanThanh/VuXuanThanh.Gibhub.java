import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        float a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập hệ số a: ");
        a = scanner.nextFloat();
        System.out.println("nhập hệ số b: ");
        b = scanner.nextFloat();
        if(a==0){
            if(b==0)
                System.out.println("phương trình vô số nghiệm");
            else
                System.out.println("phương trình vô nghiệm");
        }
        else{
            System.out.println("phương trình có nghiệm duy nhất: "+ (-b/a));
        }
    }
}
