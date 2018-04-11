import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crdo {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //         1      5      10     20     60
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        try {
            a = Integer.parseInt(bf.readLine());
            b = Integer.parseInt(bf.readLine());
            c = Integer.parseInt(bf.readLine());
            d = Integer.parseInt(bf.readLine());
            e = Integer.parseInt(bf.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (b > c) {
            int tmp = b;
            b = c;
            c = tmp;
        }
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b > c) {
            int tmp = b;
            b = c;
            c = tmp;
        }
        if (d > e) {
            int tmp = d;
            d = e;
            e = tmp;
        }
        if (a<=d&&b<=e){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}