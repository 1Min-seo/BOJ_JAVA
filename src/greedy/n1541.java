package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n1541 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] sub=br.readLine().split("-");
		
		int result=0;
		for(int i=0; i<sub.length; i++) {
			int sum=0;
			String add[]=sub[i].split("\\+");
			for(int j=0; j<add.length; j++) {
				sum+=Integer.parseInt(add[j]);
			}
			if(i==0) {
				result+=sum;
			}else {
				result-=sum;
			}	
		}
		
		System.out.println(result);

	}

}

/*
 * -를 기준으로 분류 :sub
 * 
 * 55-50+40
 * 55	50+40
 * 
 * +를 기준으로 분류 :add
 * 55	50 40
 * 
 * 더하고 뺀다.
 * 
 * 55-90
 */
