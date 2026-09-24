import java.io.*;
import java.util.*;

public class CowSignal {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("cowsignal");
		
		int M = io.nextInt();
		int N = io.nextInt();
		int K = io.nextInt();
		String[][] end = new String[M*K][N*K];
		for(int i = 0; i < M; i++) {
			String[] in = io.next().split("");
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < K; k++) {
					for(int k2 = 0; k2 < K; k2++) {
						end[i*K+k][j*K+k2] = in[j];
					}
				}
			}
		}
		
		for(int i = 0; i < M*K; i++) {
			for(int j = 0; j < N*K; j++) {
				io.print(end[i][j]);
			}
			io.println();
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