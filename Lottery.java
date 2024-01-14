import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lottery {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] bills = { 1, 5, 10, 20, 100 };
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ptr = 4;
        int num = 0;
        while (n > 0) {
            while (bills[ptr] > n) {
                ptr--;
            }
            n -= bills[ptr];
            num++;
        }
        System.out.println(num);
    }
}
