import java.io.*;
import java.util.*;

public class Kayaking{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int T = io.nextInt();
		int[] vals = new int[T*2];
		for(int i = 0; i < T*2; i++) {
			vals[i] = io.nextInt();
		}
		Arrays.sort(vals);
		int small = 99999;
		for(int i = 0; i < T*2; i++) {
			for(int j = i+1; j < T*2; j++) {
				int val = 0;
				int[] nums = new int[T*2-2];
				int cnt = 0;
				for(int k = 0; k  < T*2; k++) {
					if(k!=i && k!=j) {
						nums[cnt] = vals[k];
						cnt++;
					}
					
				}
				for(int k = 0; k  < T*2-2; k+=2) {
					val += Math.abs(nums[k]-nums[k+1]);
				}
				small = Math.min(val, small);
				
			}
		}
		io.println(small);
		
		
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