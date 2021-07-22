import java.util.Scanner;

public class Backjoon2530 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in)	;
	int hour =in.nextInt();
	int min=in.nextInt();
	int sec=in.nextInt();
	int cookSec=in.nextInt();
	sec+=cookSec;
	min+=sec/60;
	sec%=60;
	hour+=min/60;
	min%=60;
	hour%=24;
	System.out.println(hour+" "+min+" "+sec);
}
}
