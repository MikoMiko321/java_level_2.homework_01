package geekbrains.java_level_2.homework_01;

public class Course {
    Obstacle[] course;
    public Course(Obstacle[] course) {
        this.course = course;
    }
    public void doIt (Team team){
        for (Competitor c : team.teamMembers) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
