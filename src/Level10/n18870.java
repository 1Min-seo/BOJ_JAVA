package Level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class n18870 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		
		ArrayList<Integer> origin=new ArrayList<>();
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			origin.add(Integer.parseInt(st.nextToken()));
		}
		ArrayList<Integer> copy= (ArrayList<Integer>) origin.clone();
		Collections.sort(copy);
		
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0; i<N; i++) {
			
		}
		
	}

}
