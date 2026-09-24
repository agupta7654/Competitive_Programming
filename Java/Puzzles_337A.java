import java.io.*;
import java.util.*;

public class Puzzles_337A {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int K = io.nextInt();
		int N = io.nextInt();
		int[] arr = new int[N];
		int small = Integer.MAX_VALUE;
		
		for(int i = 0; i < N; i++) {
			arr[i] = io.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < N-K+1; i++) {
			if(arr[i+K-1]-arr[i] < small) {
				small = arr[i+K-1] - arr[i];
			}
		}
		io.println(small);
		
		
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