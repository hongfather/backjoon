import java.util.Scanner;

public class Backjoon2525 {
public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	int hour = in.nextInt();
	int min= in.nextInt();
	int cookTime=in.nextInt();
	min+=cookTime;
	hour+=min/60;
	min%=60;
	hour%=24;
	System.out.println(hour+" "+min);
}
}
