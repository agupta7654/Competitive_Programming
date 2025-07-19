import java.io.*;
import java.util.*;

public class MowingLawn {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("mowing");

		int N = io.nextInt();
		int[][] lawn = new int[2001][2001];
		int time = 0;
		int maxTime = 9999999;
		int x = 1000;
		int y = 1000;
		for(int i = 0; i < N; i++) {
			String d = io.next();
			int m = io.nextInt();
			
			if(d.equals("N")) {
				for(int j = 1; j <= m; j++) {
					if(lawn[x+j][y] != 0) {
						maxTime = Math.min(maxTime, time-lawn[x+j][y]);
//						io.println(maxTime + " " + d + " " + m + " " + time);

					}
					lawn[x+j][y] = time;
					time++;
				}
				x += m;
			}
			if(d.equals("S")) {
				for(int j = 1; j <= m; j++) {
					if(lawn[x-j][y] != 0) {
						maxTime = Math.min(maxTime, time-lawn[x-j][y]);
//						io.println(maxTime + " " + d + " " + m + " " + time);

					}
					lawn[x-j][y] = time;
					time++;
				}
				x -= m;
			}
			
			if(d.equals("E")) {
				for(int j = 1; j <= m; j++) {
					if(lawn[x][y+j] != 0) {
						maxTime = Math.min(maxTime, time-lawn[x][y+j]);
//						io.println(maxTime + " " + d + " " + m + " " + time);

					}
					lawn[x][y+j] = time;
					time++;
				}
				y += m;
			}
			
			if(d.equals("W")) {
				for(int j = 1; j <= m; j++) {
					if(lawn[x][y-j] != 0) {
						maxTime = Math.min(maxTime, time-lawn[x][y-j]);
//						io.println(maxTime + " " + d + " " + m + " " + time);
						
					}
					lawn[x][y-j] = time;
					time++;
				}
				y -= m;
			}
			
		}
		if(maxTime == 9999999) {
			maxTime = -1;
		}
		io.println(maxTime);

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