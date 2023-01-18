package Level19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n1541 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String data=br.readLine();
		int result=0;
		
		int minusIndex=data.indexOf("-");
		if(minusIndex==-1) {
			String []arr=data.split("\\+");
			for(String value:arr) {
				result+=Integer.parseInt(value);
			}
		}
		else {
			String front=data.substring(0, minusIndex);
			String back=data.substring(minusIndex+1);
			
			String[] frontArr=front.split("\\+");
			for(String frontValue:frontArr) {
				result+=Integer.parseInt(frontValue);
			}
			
			String[] backArr=back.split("-");
			for(String backMinusValue:backArr) {
				String []backPlusArr=backMinusValue.split("\\+");
				for(String backPlusValue: backPlusArr) {
					result-=Integer.parseInt(backPlusValue);
				}
			}
		}
		
		System.out.println(result);
	}
}

