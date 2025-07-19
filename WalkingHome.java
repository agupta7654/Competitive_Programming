import java.io.*;
import java.util.*;

public class WalkingHome{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int T = io.nextInt();
		
		for(int i = 0; i < T; i++) {
			int N = io.nextInt();
			int K = io.nextInt();
			int fin = 0;
			String[][] grid = new String[N][N];
			for(int j = 0; j < N; j++) {
				grid[j] = io.next().split("");
				
			}
			if(K >= 1) {
				if(grid[N-1][0].equals(".")) {
					fin++;
				}
				if(grid[0][N-1].equals(".")) {
					fin++;
				}
			}
			 if(K >= 2) {
				for(int k = 1; k < N; k++) {
					if(grid[0][k].equals("H")){
						break;
					}
					if(grid[0][k].equals(".") && grid[N-1][k].equals(".")) {
						fin++;
					}
					
				}
				for(int k = 1; k < N; k++) {
					if(grid[k][0].equals("H")){
						break;
					}
					if(grid[k][0].equals(".") && grid[k][N-1].equals(".")) {
						fin++;
					}
					
				}
				
			}
			 if(K >= 3) {
				for(int k = 1; k < N; k++) {
					boolean right = true;
					boolean down = true;
					for(int l = 1; l < N; l++) {
						if(grid[0][k].equals("H")) {
							right = false;
						}
						if(grid[k][0].equals("H")) {
							down = false;
						}
						if(right && grid[0][k].equals(".") && grid[l][k].equals(".") && grid[l][N-1].equals(".")) {
							fin++;
						}
						if(k != l) {
							if(down && grid[k][0].equals(".") && grid[k][l].equals(".") && grid[N-1][l].equals(".")) {
								fin++;
							}
						}
						
					}
				}
			}
		    io.println(fin);
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