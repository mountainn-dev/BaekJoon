import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner a = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        num1 = a.nextInt();
        num2 = a.nextInt();

        if (num1 > num2) System.out.println(">");
        else if (num1 < num2) System.out.println("<");
        else System.out.println("==");
    }
}