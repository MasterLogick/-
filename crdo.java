import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crdo {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //         1      5      10     20     60
        int a=0,b=0;
        try {
            a = Integer.parseInt(bf.readLine());
            b = Integer.parseInt(bf.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if(a<=b){
            for (int i = a; i <b; i++) {
                System.out.print(i+" ");
            }
            System.out.println(b);
        }else{
            for (int i = a; i >b; i--) {
                System.out.print(i+" ");
            }
            System.out.println(b);
        }
    }
}