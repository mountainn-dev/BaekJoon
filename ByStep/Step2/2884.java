import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner a = new Scanner(System.in);
        int hour = 0, minute = 0, remain = 0;
        hour = a.nextInt();
        minute = a.nextInt();
        remain = minute - 45;

        if (remain < 0) {
            remain = Math.abs(remain);
            minute = 60 - remain;
            hour--;
        } else minute -= 45;

        if (hour < 0) hour = 23;

        System.out.printf("%d %d", hour, minute);
    }
}
