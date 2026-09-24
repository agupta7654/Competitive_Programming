import java.io.*;
import java.util.*;

public class TeamTicTacToe {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("tttt");

		String[][] board = new String[3][3];
		board[0] = io.next().split("");
		board[1] = io.next().split("");
		board[2] = io.next().split("");

		String cowsWin = "";
		String teamWin = "";

		for(int i = 0; i < 3; i++) {
			String cows = "";
			for(int j = 0; j < 3; j++) {
				if(!cows.contains(board[i][j])) {
					cows += board[i][j];
				}
			}
			if(cows.length() == 1 && !cowsWin.contains(cows)) {
				cowsWin += cows + " ";
			}
			if(cows.length() == 2) {
				if(!teamWin.contains(cows) && !teamWin.contains(cows.substring(1,2) + cows.substring(0,1))) {
					teamWin += cows + " ";
				}
			}
		}

		for(int j = 0; j < 3; j++) {
			String cows = "";
			for(int i = 0; i < 3; i++) {
				if(!cows.contains(board[i][j])) {
					cows += board[i][j];
				}
			}
			if(cows.length() == 1 && !cowsWin.contains(cows)) {
				cowsWin += cows + " ";
			}
			if(cows.length() == 2) {
				if(!teamWin.contains(cows) && !teamWin.contains(cows.substring(1,2) + cows.substring(0,1))) {
					teamWin += cows + " ";
				}
			}
		}
		
		String cows = "";
		for(int i = 0; i < 3; i++) {
			if(!cows.contains(board[i][i])) {
				cows += board[i][i];
			}
		}
		if(cows.length() == 1 && !cowsWin.contains(cows)) {
			cowsWin += cows + " ";
		}
		if(cows.length() == 2) {
			if(!teamWin.contains(cows) && !teamWin.contains(cows.substring(1,2) + cows.substring(0,1))) {
				teamWin += cows + " ";
			}
		}

		io.println(cowsWin.length()/2);
		io.println(teamWin.length()/3);

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