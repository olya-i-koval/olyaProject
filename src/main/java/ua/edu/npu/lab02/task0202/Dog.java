import java.util.Scanner;

public class Dog {


    public static void main(String[] args) {
        int age;
        String name;
        Scanner reader = new Scanner(System.in);
        System.out.println("enter name: ");
        name = reader.nextLine();
        System.out.println("enter age: ");
        age = reader.nextInt();


        Dog dog = new Dog();
        for (int i = 0; i<age; i++)
        dog.voice();

    }

    public void voice() {
        System.out.println("гав-гав");
    }
}
