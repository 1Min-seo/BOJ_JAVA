package Level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class n2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		int N=Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(arr);
		
		for(int i=0; i<N; i++) {
			System.out.println(arr.get(i));
		}
	}

}
