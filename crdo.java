import sun.java2d.SurfaceDataProxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;

public class crdo {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Vector<Integer> a = new Vector<Integer>();
        try {
            bf.readLine();
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s," ");
            while (st.hasMoreElements()){
                a.add(Integer.parseInt(st.nextToken()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if(a.size()>1) {
            int tmp = a.get(a.size() - 1);
            for (int i = a.size() - 2; i >= 0; i--) {
                a.set(i + 1, a.get(i));
            }
            a.set(0,tmp);
        }
        for (int i = 0; i < a.size()-1; i++) {
            System.out.print(a.get(i)+" ");
        }
        System.out.println(a.get(a.size()-1));
    }
}