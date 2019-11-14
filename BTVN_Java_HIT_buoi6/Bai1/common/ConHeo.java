package Bai1.common;

public class ConHeo {
    private String name;
    private float weight;
    private int age;

    public ConHeo(String name){
        this.name=name;
    }
    public ConHeo(float weight){
        this.weight=weight;
    }
    public ConHeo(int age){
        this.age=age;
    }
    public ConHeo(String name, float weight){
        this.name=name;
        this.weight=weight;
    }
    public ConHeo(String name, float weight, int age){
        this(name,weight);
        this.age=age;
    }
    public void showInfor(){
        System.out.println("name: "+name);
        System.out.println("weight: "+weight);
        System.out.println("age: "+age);
        System.out.println();
    }
}
