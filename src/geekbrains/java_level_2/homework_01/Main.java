package geekbrains.java_level_2.homework_01;

public class Main {
    public static void main(String[] args) {
//        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
//        Obstacle[] course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120)};
//        for (Competitor c : competitors) {
//            for (Obstacle o : course) {
//                o.doIt(c);
//                if (!c.isOnDistance()) break;
//            }
//        }
//        for (Competitor c : competitors) {
//            c.info();
//        }

        Course course1 = new Course(new Obstacle[]{new Cross(1080), new Wall(2), new Wall(1), new Cross(120)});
        Team team1 = new Team("Hurricane", new Human("Hercules"), new Dog("Cerberus"), new Dog("Hatiko"), new Cat("Fluffy"));
        course1.doIt(team1);
        team1.showResults();
        team1.showWinners();
    }
}