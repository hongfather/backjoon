import java.util.Scanner;

public class Backjoon1676 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int count2=0;
	int count5=0;
	
	for(int i=N;i>=2;i--) {
		int val=i;
		
		while(val%5==0) {
			count5++;
			val/=5;
		}
		while(val%2==0) {
			count2++;
			val/=2;
		}
		
	}
	int answer=0;
	while(count2 >0 && count5 >0) {
		answer++;
		count2--;
		count5--;
	}
	System.out.println(answer);
}
}
