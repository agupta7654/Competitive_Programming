import java.io.*;
import java.util.*;

public class MixingMilk {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("mixmilk");
		
		int c1 = io.nextInt();
		int a1 = io.nextInt();
		int c2 = io.nextInt();
		int a2 = io.nextInt();
		int c3 = io.nextInt();
		int a3 = io.nextInt();
		
		for(int i = 0; i < 33; i++) {
			if(a2+a1 < c2) {
				a2 += a1;
				a1 = 0;
			}
			else {
				a1 = a1+a2-c2;
				a2 = c2;
			}
			
			if(a3+a2 < c3) {
				a3 += a2;
				a2 = 0;
			}
			else {
				a2 = a2+a3-c3;
				a3 = c3;
			}
			
			if(a1+a3 < c1) {
				a1 += a3;
				a3 = 0;
			}
			else {
				a3 = a3+a1-c1;
				a1 = c1;
			}
		}
		
		if(a2+a1 < c2) {
			a2 += a1;
			a1 = 0;
		}
		else {
			a1 = a1+a2-c2;
			a2 = c2;
		}
		
		io.println(a1);
		io.println(a2);
		io.println(a3);
		
		
		
		
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