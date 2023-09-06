import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner a = new Scanner(System.in);
        int score = 0;
        score = a.nextInt();

        printGrade(score);
    }
    static void printGrade(int score) {
        if (score >= 90) System.out.println("A");
        else if (score >= 80) System.out.println("B");
        else if (score >= 70) System.out.println("C");
        else if (score >= 60) System.out.println("D");
        else System.out.println("F");
    }
}