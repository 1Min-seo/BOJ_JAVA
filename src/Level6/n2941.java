package Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String croApb[]= {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String str=br.readLine();
		
		for(String s: croApb) {
			if(str.contains(s)) str=str.replace(s, "*");
		}
		System.out.println(str.length());
		
	}
}
