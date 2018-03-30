import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crdo {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Hello, "+bf.readLine()+"!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}