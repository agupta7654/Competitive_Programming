import java.io.*;
import java.util.*;

public class FencePainting{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("paint");
		int s1 = io.nextInt();
		int e1 = io.nextInt();
		int s2 = io.nextInt();
		int e2 = io.nextInt();
		boolean[] arr = new boolean[100];
		for(int i  = s1; i < e1; i++) {
			arr[i] = true;
		}
		for(int i  = s2; i < e2; i++) {
			arr[i] = true;
		}
		int val = 0;
		for(int i =0 ;i < 100; i++) {
			if(arr[i]) {
				val++;
			}
		}
		io.println(val);
		
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