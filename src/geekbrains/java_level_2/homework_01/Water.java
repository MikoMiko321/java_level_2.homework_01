package geekbrains.java_level_2.homework_01;

import geekbrains.java_level_2.homework_01.Obstacle;

public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}
