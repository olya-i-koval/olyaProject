package ua.edu.npu.lab06.task0604;

import ua.edu.npu.lab06.task0604.task1.Main;
import ua.edu.npu.lab06.task0604.task3.App;

public class Application {
    public static void main(String[] args) {
        Main m = new Main();
        m.method();

        ua.edu.npu.lab06.task0604.task2.Main main = new ua.edu.npu.lab06.task0604.task2.Main();
        main.method(4);

        App app = new App();
        app.method("nklsj5");
    }
}
