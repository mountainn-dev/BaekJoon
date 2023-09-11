import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Solution : 단어가 시작되는 부분에서 카운트를 더함.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        boolean word = false;
        int count = 0;

        for (int i = 0; i < data.length(); i++) {
            if (word){
                if (!isEng(data.charAt(i))) word = false;
            } else {
                if (isEng(data.charAt(i))) {
                    word = true;
                    count++;
                }
            }
        }

        br.close();
        System.out.println(count);
    }

    static boolean isEng(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}