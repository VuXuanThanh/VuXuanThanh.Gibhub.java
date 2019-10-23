package Bai2;

import Bai2.Dog;

public class runClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.inputName("Peter");
        for(int i=1;i<=3;i++){
            dog1.Bark();
            System.out.println("lan "+i+": "+ dog1.ShowMP());

        }
    }
}
