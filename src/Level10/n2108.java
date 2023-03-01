package Level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class n2108 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list=new ArrayList<>();
		HashMap<Integer,Integer>hashmap=new HashMap<>();
		
		int N=Integer.parseInt(br.readLine());
		
		//산술평균
		double sum=0;
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
			sum+=list.get(i);
		}
		
		System.out.println((int)Math.round((double)sum/N));
		
		//중앙값
		Collections.sort(list);
		System.out.println(list.get(N/2));
		
		//최빈값
		 for(int num:list) {
			 //숫자가 한 번 나올 때마다 1 추가
			 hashmap.put(num, hashmap.getOrDefault(num, 0)+1);
		 }
		 
		 int maxNum=0;
		 for(int value:hashmap.values()) {
			 maxNum=Math.max(maxNum, value);
		 }
		 
		 ArrayList<Integer> modelist=new ArrayList<Integer>();
		 for(int key:hashmap.keySet()) {
			 if(hashmap.get(key)==maxNum) {
				 modelist.add(key);
			 }
		 }
		Collections.sort(modelist);
		 int mode=0;
		 if(modelist.size()==1) mode=modelist.get(0);
		 else mode=modelist.get(1);
		 
		 System.out.println(mode);
		 
		 //범위
		 System.out.println(list.get(N-1)-list.get(0));
		
		
		
	}

}
