package ua.edu.npu.lab03.task0304;

public class Dog implements Talking, Walking  {
        public static void main(String[] args) {
            Pet dog1 = new Pet("яко", 12);
            Pet dog2 = new Pet();
            Dog dog = new Dog();
            dog.talk();
            dog.walking();
        }

    @Override
    public void talk() {
        System.out.println("woof-woof");
    }

    @Override
    public void walking() {
        System.out.println("I go");
    }
}

