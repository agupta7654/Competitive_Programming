/*
ID: 8971101
LANG: JAVA
TASK: friday
*/

import java.io.*;
import java.util.*;

public class friday13th{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("friday");
		
		int years = 20;
		int[] count = new int[7];
		int day = 1;
		int[] daysInMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int i = 1900; i <= years; i++) {
			if(i % 4 == 0) {
				daysInMonth[1] = 29;
				if(i % 100 == 0) {
					daysInMonth[1] = 28;
					if(i % 400 == 0) {
						daysInMonth[1] = 29;
					}
				}
			}
			
			for(int m: daysInMonth) {
				day += 12;
				day %= 7;
				count[day]++;
				day += m-12;
			}
		}
		io.print(count[0] + " " + count[1] + " " + count[2] + " " + count[3] + " " + count[4] + " " + count[5] + " " + count[6]);
		
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