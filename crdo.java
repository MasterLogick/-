import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crdo {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		try {
			a = Integer.parseInt(bf.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (a >= 400) {
			if (a % 400 == 0) {
				System.out.println("NO");
				return;
			}
		} else {
			if (a >= 100) {
				if (a % 100 == 0) {
					System.out.println("NO");
					return;
				}
			} else if (a % 4 == 0) {
				System.out.println("YES");
				return;
			}
		}
	}
}
