import java.io.*;
import java.util.*;

public class TamingTheHerd {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("taming");
		int N = io.nextInt();
		int[] num = new int[N];
		
		for(int i  = 0; i < N; i++) {
			num[i] = io.nextInt();
		}
		boolean brake = false;
		int count = -1;
		
		for(int i = N-1; i >= 0; i--) {
			if(num[i] != -1) {
				if(count != -1) {
					if(count == num[i]) {
						count--;
						continue;
						
					}
					else {
						brake = true;
						break;
					}
				}
				count = num[i]-1;
				
			}
			else{
				num[i] = count;
				count--;
				if(count < -1) {
					count = -1;
				}
			}
		}
		
		
		if(brake) {
			io.println(-1);
		}
		else if(num[0] != 0 && num[0] != -1) {
			io.println(-1);
		}
		else {
			int cnt = 0;
			int add = 0;
			
			for(int i = 0; i < N; i++) {
				if(num[i] == 0 || i == 0) {
					cnt++;
				}
				else if(num[i] == -1){
					add++;
				}
			}
			io.println(cnt + " " + (cnt+add));
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