import java.io.*;
import java.util.*;

public class DominoPiling_50A {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < 25; i++) {
			if(io.nextInt() == 1) {
				x = i / 5;
				y = i % 5;
				break;
			}
		}
		
		io.println(Math.abs(2-x) + Math.abs(2-y));
		
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