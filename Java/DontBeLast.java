import java.io.*;
import java.util.*;

public class DontBeLast{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("notlast");
		int T = io.nextInt();
		String[] names = new String[T];
		int[] vals = new int[T];
		
		String[] name = new String[] {"Bessie", "Elsie", "Daisy", "Gertie", "Annabelle", "Maggie", "Henrietta"};
		int[] tots = new int[8];     // Bessie, Elsie, Daisy, Gertie, Annabelle, Maggie, Henrietta
		
		for(int i = 0; i < T; i++) {
			names[i] = io.next();
			vals[i] = io.nextInt();
		}
		

		for(int i = 0; i < T; i++) {
			if(names[i].equals("Bessie")) {
				tots[0] += vals[i];
			}
			else if(names[i].equals("Elsie")) {
				tots[1] += vals[i];
			}
			else if(names[i].equals("Daisy")) {
				tots[2] += vals[i];
			}
			else if(names[i].equals("Gertie")) {
				tots[3] += vals[i];
			}
			else if(names[i].equals("Annabelle")) {
				tots[4] += vals[i];
			}
			else if(names[i].equals("Maggie")) {
				tots[5] += vals[i];
			}
			else if(names[i].equals("Henrietta")) {
				tots[6] += vals[i];
			}
		}
		
		int min = 0;
		for(int i = 1; i < 7; i++) {
			if(tots[min] > tots[i]) {
				min = i;
			}
		}
		
		tots[7] = 999999;
		
		int fin = 7;
		for(int i = 0; i < 7; i++) {
			if(tots[i] > tots[min] && tots[fin] > tots[i]) {
				fin = i;
			}
		}
		if(fin == 7) {
			fin = 0;
		}
		
		int cnt = 0;
		for(int i = 0; i < 7; i++) {
			if(tots[fin] == tots[i]) {
				cnt++;
			}
		}
		
		
		if(cnt > 1) {
			io.println("Tie");
		}
		else {
			io.println(name[fin]);
		}        
		
        io.close();
	}

	public static boolean isPrime(int num) {
		if(num == 0 || num == 1) {
			return false;
		}
		for(int i = 2; i < num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
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