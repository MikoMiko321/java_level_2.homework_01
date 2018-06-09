package geekbrains.java_level_2.homework_01;

import geekbrains.java_level_2.homework_01.Obstacle;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}