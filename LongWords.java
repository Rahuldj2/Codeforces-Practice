import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LongWords {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i = 0;
        String inter = "";
        String interLen = "";
        String word = "";
        String newWord = "";
        ArrayList<String> list = new ArrayList<>();
        for (i = 0; i < N; i++) {
            word = br.readLine();
            if (word.length() <= 10) {
                list.add(word);
                continue;
            }
            inter = word.substring(1, word.length() - 1);
            interLen = String.valueOf(inter.length());
            newWord += word.charAt(0) + interLen + word.charAt(word.length() - 1);
            list.add(newWord);
            newWord = "";
        }
        for (String elem : list) {
            System.out.println(elem);
        }

    }
}
