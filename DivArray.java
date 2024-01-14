import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivArray {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int n = 0;
        for (int i = 0; i < N; i++) {
            n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                System.out.print((j + 1) * 2 + " ");
            }
            System.out.println();
        }
    }
}
