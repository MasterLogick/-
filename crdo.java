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
        BigInteger bi = new BigInteger("0");
        for (int i = 2; i <a ; i++) {
            System.out.print(i-1+"*"+i+"+");
            bi=bi.add(new BigInteger(Integer.toString(i)).multiply(new BigInteger(Integer.toString(i-1))));
        }
        System.out.println(a-1+"*"+a+"="+bi.add(new BigInteger(Integer.toString(a)).multiply(new BigInteger(Integer.toString(a-1)))).toString());
    }
}