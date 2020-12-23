package ua.npu.edu.pattern.task04.figures;

import ua.npu.edu.pattern.task04.TetrisFigure;

import java.util.Random;

public class JFig  implements TetrisFigure {
    public JFig() {}

    Random r = new Random();

    @Override
    public void create() {
        if (!isSuper(r.nextBoolean())) {
            System.out.println("Creating J-Figure");
        }
        else {
            System.out.println("Creating SUPER J-Figure");
        }
    }

    @Override
    public boolean isSuper(boolean active) {
        return active;
    }
}
