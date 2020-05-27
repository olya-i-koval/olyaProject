package ua.edu.npu.lab06.task0603;

public class App implements InterfaceApp {

    public static void main(String[] args) {
        App app = new App();
        app.method("1 кОзак з казок 1");
    }

    @Override
    public String method(String line) {
        String myLine = line.toLowerCase();
        String reverse = new StringBuffer(myLine).reverse().toString();
        System.out.println(reverse);

        String str = myLine.replaceAll("[^а-я]", "");
        System.out.println(str);


        char[] lineArray = myLine.toCharArray();
        for (int i =0; i<lineArray.length; i++) {
            if( lineArray[i] ==lineArray[lineArray.length-1]) {
                System.out.println("паліндром");
            }
            else break;
        }

        return null;
    }
}
