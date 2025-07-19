import java.io.*;
import java.util.*;

public class Permutator{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int T = io.nextInt();
		int[] a = new int[T];
		int[] b = new int[T];
		int[] m = new int[T];
		for(int i = 0; i < T; i++) {
			m[i] = (T-i) * (i+1);
		}
		
		for(int i = 0; i < T; i++) {
			a[i] = io.nextInt();
		}
		for(int i = 0; i < T; i++) {
			b[i] = io.nextInt();
		}

		for(int i = 0; i < T; i++) {
			for(int j = i+1; j < T; j++) {
				
			}
		}
        int tot = 0;
        
        
        
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