package Level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class n1181 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		ArrayList<String> arr=new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			arr.add(br.readLine());
		}
		
		Collections.sort(arr,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length())
					return s1.compareTo(s2);
				else
					return s1.length()-s2.length();
			}
		});
		
		for(int i=0; i<arr.size()-1; i++) {
			if(arr.get(i)==arr.get(i+1))
				arr.remove(i);
		}
		
		for(String value: arr) {
			System.out.println(value);
		}
	}

	

}
