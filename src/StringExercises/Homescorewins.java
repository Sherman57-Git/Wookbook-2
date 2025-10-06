package StringExercises;

public class Homescorewins {
    public static void main(String[] args) {
        String highscore = "Home:Visitor|21:9";
        // split it on pipe |
        String[] scoreBoard = highscore.split("\\|");
        // Split both halves of :
        String[] teams = scoreBoard[0].split(":");
        String[] scores = scoreBoard[1].split(":");

        // parse the results
        String team1 = teams[0];
        String teams2 = teams[1];
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        //decide who wins
        if(score1 > score2) {
            System.out.println("Winner:  " + team1);
        } else if(score1 < score2){

    }
    }

}
