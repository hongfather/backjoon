

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class 	member implements Comparable<member>{
	int age;
	String name;
	int order;
	member(int age,int order,String name){
		this.age=age;
		this.order=order;
		this.name=name;
	}
	@Override
	public int compareTo(member o) {
		if(age==o.age)
			return order-o.order;
		return age-o.age;
	}
}

public class Backjoon10814 {
public static void main(String[] args) throws  IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(bf.readLine());
	member [] arr = new member[N];
	StringTokenizer st;
	StringBuilder sb = new StringBuilder();
	for(int i=0;i<N;i++) {
		st=new StringTokenizer(bf.readLine());
		arr[i]=new member(Integer.parseInt(st.nextToken()),i,st.nextToken());
	}
	Arrays.sort(arr);
	for(int i=0;i<N;i++) {
		sb.append(arr[i].age+" "+arr[i].name+"\n");
	}
	System.out.println(sb);
}
}
