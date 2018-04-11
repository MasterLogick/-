import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crdo {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //         1      5      10     20     60
        int k = 0, m = 0, n = 0;
        try {
            k = Integer.parseInt(bf.readLine());
            m = Integer.parseInt(bf.readLine());
            n = Integer.parseInt(bf.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (n <= k) {
            System.out.println(2 * m);
        } else if (n * 2 % k == 0) {
            System.out.println(m * n * 2 / k);
        } else System.out.println(m * (1 + n * 2 / k));
    }
}