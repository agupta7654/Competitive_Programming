import java.io.*;
import java.util.*;

public class ShellGame {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("shell");
		
		int k = io.nextInt();
		int one = 0;
		int two = 0;
		int three = 0;
		int pebbleOne = 1;
		int pebbleTwo = 2;
		int pebbleThree = 3;
		while(k-->0) {
			int a = io.nextInt();
			int b = io.nextInt();
			int g = io.nextInt();
			if(pebbleOne == a) {
				pebbleOne = b;
			}
			else if(pebbleOne == b) {
				pebbleOne = a;
			}
			if(pebbleTwo == a) {
				pebbleTwo = b;
			}
			else if(pebbleTwo == b) {
				pebbleTwo = a;
			}
			if(pebbleThree == a) {
				pebbleThree = b;
			}
			else if(pebbleThree == b) {
				pebbleThree = a;
			}
			
			if(g == pebbleOne) {
				one++;
			}
			if(g == pebbleTwo) {
				two++;
			}
			if(g == pebbleThree) {
				three++;
			}
		}
		
		io.println(Math.max(Math.max(one, two), three));
		
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