import java.util.Scanner;
//막대기
public class Q1094_김율리아 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		//원래 들고 있는 막대기 길이
		int makdae = 64;
		
		//기존의 막대기에서 남은 길이 + 보관하고 있는 막대기 길이
		int hap = 0;
		
		//보관하고 있는 막대기 길이
		int keep = 0;
		
		//총 막대기 갯수
		int cnt = 1;
		
		while(true) {
			 if(makdae == X) {
				 break;
			 }
			 if(makdae!=X) {
				 //가지고 있는 막대를 절반으로 자른다 
				 makdae = makdae/2; 
				 
				 //위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이 + 보관하고 있는 막대기 길이
				 hap = makdae + keep;
				 
				 if(hap==X) {
					 break;
				 }
				 else if(hap>X){
					 //자른 막대의 절반 중 하나를 버리기
					 makdae = makdae;
				 }
				 else {
					 //hap이 X보다 작으면 해당 막대기 길이값을 누적하여 보관
					 keep += makdae;
					 
					 //기존의 막대기 수 + 보관하는 막대기 개수 1 추가 
					 cnt++;				
				 }
			 }
		}
		System.out.println(cnt);
	}
}
