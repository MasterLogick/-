import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class crdo {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Vector<Integer> a = new Vector<Integer>();
        Vector<Boolean> b = new Vector<Boolean>();
        try {
            int n = Integer.parseInt(bf.readLine());
            for (int i = 0; i < n; i++) {
                a.add(Integer.parseInt(bf.readLine()));
                b.add(false);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (a.size() == 1) {
            System.out.println(a.get(0));
            return;
        }
        int tmp = 0;
        for (int i = 0; i < a.size(); i++) {
            if (b.get(i) || a.get(i) != 5) continue;
            try {
                if (a.get(i - 1) < 5) {
                    b.set(i - 1, true);
                    a.set(i - 1, 5);
                }
            } catch (ArrayIndexOutOfBoundsException ex) {

            }
            try {
                if (a.get(i + 1) < 5) {
                    b.set(i + 1, true);
                    a.set(i + 1, 5);
                }
            } catch (ArrayIndexOutOfBoundsException ex) {

            }
        }
        for (int i = 0; i < a.size(); i++) {
            if (b.get(i) || a.get(i) != 4) continue;
            try {
                if (a.get(i - 1) < 4) {
                    b.set(i - 1, true);
                    a.set(i - 1, 4);
                }
            } catch (ArrayIndexOutOfBoundsException ex) {

            }
            try {
                if (a.get(i + 1) < 4) {
                    b.set(i + 1, true);
                    a.set(i + 1, 4);
                }
            } catch (ArrayIndexOutOfBoundsException ex) {

            }
        }
        for (int i = 0; i < a.size(); i++) {
            if (b.get(i) || a.get(i) != 3) continue;
            try {
                if (a.get(i - 1) < 3) {
                    b.set(i - 1, true);
                    a.set(i - 1, 3);
                }
            } catch (ArrayIndexOutOfBoundsException ex) {

            }
            try {
                if (a.get(i + 1) < 4) {
                    b.set(i + 1, true);
                    a.set(i + 1, 3);
                }
            } catch (ArrayIndexOutOfBoundsException ex) {

            }
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}