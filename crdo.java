import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crdo {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 0, c = 0,d = 0;
		try {
			a = Integer.parseInt(bf.readLine());
			b = Integer.parseInt(bf.readLine());
			c = Integer.parseInt(bf.readLine());
			d = Integer.parseInt(bf.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(Math.abs(a-c)%2==Math.abs(b-d)%2){
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}
}
