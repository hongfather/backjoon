

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class point implements Comparable<point>{
	int x;
	int y;
	point(int x,int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(point o) {
		if(y==o.y)	
			return x-o.x;
		return y-o.y;
	}
	
}

public class Backjoon11561 {
	public static void main(String[] args) throws  IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N =Integer.parseInt(bf.readLine());
		point []arr = new point[N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(bf.readLine());
			arr[i]= new point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(arr);
		for(int i=0;i<N;i++) {
			sb.append(arr[i].x+" "+arr[i].y+"\n");
		}
		System.out.println(sb);
	}
}
