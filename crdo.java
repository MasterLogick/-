import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crdo {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 0;
		try {
			a = Integer.parseInt(bf.readLine());
			b = Integer.parseInt(bf.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(a%7+b-1);
	}
}
