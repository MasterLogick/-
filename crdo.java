import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class crdo {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Vector<Integer> a = new Vector<Integer>();
        int k = 0, m = 0;
        try {
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            st.nextToken();
            k = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            s = bf.readLine();
            st = new StringTokenizer(s, " ");
            while (st.hasMoreElements()) {
                a.add(Integer.parseInt(st.nextToken()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        int b = 0;
        for (int i = 0; i < a.size(); i++) {
            if (i <= k) {
                b += a.get(i);
            } else {
                if (b == m) {
                    System.out.println(i-k);
                    return;
                }
                b=b-a.get(i-k-1)+a.get(i);
            }
        }
        System.out.println(0);
    }
}