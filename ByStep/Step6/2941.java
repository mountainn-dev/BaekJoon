import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Solution : count = length; words = '1'
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : arr) {
            data = data.replace(s, "1");
        }

        br.close();
        System.out.println(data.length());
    }
}