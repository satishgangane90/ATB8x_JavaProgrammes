package sept.Task20092024;

public class TernaryHighestGrade {


    public static void main(String[] args) {

        int score = 99;

        // score >= 90 → A
    // score >= 80 →B
        // score >= 70 → C

                String grade =  (score >=90) ? "A":
                                (score >=80) ? "B":
                                (score >=70) ? "c": "fail";
                System.out.println("Garde = "+" "+grade);





    }
}
