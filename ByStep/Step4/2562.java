import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String []args) throws IOException {
        // 1. Scanner
        Scanner sc = new Scanner(System.in);
        int number = 0, maxNum = 0, maxNumIndex = 0;

        for (int i = 0; i < 9; i++) {
            number = Integer.parseInt(sc.nextLine());
            if (number > maxNum) {
                maxNum = number;
                maxNumIndex = i;
            }
        }

        System.out.println(maxNum + "\n" + (maxNumIndex+1));

        // 2. BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = 0, maxNum = 0, maxNumIndex = 0;

        for (int i = 0; i < 9; i++) {
            number = Integer.parseInt(br.readLine());
            if (number > maxNum) {
                maxNum = number;
                maxNumIndex = i;
            }
        }

        br.close();
        System.out.println(maxNum + "\n" + (maxNumIndex+1));
    }
}