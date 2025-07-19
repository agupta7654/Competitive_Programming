import java.io.*;
import java.util.*;

public class LuckyDivison_122A {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		
		String lucky = "4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777";
		
		int in = io.nextInt();
		if(lucky.contains(Integer.toString(in))) {
			io.println("YES");
		}
		else if(in % 4 == 0 || in % 7 == 0 || in % 44 == 0 || in % 47 == 0 || in % 74 == 0 || in % 77 == 0 || in % 444 == 0 || in % 447 == 0 || in % 474 == 0 || in % 477 == 0) {
			io.println("YES");
		}
		else {
			io.println("NO");
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