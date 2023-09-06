import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        int totalCount = in.nextInt();
        int sum = 0;

        for (int i = 0; i < totalCount; i++) {
            sum += (in.nextInt() * in.nextInt());
        }

        if (total == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}