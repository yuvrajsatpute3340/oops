package Encapsulation;

public class ExamApp {
    public static void main(String[] args) {

        ExamResult result = new ExamResult();

        result.setScore(85);
        System.out.println("Score: " + result.getScore());
    }
}

class ExamResult {

    private int score;

    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("Invalid score!");
        }
    }

    public int getScore() {
        return score;
    }
}