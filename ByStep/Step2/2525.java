import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int hour = 0, minute = 0, cookTime = 0;
        hour = in.nextInt();
        minute = in.nextInt();
        cookTime = in.nextInt();

        hour += (minute + cookTime) / 60;
        hour = hour % 24;
        minute = (minute + cookTime) % 60;

        System.out.printf("%d %d", hour, minute);
    }
}