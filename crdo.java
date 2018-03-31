import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crdo {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//         1      5      10     20     60
		int n = 0, a = 0, b = 0;
		try {
			n = Integer.parseInt(bf.readLine());
			a = Integer.parseInt(bf.readLine());
			b = Integer.parseInt(bf.readLine());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		int min = 2*a*b;
		System.out.println((min-min%n)/n+(min%n>0?3:0));
	}
}
