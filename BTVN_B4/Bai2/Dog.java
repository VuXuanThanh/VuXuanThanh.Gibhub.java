package Bai2;

public class Dog {
    private String name;
    private int MP=100;

    public void inputName(String name){
        this.name = name;
    }
    public int ShowMP(){
        return MP;
    }
    public void Bark(){
        if(name==null){
            this.name = "xin loi chua dien ten";
        }
        else{
            System.out.println(name+ " sua");
            MP-=20;
        }
    }

}
