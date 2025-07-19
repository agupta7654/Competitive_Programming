import java.io.*;
import java.util.*;

public class PlayinginaCasino{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int T = io.nextInt();
		while(T-->0) {
			int n = io.nextInt();
			int m = io.nextInt();
			int v[][] = new int[n][m];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					v[i][j] = io.nextInt();
				}
			}
			int tot = 0;
			for(int i = 0; i < n; i++) {
				for(int j = i+1; j < n; j++) {
					for(int k = 0; k < m; k++) {
//						System.out.println(v[i][k] - v[j][k]);
						tot += Math.abs(v[i][k] - v[j][k]);
					}
				}
			}
			io.println(tot);
		}
		
		
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