 import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int h;
        System.out.println("nhập đường cao: ");
       h=scanner.nextInt();
       int x, output;
       for(int i=1;i<=h;i++){
            for(int j=0;j<=2*h;j++){
              x=Math.abs(j-h);
                output=i-x;
                if(output>0)
                    System.out.printf("%3d",output);
                else
                    System.out.printf("   ");
            }
           System.out.println();
       }
    }
}