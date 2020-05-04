import java.util.Scanner;

public class Dog {

    int age;
    String name;
    Dog() {
        age = 0;
        name = "незнайомець";
       System.out.println("name: " + name);
       System.out.println("age: " + age);
    }
    Dog(int age, String name) {
        age =age;
        name =name;
       System.out.println("name: "+ name);
       System.out.println("age: "+ age);
    }

    public static void main(String[] args) {

       Dog dog1 = new Dog(12,"яко");
       Dog dog2 = new Dog();
    }


}

