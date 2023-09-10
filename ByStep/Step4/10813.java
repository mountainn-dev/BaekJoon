import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");
        int[] baskets = new int[Integer.parseInt(data[0])];

        for (int i = 0; i < baskets.length; i++) {
            baskets[i] = i + 1;
        }

        for (int j = 0; j < Integer.parseInt(data[1]); j++) {
            String[] A = br.readLine().split(" ");
            int temp = 0, x = Integer.parseInt(A[0]) - 1, y = Integer.parseInt(A[1]) - 1;

            temp = baskets[x];
            baskets[x] = baskets[y];
            baskets[y] = temp;
        }

        for (int a : baskets) {
            System.out.printf("%d ", a);
        }
    }
}