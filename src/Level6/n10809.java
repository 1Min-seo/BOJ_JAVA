package Level6;
import java.util.*;
import java.io.*;

public class n10809 {

	public static void main(String[] args) {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        int []alpha=new int[26];
        
        for(int i=0; i<alpha.length; i++) {
        	alpha[i]=-1;
        }
        
        String str=fr.next();
        
        for(int i=0; i<str.length(); i++) {
        	char ch=str.charAt(i);
        	
        	if(alpha[ch-'a']==-1) alpha[ch-'a']=i;
        }
        for(int i=0; i<alpha.length; i++) {
        	System.out.print(alpha[i]+" ");
        }  
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
