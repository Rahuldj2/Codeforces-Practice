import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongLong {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int i, j, n, op = 0;
        long sum = 0;
        for (i = 0; i < N; i++) {
            n = Integer.parseInt(br.readLine());
            op = 0;
            sum = 0;
            String[] arr = br.readLine().split(" ");
            int l = 0;
            int r = 0;
            for (j = 0; j < n; j++) {
                if (Integer.parseInt(arr[j]) < 0) {
                    l = j;
                    break;
                }
            }
            for (j = n - 1; j >= 0; j--) {
                if (Integer.parseInt(arr[j]) < 0) {
                    r = j;
                    break;
                }
            }
            for (j = l; j <= r; j++) {
                arr[j] = String.valueOf(Integer.parseInt(arr[j]) * -1);
            }
            op++;
            for (j = 0; j < n; j++) {
                if (Integer.parseInt(arr[j]) < 0) {
                    arr[j] = String.valueOf(Integer.parseInt(arr[j]) * -1);
                    op++;
                }
                sum += Long.parseLong(arr[j]);
            }
            System.out.print(sum + " " + op);
            System.out.println();
        }
    }
}
