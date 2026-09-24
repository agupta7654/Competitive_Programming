import java.io.*;
import java.util.*;

public class MilkMeasurement {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("measurement");

		int N = io.nextInt();
		int[] M = new int[100];
		int[] E = new int[100];
		int[] B = new int[100];
		for(int i = 0; i < 100; i++) {
			M[i] = 7;
			E[i] = 7;
			B[i] = 7;
		}
		
		for(int i = 0; i < N; i++) {
			int day = io.nextInt()-1;
			String p = io.next();
			int val = io.nextInt();
			if(p.equals("Mildred")) {
				while(day < 100) {
					M[day] += val;
					day++;
				}
			}
			else if(p.equals("Elsie")) {
				while(day < 100) {
					E[day] += val;
					day++;
				}
			}
			else if(p.equals("Bessie")) {
				while(day < 100) {
					B[day] += val;
					day++;
				}
			}
		}
		
		int[] count = new int[] {1, 1, 1};
		int fin = 0;
		for(int i = 0; i < 100; i++) {
			int m = M[i];
			int e = E[i];
			int b = B[i];
			int max = Math.max(Math.max(e, b), m);
			int[] hold = new int[] {0, 0, 0};
			if(m == max) {
				hold[0] = 1;
			}
			if(e == max) {
				hold[1] = 1;
			}
			if(b == max) {
				hold[2] = 1;
			}
			boolean check = true;
			for(int k = 0; k < 3; k++) {
				if(count[k] != hold[k]) {
					check = false;
				}
			}
			if(!check) {
				fin++;
				for(int k = 0; k < 3; k++) {
					count[k] = hold[k];
//					io.println(count[k]);
				}
			}
		}

		io.println(fin);
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