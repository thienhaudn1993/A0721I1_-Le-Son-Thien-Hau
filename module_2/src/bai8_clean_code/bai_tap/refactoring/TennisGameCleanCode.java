package bai8_clean_code.bai_tap.refactoring;

public class TennisGameCleanCode {
    static final int ZERO = 0;
    static final int ONE = 1;
    static final int TWO = 2;
    static final int THREE = 3;
    public static String comparePlayer(int scorePlayer1, int scorePlayer2){
        String score = "";
        int minusResult = scorePlayer1-scorePlayer2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }
    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore=0;
        boolean scorePlayer12 = scorePlayer1>=4 || scorePlayer2>=4;
        if (scorePlayer1==scorePlayer2)
        {
            switch (scorePlayer1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (scorePlayer12)
        {
            score = comparePlayer(scorePlayer1,scorePlayer2);
        }
        else
        {
            for (int i=1; i<3; i++) {
                if (i==1) tempScore = scorePlayer1;
                else { score+="-"; tempScore = scorePlayer2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
