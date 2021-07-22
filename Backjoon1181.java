

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class word implements Comparable<word>{
	String str;
	int len;
	word(String str){
		this.str=str;
		this.len=str.length();
	}
	@Override
	public int compareTo(word o) {
		if(len==o.len)
			return comp(str,o.str);
		return len-o.len;
	}
	public int comp(String str, String o) {
		int idx=0;
		while(idx <str.length() && str.charAt(idx)==o.charAt(idx)  ) {
			
			idx++;
		}
		if(idx==str.length())
			return str.charAt(idx-1)-o.charAt(idx-1);
		return str.charAt(idx)-o.charAt(idx);
	}
}

public class Backjoon1181 {
public static void main(String[] args) throws  IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(bf.readLine());
	StringBuilder sb = new StringBuilder();
	word [] arr = new word[N];
	for(int i=0;i<N;i++)
		arr[i]=new word(bf.readLine());
	Arrays.sort(arr);
	for(int i=0;i<N;i++) {
		if(i>0 && arr[i].str.equals(arr[i-1].str))
			continue;
		sb.append(arr[i].str+"\n");
		
	}
	System.out.println(sb);
}
}
