package ua.npu.edu.pattern.task04.figures;

import ua.npu.edu.pattern.task04.TetrisFigure;

import java.util.Random;

public class ZFig implements TetrisFigure {
    Random r = new Random();
    @Override
    public void create() {
        if (!isSuper(r.nextBoolean())) {
            System.out.println("Creating Z-Figure");
        }
        else {
            System.out.println("Creating SUPER Z-Figure");
        }
    }

    @Override
    public boolean isSuper(boolean active) {
        return active;
    }
}
