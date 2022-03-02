// Q5597 - 과제 안 내신분..?

package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Q5597_한상민 {

	public static void main(String[] args) throws Exception {
		
//		Scanner sc = new Scanner(System.in);
//		
//		List<Integer> a = new ArrayList();	// 제출한 학생
//		List<Integer> b = new ArrayList();	// 모든 학생
//		
//		for(int i = 1; i <= 28; i++) {
//			a.add(sc.nextInt());
//		}
//		for(int i = 1; i <= 30; i++) {
//			b.add(i);
//		}
//		
//		b.removeAll(a);
//		
//		for(Integer i : b) {
//			System.out.println(i);
//		}
//		
//		sc.close();

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		TreeSet<Integer>aa = new TreeSet<Integer>();
//		
//		for(int i = 1; i <= 30; i++) {
//			aa.add(i);			
//		}
//		for(int i = 1; i <= 28; i++) {
//			aa.remove(Integer.parseInt(br.readLine()));
//			System.out.println(aa);
//		}

		        int i, s = 0;
		        for (i = 0; i < 28; i++) s |= (1 << r());
		        for (i = 1; i < 31; i++) if ((s & (1 << i)) == 0) System.out.println(i);
		    }

		    private static int r() throws Exception {
		        int c, n = System.in.read() & 15;
		        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		        return n;
		    }

	}

