import java.io.*;
import java.util.*;

public class Herdle{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int green = 0;
		int yellow = 0;
		
		boolean[] check = new boolean[9];
		String ans= io.next();
		ans += io.next();
		ans += io.next();
	
		String guess = io.next();
		guess += io.next();
		guess += io.next();
		
		int[] an = new int[26];
		int[] gu = new int[26];
		
		for(int i = 0; i < 9; i++) {
			if(ans.charAt(i) == guess.charAt(i)) {
				green++;
			}
			an[ans.charAt(i) - 'A']++;
			gu[guess.charAt(i)- 'A']++;
		}
		
		for(int i = 0; i < 26; i++) {
			yellow += Math.min(an[i], gu[i]);
		}
		yellow -= green;
		
//		for(int i = 0; i < 9; i++) {
//			if(ans.charAt(i) == guess.charAt(i)) {
//				green++;
//				check[i] = true;
//			}
//			else if(ans.contains(guess.substring(i, i+1))) {
//				int pos = ans.indexOf(guess.charAt(i));
//				while(pos != -1) {
//					if(check[pos] == false) {
//						yellow++;
//						check[pos] = true;
//						break;
//					}
//					pos = guess.substring(pos+1).indexOf(guess.charAt(i));
//				}
//			}
//		}
		
		io.println(green);
		io.println(yellow);

		
		
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