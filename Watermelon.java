import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean val = ((n % 2) == 0 && n != 2);
        if (val) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
