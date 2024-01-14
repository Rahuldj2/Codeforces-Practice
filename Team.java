import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Team {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0, m = 0, i = 0, j = 0;
        for (i = 0; i < N; i++) {
            count = 0;
            String[] inp = br.readLine().split(" ");
            for (j = 0; j < inp.length; j++) {
                if (Integer.parseInt(inp[j]) == 1) {
                    count++;
                }
            }
            if (count >= 2) {
                m++;
            }
        }
        System.out.println(m);
    }
}
