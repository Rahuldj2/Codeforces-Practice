import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangingCats {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            String s1 = br.readLine();
            String s2 = br.readLine();

            int diff1 = 0;
            int diff2 = 0;

            for (int j = 0; j < n; j++) {
                if (s1.charAt(j) == '1' && s2.charAt(j) == '0') {
                    diff1++;
                }
                if (s1.charAt(j) == '0' && s2.charAt(j) == '1') {
                    diff2++;
                }
            }
            System.out.println(Math.max(diff1, diff2));

        }
    }
}
