package geekbrains.java_level_2.homework_01;

public class Team {
    String teamName;
    Competitor[] teamMembers = new Competitor[4];

    public Team(String teamName, Competitor member0, Competitor member1, Competitor member2, Competitor member3) {
        this.teamName = teamName;
        this.teamMembers[0] = member0;
        this.teamMembers[1] = member1;
        this.teamMembers[2] = member2;
        this.teamMembers[3] = member3;
    }

    void showResults(){
        System.out.println("Results for the members of the team "+teamName+":");
        for(Competitor c: teamMembers){
            c.info();
        }
    }

    void showWinners(){
        System.out.println("Members of the team "+teamName+" who succeded on course:");
        for(Competitor c: teamMembers){
            if(c.isOnDistance()){
                c.info();
            }
        }
    }
}
