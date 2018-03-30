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
		int min = ((a%3600-a%60)/60)%60;
		int sec = a%60;
		System.out.println(((a-a%3600)/3600)%24+":"+(min-min%10)/10+""+min%10+":"+(sec-sec%10)/10+""+sec%10);
	}
}
