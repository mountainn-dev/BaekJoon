import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner a = new Scanner(System.in);
        int x = 0, y = 0;

        x = a.nextInt();
        y = a.nextInt();

        System.out.printf("%d", x + y);
    }
}