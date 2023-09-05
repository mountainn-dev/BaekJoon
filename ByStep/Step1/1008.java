import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner a = new Scanner(System.in);
        double x, y;
        x = y = 0;

        x = a.nextDouble();
        y = a.nextDouble();

        System.out.printf("%.13f", x / y);
    }
}