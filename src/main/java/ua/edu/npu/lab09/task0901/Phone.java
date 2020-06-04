package ua.edu.npu.lab09.task0901;

public class Phone implements Device {
    public void surfingTheInternet(String nameOfUser) {
        System.out.println(nameOfUser +" uses for surging the internet phone");
    }

    public void playGames(String nameOfUser) {
        System.out.println(nameOfUser +" uses for playing games phone");
    }

    public void forWorking(String nameOfUser) {
        System.out.println(nameOfUser +" uses for working phone");
    }
}
