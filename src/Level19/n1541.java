package Level19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n1541 {

	public static void main(String[] args)throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String data=br.readLine();
		int result=0;
		
		int minusIndex=data.indexOf("-");
		if(minusIndex==-1) {
			String[] arr=data.split("\\+");
			for(String value:arr) {
				result+=Integer.parseInt(value);
			}
		}else {
			String add=data.substring(0,minusIndex);
			String minus=data.substring(minusIndex+1);
			
			String[]arr=add.split("\\+");
			for(String valueP:arr) {
				result+=Integer.parseInt(valueP);
			}
			
			arr=minus.split("-");
			for(String valueM:arr) {
				String []subArr=valueM.split("\\+");
				for(String valueMM:subArr) {
					result-=Integer.parseInt(valueMM);
				}
			}
		}
		System.out.println(result);
	}
}

