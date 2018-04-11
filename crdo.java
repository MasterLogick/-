import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crdo {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//         1      5      10     20     60
		int n = 0, a = 0, b = 0, c = 0, d = 0, e = 0;
		try {
			n = Integer.parseInt(bf.readLine());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		if (n >= 60) {
			e = (n - n % 60) / 60;
			n %= 60;
		}
		if (n >= 20) {
			d = (n - n % 20) / 20;
			n %= 20;
		}
		if (n >= 10) {
			c = (n - n % 10) / 10;
			n %= 10;
		}
		if (n >= 5) {
			b = (n - n % 5) / 5;
			a = n % 5;
		}
		if(d>=2){
			e++;
			d-=2;
		}
		a=n%5;
		System.out.println(a + " " + b + " " + c + " " + d + " " + e);
	}
}