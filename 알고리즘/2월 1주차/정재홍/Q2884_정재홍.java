
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884_정재홍 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if(m<45) {
			if(h==0) {
				h=23;
				m+=15;
				System.out.println(h +" "+ m);
			} else {
				h--;
				m+=15;
				System.out.println(h +" "+ m);
			}
		} else {
			m-=45;
			System.out.println(h +" "+ m);
		}

	}

}
