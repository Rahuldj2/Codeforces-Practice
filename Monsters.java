import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Monsters {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr1;
        String[] arr2;
        String[] arr0;
        int n = 0;
        int m = 0;

        long sum = 0;
        long sum1 = 0;
        int j = 0;

        for (int i = 0; i < N; i++) {
            sum = 0;
            sum1 = 0;
            arr0 = br.readLine().split(" ");
            arr1 = br.readLine().split(" ");
            arr2 = br.readLine().split(" ");
            n = Integer.parseInt(arr0[0]);
            m = Integer.parseInt(arr0[1]);
            for (j = 0; j < n; j++) {
                sum += Long.parseLong(arr1[j]);
            }
            for (j = 0; j < m; j++) {
                sum1 += Long.parseLong(arr2[j]);
            }
            if (sum > sum1) {
                System.out.println("Tsondu");
            } else if (sum == sum1) {
                System.out.println("Draw");
            } else {
                System.out.println("Tenzing");
            }
        }

    }
}
