

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class pt implements Comparable<pt>{
	int p;
	int comp;
	int order;
	pt(int p,int order){
		this.p = p;
		this.order=order;
	}
	@Override
	public int compareTo(pt o) {
		
		return p-o.p;
	}
	
}

public class Backjoon18870 {
	public static Comparator<pt> comp = new Comparator<pt>() {
		
		@Override
		public int compare(pt o1, pt o2) {
			
			return o1.order-o2.order;
		}
	};
public static void main(String[] args) throws  IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(bf.readLine());
	pt []arr= new pt[N];
	StringTokenizer st = new StringTokenizer(bf.readLine());
	for(int i=0;i<N;i++)
		arr[i]=new pt(Integer.parseInt(st.nextToken()),i);
	StringBuilder sb = new StringBuilder();
	Arrays.sort(arr);
	for(int i=0;i<N;i++) {
		if(i==0)
			arr[i].comp=0;
		else {
			if(arr[i].p==arr[i-1].p)
				arr[i].comp=arr[i-1].comp;
			else
				arr[i].comp=arr[i-1].comp+1;
		}
	}
	Arrays.sort(arr,comp);
	for(int i=0;i<N;i++)
		sb.append(arr[i].comp+" ");
	System.out.println(sb);
	
}
}
