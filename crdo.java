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
        int height=0;
        try {
            bf.readLine();
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s," ");
            while (st.hasMoreElements()){
                a.add(Integer.parseInt(st.nextToken()));
            }
            height=Integer.parseInt(bf.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i <a.size(); i++) {
            if(a.get(i)<height){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(a.size()+1);
    }
}