import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double result = 0.0;
        double subjectRatingSum = 0.0;
        for (int i = 0; i < 20; i++) {
            String[] gradeCard = br.readLine().split(" ");
            double subjectRating = getSubjectRating(gradeCard[2]);
            if (subjectRating != -1){
                result += Double.parseDouble(gradeCard[1]);
                subjectRatingSum += (Double.parseDouble(gradeCard[1]) * subjectRating);
            }
        }

        System.out.println(subjectRatingSum / result);
        br.close();
    }

    public static double getSubjectRating(String rating) {
        double result = 0.0;
        if ("A+".equals(rating)) {
            result = 4.5;
        } else if ("A0".equals(rating)) {
            result = 4.0;
        } else if ("B+".equals(rating)) {
            result = 3.5;
        } else if ("B0".equals(rating)) {
            result = 3.0;
        } else if ("C+".equals(rating)) {
            result = 2.5;
        } else if ("C0".equals(rating)) {
            result = 2.0;
        } else if ("D+".equals(rating)) {
            result = 1.5;
        } else if ("D0".equals(rating)) {
            result = 1.0;
        } else if ("P".equals(rating)) {
            result = -1;
        }
        return result;
    }
}