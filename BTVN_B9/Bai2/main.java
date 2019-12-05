package Bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n;
         long sum;
        do{
            System.out.println("nhap vao so tien dien: ");
            n = scan.nextInt();
        }while(n<=0);
        if(n<=50){
            sum=n*4000;
        }
        else if(n>50&&n<=100){
            sum=50*4000+(n-50)*3000;
        }
        else{
            sum=50*4000+50*3000+(n-100)*2990;
        }
        System.out.println("Tien dien: "+sum);
    }
}
