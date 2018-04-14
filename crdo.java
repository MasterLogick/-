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
        int counter=0,sum=0;
        while(a!=0){
            sum+=a;
            counter++;
            try {
                a = Integer.parseInt(bf.readLine());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(((double) sum)/((double)counter));
    }
}