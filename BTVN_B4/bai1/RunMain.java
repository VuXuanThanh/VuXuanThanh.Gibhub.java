package JavaHitClass;

public class RunMain {
    public static void main(String[] args) {
        Person SonNghien = new Person();
        Person TuBueDe   = new Person();

       SonNghien.setName("son nguyen ");
       SonNghien.setAge(21);
       SonNghien.setHobby(" game ");
       SonNghien.setSex("nam ");

       TuBueDe.setName("tu nguyen ");
       TuBueDe.setAge(21);
       TuBueDe.setHobby(" book ");
       TuBueDe.setSex("nam ");
       System.out.println(SonNghien.getName()+ SonNghien.getAge()+SonNghien.getHobby()+SonNghien.getSex());
        System.out.println(TuBueDe.getName()+TuBueDe.getAge()+TuBueDe.getHobby()+TuBueDe.getSex());
    }
}
