import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class crdo {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];
        try {
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            for (int i = 0; i < 10; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] == 0 || a[i] == 2) continue;
            int left = 0, right = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] == 2) {
                    left = i - j;
                    break;
                }
            }

            for (int j = i + 1; j < 10; j++) {
                if (a[j] == 2) {
                    right = j - i;
                    break;
                }
            }
            if (left == 0)
                max = Math.max(right, max);
            else if (right == 0)
                max = Math.max(left, max);

            else
                max = Math.max(Math.min(left, right), max);
        }
        System.out.println(max);
    }
}