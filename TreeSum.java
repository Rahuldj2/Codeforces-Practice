import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeSum {
    public static long helper(long n, long sum) {
        if (n == 1) {
            sum += 1;
            return sum;
        }
        long par = n / 2;
        sum += n;
        return helper(par, sum);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int i = 0;
        long n = 0;
        long sum = 0;
        for (i = 0; i < N; i++) {
            n = Long.parseLong(br.readLine());
            sum = helper(n, 0);
            System.out.println(sum);
        }
    }
}
