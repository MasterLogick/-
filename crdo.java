import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crdo {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = 0,b=0,c=0;
		try {
			a = Integer.parseInt(bf.readLine());
			b = Integer.parseInt(bf.readLine());
			c = Integer.parseInt(bf.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		int out = a;
		if(out<b)out=b;
		if(out<c)out=c;
		System.out.println(out);
	}
}
