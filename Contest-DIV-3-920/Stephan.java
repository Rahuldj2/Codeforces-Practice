import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stephan {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            long n = Long.parseLong(arr[0]);
            long f = Long.parseLong(arr[1]);
            long a = Long.parseLong(arr[2]);
            long b = Long.parseLong(arr[3]);

            String[] messages = br.readLine().split(" ");

            int prev = 0;
            for (int j = 0; j < n; j++) {
                if ((Long.parseLong(messages[j]) - prev) * a < b) {
                    f -= (Long.parseLong(messages[j]) - prev) * a;
                } else {
                    f -= b;
                }
                prev = Integer.parseInt(messages[j]);
            }
            if (f > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
