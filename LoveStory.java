import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoveStory {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String m = "codeforces";
        int ct = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            ct = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != m.charAt(j)) {
                    ct++;
                }
            }
            System.out.println(ct);
        }

    }
}
