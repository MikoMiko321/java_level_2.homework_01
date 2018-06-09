package geekbrains.java_level_2.homework_01;

import geekbrains.java_level_2.homework_01.Obstacle;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}