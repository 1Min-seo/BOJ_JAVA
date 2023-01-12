package Level6;
import java.util.*;
import java.io.*;

public class n1157 {

	public static void main(String[] args) {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        
        int apb[]=new int[26];
        String str=fr.next();
        str=str.toUpperCase(); //모두 대문자로 변환
        
        for(int i=0; i<str.length(); i++) {
        	char ch=str.charAt(i);
        	apb[ch-'A']++;
        }
        
        int max=-1;
        char result=' ';
        for(int i=0; i<apb.length; i++) {
        	if(max<apb[i]) {
        		max=apb[i];
        		result=(char)(i+'A');
        	}
        	else if(max==apb[i]) result='?';
        	
        }
        System.out.println(result);
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}
