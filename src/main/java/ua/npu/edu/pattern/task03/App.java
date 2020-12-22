package ua.npu.edu.pattern.task03;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cash cash = new Cash();
        cash.setWiki(new Wiki());

        Wiki wiki = cash.getWiki();
    }

}
