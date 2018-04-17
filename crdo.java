import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class crdo {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Vector<Integer> a = new Vector<Integer>();
        try {
            //bf.readLine();
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");


            st.nextToken();//-------------------------------------------------------------------------------------------------


            while (st.hasMoreElements()) {
                a.add(Integer.parseInt(st.nextToken()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        int count = 0;
        boolean f = false;
        while (true) {
            for (int i = 1; i < a.size() - 1; i++) {
                if (a.get(i) == a.get(i - 1) && a.get(i) == a.get(i + 1)) {
                    int tmp = i + 1;
                    for (; tmp < a.size(); tmp++) {
                        if (a.get(tmp - 1) != a.get(tmp)) {
                            tmp--;
                            break;
                        }
                    }
                    if(tmp==a.size())tmp--;
                    count += tmp - i + 2;
                    for (int j = 0; j < tmp - i + 2; j++) {
                        //try {
                        a.remove(i - 1);
                        /*} catch (ArrayIndexOutOfBoundsException ex) {

                        }*/
                    }
                    f = true;
                    break;
                }
            }
            if (!f) {
                System.out.println(count);
                return;
            } else
                f = false;
        }
    }
}