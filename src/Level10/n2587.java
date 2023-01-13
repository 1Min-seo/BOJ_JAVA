package Level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class n2587 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int sum=0;
		for(int i=0; i<5; i++) {
			arr.add(Integer.parseInt(br.readLine()));
			sum+=arr.get(i);
		}
		
		Collections.sort(arr);
		System.out.println(sum/5);
		System.out.println(arr.get(5/2));
	}

}
