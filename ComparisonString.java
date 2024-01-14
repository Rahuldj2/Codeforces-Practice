import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.Package;

public class ComparisonString {
    /**
     * @param args
     * @throws NumberFormatException
     * @throws IOException
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        int cost = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int i = 0;
        int n = 0;
        char cur = '\0';
        String full = "";
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (i = 0; i < N; i++) {
            n = Integer.parseInt(br.readLine());
            full = br.readLine();
            cur = full.charAt(0);
            cost = 1;
            for (j = 0; j < n; j++) {
                if (j)
                    if (full.charAt(j) == cur) {
                        cost++;
                    }
                cur = full.charAt(j);
            }
            list.add(cost);
        }
        for (Integer elem : list) {
            System.out.println(elem);
        }

    }
}
