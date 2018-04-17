import sun.font.TrueTypeFont;

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
            bf.readLine();
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");


            //st.nextToken();//-------------------------------------------------------------------------------------------------


            while (st.hasMoreElements()) {
                a.add(Integer.parseInt(st.nextToken()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        boolean was = false;
        boolean has = false;
        String s = "";
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j <i; j++) {
                if(a.get(j)==a.get(i)){
                    was=true;
                    break;
                }
            }
            if(was){
                was=false;
                continue;
            }
            for (int j = i+1; j < a.size(); j++) {
                if(a.get(j)==a.get(i)){
                    has=true;
                    break;
                }
            }
            if(has){
                has=false;
                s+=a.get(i)+" ";
            }
        }
        System.out.println(s.trim());
    }
}