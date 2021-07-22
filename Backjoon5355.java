import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon5355 {
public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(bf.readLine());
	StringTokenizer st;
	StringBuilder sb = new StringBuilder();
	while(T-- > 0) {
		st = new StringTokenizer(bf.readLine());
		double n = Double.parseDouble( st.nextToken());
		while(st.hasMoreTokens()) {
			String op=st.nextToken();
			switch (op) {
			case "@":
				n*=3;
				break;
			case "%":
				n+=5;
				break;
			case "#":
				n-=7;
				break;
			}
		}
		sb.append(String.format("%.2f", n)+"\n");
	}
	System.out.println(sb);
}
}
