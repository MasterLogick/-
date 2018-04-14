import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class crdo {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a=0;
        try {
            a = Integer.parseInt(bf.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        int counter=0;
        int step = 1;
        for (int i = 0; i <a ; i++) {
            if(counter<step){
                counter++;
                if(i+1==a){
                    System.out.print(step);
                    return;
                }else{
                    System.out.print(step+" ");
                }
            }else{
                step++;
                counter=1;
                if(i+1==a){
                    System.out.print(step);
                    return;
                }else{
                    System.out.print(step+" ");
                }
            }
        }
    }
}