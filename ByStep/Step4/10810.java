import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int basketCount = 0, throwCount = 0;
        String[] a;

        a = br.readLine().split(" ");
        basketCount = Integer.parseInt(a[0]);
        throwCount = Integer.parseInt(a[1]);
        int[] baskets = new int[basketCount];

        for (int i = 0; i < throwCount; i++) {
            a = br.readLine().split(" ");
            throwBall(a, baskets);
        }

        for (int i : baskets) {
            System.out.printf("%d ", i);
        }
    }

    static void throwBall(String[] throwNum, int[] baskets) {
        for (int i = Integer.parseInt(throwNum[0]); i <= Integer.parseInt(throwNum[1]); i++) {
            baskets[i-1] = Integer.parseInt(throwNum[2]);
        }
    }
}