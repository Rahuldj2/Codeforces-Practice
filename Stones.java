import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stones {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int i = 0;
        int rem = 0;
        for (i = 0; i < n - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                rem++;
            }
        }
        System.out.println(rem);
    }
}
