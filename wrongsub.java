import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wrongsub {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num = reader.readLine();
        String[] nums = num.split(" ");

        int n = Integer.parseInt(nums[0]);
        int k = Integer.parseInt(nums[1]);
        int i = 0;
        for (i = 0; i < k; i++) {
            if (n % 10 == 0) {
                n /= 10;
            } else {
                n--;
            }
        }
        System.out.println(n);
    }
}