import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = "";
        int gradeTotal = 0;
        double scoreTotal = 0;

        while ((data = br.readLine()) != null) {
            String[] s = data.split(" ");
            if (score(s[2]) != -1) {
                scoreTotal += Double.parseDouble(s[1]) * score(s[2]);
                gradeTotal += Double.parseDouble(s[1]);
            }
        }

        br.close();
        System.out.printf("%f", scoreTotal / gradeTotal);
    }

    static double score(String s) {
        switch (s) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F": return 0;
            default: return -1;
        }
    }
}