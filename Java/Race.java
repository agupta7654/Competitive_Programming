import java.io.*;
import java.util.*;

public class Race {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		
		int k = io.nextInt();
		int n = io.nextInt();
		while(n-->0) {
			int seconds = 0;
			int max = io.nextInt();
			int stepsBef = (int)(max*(max+1)/2.0);
//			io.println(stepsBef);
			seconds += max;
			int stepsLeft = k-stepsBef; 
			int j = 1;
			while(true) {
//				io.println(stepsLeft + " " + (max*j*2 + j*j));
				if(stepsLeft < max*j*2 + j*j) {
					j--;
					break;
				}
				j++;
			}
			stepsLeft -=(max*j*2 + j*j);
			seconds += Math.ceil((double)stepsLeft/max);
//			io.println(j);
			io.println(seconds + j*2);
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