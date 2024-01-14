import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CanISquare {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] arr1 = br.readLine().split(" ");
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Long.parseLong(arr1[j]);
            }
            long root = (long) Math.sqrt(sum);
            if (root * root == sum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
