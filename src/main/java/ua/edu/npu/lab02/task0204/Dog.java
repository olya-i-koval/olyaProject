public class Dog {

    int age;
    String name;
    Dog() {
        age = 0;
        name = "незнайомець";
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        numb++;
    }
    Dog(int age, String name) {
        age =age;
        name =name;
        System.out.println("name: "+ name);
        System.out.println("age: "+ age);
        numb++;
    }

    private static int numb =0;

    public static int conter() {
        return numb;
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog(12, "яко");
        Dog dog2 = new Dog();
        System.out.println("the number of objects created: " + numb);
    }
}
