import java.io.*;
import java.util.*;

public class Drought{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int T = io.nextInt();
		for(int t = 0; t < T; t++) {
			int N = io.nextInt();
			int[] cows = new int[N];
			for(int i = 0; i < N; i++) {
				cows[i] = io.nextInt();
			}
			int fin = 0;
			if(N == 1) {
				io.println(0);
				continue;
			}
			if(N == 2) {
				if(cows[0] == cows[1]) {
					io.println(0);
					continue;
				}
				else {
					io.println(-1);
					continue;
				}
			}
			for(int i = 1; i < N; i++) {
				if(cows[i-1] < cows[i]) {
					fin += (cows[i]-cows[i-1]) * 2;
					cows[i+1] -= (cows[i]-cows[i-1]);
					cows[i] = cows[i-1];
				}
			}
			if(cows[N-1] > cows[N-2]) {
				io.println(-1);
				continue;
			}
			for(int i = N-2; i > 0; i--) {
				if(cows[i+1] < cows[i]) {
					fin += (cows[i]-cows[i+1]) * 2;
					cows[i-1] -= (cows[i]-cows[i+1]);
					cows[i] = cows[i+1];
				}
			}
			if(cows[0] > cows[1]) {
				io.println(-1);
				continue;
			}
			for(int i = 0; i < N; i++) {
				if(cows[i] < 0) {
					fin = -1;
				}
			}
			io.println(fin);
		}
        io.close();
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