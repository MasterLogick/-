import sun.java2d.SurfaceDataProxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
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
        int count =0;
        for (int i = 1; i <a.size(); i++) {
            if(a.get(i)>a.get(i-1))count++;
        }
        System.out.println(count);
    }
}