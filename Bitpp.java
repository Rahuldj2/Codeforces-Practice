import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bitpp {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int x = 0;
        for (int i = 0; i < N; i++) {
            String X = br.readLine();
            if (X.charAt(0) == '+' || X.charAt(X.length() - 1) == '+') {
                x++;
            }
            if (X.charAt(0) == '-' || X.charAt(X.length() - 1) == '-') {
                x--;
            }
        }
        System.out.println(x);

    }
}
