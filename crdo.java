import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crdo {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int min = 0, max = 0, x = 0,y = 0;
		try {
			min = Integer.parseInt(bf.readLine());
			max = Integer.parseInt(bf.readLine());
			x = Integer.parseInt(bf.readLine());
			y = Integer.parseInt(bf.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(min>max){
			int tmp=min;
			min=max;
			max=tmp;
		}
		if(2*x>min)x=min-x;
		if(2*y>max)y=max-y;
		if(x>y) System.out.println(y);
		else System.out.println(x);
	}
}
