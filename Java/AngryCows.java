import java.io.*;
import java.util.*;

public class AngryCows{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("angry");
		int T = io.nextInt();
		int[] bales = new int[T];
		for(int i = 0; i < T; i++) {
			bales[i] = io.nextInt();
		}
        Arrays.sort(bales);
        
        int tot = 0;
        
        for(int i = 0; i < T; i++) {
        	int cur = bales[i];
        	int cnt = 1;
        	int blastRadius = 1;
        	int left = i-1;
        	int right = i+1;
//        	io.println(cur);
        	while(left >= 0 && bales[left] >= cur-blastRadius) {
        		int maxDist = cur-blastRadius;
        		while(left-1 >= 0 && bales[left-1] >= maxDist) {
        			left--;
        			cnt++;
        		}
        		blastRadius++;
        		cur = bales[left];
        		cnt++;
        		left--;
//        		io.println(cur + " " + cnt);
        	}
        	blastRadius = 1;
        	cur = bales[i];
        	while(right <= T-1 && bales[right] <= cur+blastRadius) {
        		int maxDist = cur+blastRadius;
        		while(right+1 <= T-1 && bales[right+1] <= maxDist) {
        			right++;
        			cnt++;
        		}
        		blastRadius++;
        		cur = bales[right];
        		cnt++;
        		right++;
//        		io.println(cur + " " + cnt);
        	}
        	tot = Math.max(tot, cnt);
//        	io.println(tot + " " + cnt);
//        	io.println();
        }
        
        io.println(tot);	
		
        io.close();
	}

	public static boolean isPrime(int num) {
		if(num == 0 || num == 1) {
			return false;
		}
		for(int i = 2; i < num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
class Kattio extends PrintWriter {
    private BufferedReader r;
    private StringTokenizer st;
    // standard input
    public Kattio() { this(System.in, System.out); }
    public Kattio(InputStream i, OutputStream o) {
        super(o);
        r = new BufferedReader(new InputStreamReader(i));
    }
    // USACO-style file input
    public Kattio(String problemName) throws IOException {
        super(problemName + ".out");
        r = new BufferedReader(new FileReader(problemName + ".in"));
    }
    // returns null if no more input
    public String next() {
        try {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(r.readLine());
            return st.nextToken();
        } catch (Exception e) { }
        return null;
    }
    public int nextInt() { return Integer.parseInt(next()); }
    public double nextDouble() { return Double.parseDouble(next()); }
    public long nextLong() { return Long.parseLong(next()); }
}