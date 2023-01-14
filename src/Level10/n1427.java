package Level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class n1427 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		String str=br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			arr.add(str.charAt(i)-'0');
		}
		Collections.sort(arr, Collections.reverseOrder());
		
		for(Integer result:arr)
			System.out.print(result);
	}

}
