import java.util.Calendar;
import java.util.GregorianCalendar;

public class Backjoon10699 {
public static void main(String[] args) {
	GregorianCalendar gc = new GregorianCalendar();
	int year = gc.get(Calendar.YEAR);
	int month=gc.get(Calendar.MONTH)+1;
	int day =gc.get(Calendar.DATE);
	System.out.println(String.format("%d-%02d-%02d", year,month,day));
}
}
