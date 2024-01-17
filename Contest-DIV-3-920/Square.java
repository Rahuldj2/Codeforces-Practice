import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Square {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            HashSet<Integer> Set = new HashSet<Integer>();
            for (int j = 0; j < 4; j++) {
                String[] input = br.readLine().split(" ");
                Set.add(Integer.parseInt(input[0]));

            }
            ArrayList<Integer> list = new ArrayList<Integer>(Set);
            int res = (int) Math.pow(Math.abs(list.get(0) - list.get(1)), 2);
            System.out.println(res);
        }
    }
}
