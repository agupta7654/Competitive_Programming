/*
ID: 8971101
LANG: JAVA
TASK: milk2
*/

import java.io.*;
import java.util.*;

public class milk2 {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("milk2");
		
		int N = 3;
		int[] start = new int[N] ;
		int[] end = new int[N] ;
		io.next();
		
		for(int i  = 0; i < N; i++) {
			System.out.println(io.next());
			start[i] = Integer.parseInt(io.next());
			end[i] = Integer.parseInt(io.next());
		}
		
		for(int i = 0; i < N; i++) {
			int small = 0;
			for(int j = i+1; j < N; j++) {
				if(start[small] > start[i]) {
					small = i;
				}
			}
			int hold = start[small];
			start[small] = start[0];
			start[0] = hold;
			
			hold = end[small];
			end[small] = end[0];
			end[0] = hold;
		}
		
		int startTime = start[0];
		int endTime = end[0];
		int longestNoMilk = 0;
		
		for(int i = 0 ;i < N-1; i++) {
			if(start[i+1] < end[i]) {
				if(end[i+1] > end[i]) {
					endTime = end[i+1];
				}
			}
			else {
				if(end[i+1]-start[i+1] > endTime-startTime) {
					startTime = start[i+1];
					endTime = end[i+1];
				}
			}
			if(longestNoMilk < end[i]-start[i+1]) {
				longestNoMilk = end[i]-start[i+1];
			}
		}
		System.out.println(start[0]);
		System.out.println(end[0]);
		io.println((endTime-startTime) + " " + longestNoMilk);
		System.out.println(endTime);
		System.out.println(startTime);
		
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