import java.io.*;
import java.util.*;

public class NonTransitiveDice{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int T = io.nextInt();
		for(int t = 0; t < T; t++) {
			int[] A = {io.nextInt(), io.nextInt(), io.nextInt(), io.nextInt()};
			int[] B = {io.nextInt(), io.nextInt(), io.nextInt(), io.nextInt()};
			
			if(findTransitive(A, B)) {
				io.println("yes");
			}
			else {
				io.println("no");
			}
		}
        io.close();
	}
	
	public static boolean findTransitive(int[] A, int[] B) {
		for(int a = 1; a <= 10; a++) {
			for(int b = 1; b <= 10; b++) {
				for(int c = 1; c <= 10; c++) {
					for(int d = 1; d <= 10; d++) {
						int[] C = {a,b,c,d};
						if(findWinner(A, B) && findWinner(B, C) && findWinner(C, A)) {
							return true;
						}
						if(findWinner(B, A) && findWinner(C, B) && findWinner(A, C)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	public static boolean findWinner(int[] A, int[] B) {
		int win = 0;
		int losses = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(A[i] > B[j]) {
					win++; 
				}
				else if(A[i] < B[j]) {
					losses++;
				}
			}
		}
		return win > losses;
		
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