import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crdo {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int sec =0;
		try {
			sec= Integer.parseInt(bf.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("It is "+(sec-sec%3600)/3600+" hours "+(sec%3600-sec%60)/60+" minutes.");
	}
}
