package com.sk.LLD.GeneralLearnings;

import lombok.Data;

@Data
class User{
    String name;
    int age;
    static String role="DEVELOPER";

    public String toString(){

        return this.name+" -> "+this.age+" -> "+role;
    }

}
public class StaticExample {
    public static void main(String[] args) {
        User user=new User();
        user.setAge(33);
        user.setName("ABCDE");
        System.out.println(user.toString());
    }
}
