package Level4;
import java.util.*;
import java.io.*;

public class n2562 {

	public static void main(String[] args) {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int max=0, index=0;
        for(int i=0; i<9; i++) {
        	arr.add(fr.nextInt());
        }
        
        for(int i=0; i<9; i++) {
        	if(max<arr.get(i)) {
        		max=arr.get(i);
        		index=arr.indexOf(max);
        	}
        }
        System.out.println(max);
        System.out.println(index+1);
        
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

