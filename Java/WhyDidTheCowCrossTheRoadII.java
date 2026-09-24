import java.io.*;
import java.util.*;

public class WhyDidTheCowCrossTheRoadII {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("circlecross");
		
		int[] start = new int[26];
		int[] end = new int[26];
		String in = io.next();
		
		for(int i = 0; i < 26; i++) {
			start[i] = -1;
		}
		
		for(int i = 0; i < 52; i++) {
			int val = in.charAt(i)-65;
			if(start[val] != -1) {
				end[val] = i;
			}
			else {
				start[val] = i;
			}
		}
		int fin = 0;
		for(int i = 0; i < 26; i++) {
			int cnt = 0;
			for(int j = 0; j < 26; j++) {
				if((start[j] > start[i] && end[j] > end[i] && start[j] < end[i]) || (start[j] < start[i] && end[j] < end[i]  && end[j] > start[i])) {
					cnt++;
				}
			}
			fin += cnt;
		}
		io.println(fin/2);
		
		
		
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