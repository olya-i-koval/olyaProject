package ua.edu.npu.lab06.task0603;

public class App implements AppInterface {
    public static void main(String[] args) {
        App app = new App();
        app.method("64 козак з казок 46");
    }
    @Override
    public String method(String line) {
        String reverse = new StringBuffer(line).reverse().toString();
        System.out.println(reverse);

        String myLine = line.toLowerCase();
        char[] lineArray = myLine.toCharArray();

        String newLine = myLine.replaceAll("[^а-я]", "");
        System.out.println(newLine);

        for (int i = 0; i < lineArray.length; i++) {
            if (lineArray[i] == lineArray[lineArray.length-1]) {
            }
        }
        System.out.println("паліндром");
        return null;
    }
}
