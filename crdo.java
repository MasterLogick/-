import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crdo {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 0, c = 0;
		try {
			a = Integer.parseInt(bf.readLine());
			b = Integer.parseInt(bf.readLine());
			c = Integer.parseInt(bf.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (a == b && b == c) {
			System.out.println(3);
			return;
		}
		//  a b c
		//  1 1 2         1 2 1         2 1 1
		//  1  1||1  2    1  1||1  2    1  1||1 2
		if((a==b&&b!=c)||(a==c&&a!=b)||(c==b&&c!=a)){
			System.out.println(2);
			return;
		}
		System.out.println(0);
	}
}
