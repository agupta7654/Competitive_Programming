/*
ID: 8971101
LANG: JAVA
TASK: friday
*/

import java.io.*;
import java.util.*;

public class friday {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("friday");
		
		int years = io.nextInt()-1;
	    int dayOfWeek = 2;
	    int[] week = new int[] {0, 0, 0, 0, 0, 0, 0};
	    int[] month = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    for (int y = 1900; y <= 1900+years; y++) {
	        boolean leap = false;
	        if (y % 400 == 0) {
	            leap = true;
	        } else if (y % 100 == 0) {
	            leap = false;
	        } else if (y % 4 == 0) {
	            leap = true;
	        } else {
	            leap = false;
	        }
	        if (leap) {
	            month[1] = 29;
	        } else {
	            month[1] = 28;
	        }
	        for (int m: month) {
	            dayOfWeek+=12;
	            dayOfWeek%=7;
	            week[dayOfWeek]++;
	            dayOfWeek+=m-12;
	        }
	    }
		io.println(week[0] + " " + week[1] + " " + week[2] + " " + week[3] + " " + week[4] + " " + week[5] + " " + week[6]);
		
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