import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

// Solution : !groupCondition = (불연속 && 기존에 존재하는 단어)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine()), group = 0;

        for (int i = 0; i < count; i++) {
            ArrayList<Character> arr = new ArrayList();
            char[] c = br.readLine().toCharArray();
            int index = 0;
            do {
                if (!arr.contains(c[index])) arr.add(c[index]);
                index++;
            } while ((index < c.length) && !((c[index] != c[index-1]) && arr.contains(c[index])));
            if (index == c.length) group++;
        }

        br.close();
        System.out.println(group);
    }
}