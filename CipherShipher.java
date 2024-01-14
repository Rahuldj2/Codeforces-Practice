import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CipherShipher {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int i = 0;
        String d = "";
        String res = "";
        for (i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            d = br.readLine();
            res = "";

            int l = 0;
            int r = 1;

            while (r < n) {
                if (d.charAt(r) == d.charAt(l)) {
                    // String rem=d.substring(j+1, n+1);
                    res += d.charAt(l);
                    l = r + 1;
                    r = l + 1;
                    // r=j+2;
                } else {
                    r++;
                }
            }
            System.out.println(res);
        }
    }
}
