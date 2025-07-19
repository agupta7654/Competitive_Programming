import java.io.*;
import java.util.*;

public class LostCow {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("lostcow");
		
		int x = io.nextInt();
		int y = io.nextInt();
		
		if(y>x) {
			int count = 0;
			while(Math.pow(2, count) + x < y) {
				count += 2;
			}
			int sum = (int) ((Math.pow(2, count)-1)*2 + Math.pow(2, count) - (x+Math.pow(2, count)-y));
			io.println(sum);
		}
		else {
			int count = 1;
			while(x-Math.pow(2, count) > y) {
				count += 2;
			}
			int sum = (int) ((Math.pow(2, count)-1)*2 + Math.pow(2, count) - (y-(x-Math.pow(2, count))));
			io.println(sum);
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