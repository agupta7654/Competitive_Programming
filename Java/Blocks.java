import java.io.*;
import java.util.*;

public class Blocks{
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int N = io.nextInt();
		String d1 = io.next();
		String d2 = io.next();
		String d3 = io.next();
		String d4 = io.next();
		for(int i = 0; i < N; i++) {
			String[] letters = io.next().split("");
			
			String letter = letters[0];
			if(letters.length == 1) {
				if(d1.contains(letter)) {
					io.println("YES");
					continue;
				}
				if(d2.contains(letter)) {
					io.println("YES");
					continue;
				}
				if(d3.contains(letter)) {
					io.println("YES");
					continue;
				}
				if(d4.contains(letter)) {
					io.println("YES");
					continue;
				}
				io.println("NO");
			}
			if(letters.length == 2) {
				if(d1.contains(letter)) {
					letter = letters[1];
					if(d2.contains(letter)) {
						io.println("YES");
						continue;
					}
					if(d3.contains(letter)) {
						io.println("YES");
						continue;
					}
					if(d4.contains(letter)) {
						io.println("YES");
						continue;
					}
					letter = letters[0];
				}
				if(d2.contains(letter)) {
					letter = letters[1];
					if(d1.contains(letter)) {
						io.println("YES");
						continue;
					}
					if(d3.contains(letter)) {
						io.println("YES");
						continue;
					}
					if(d4.contains(letter)) {
						io.println("YES");
						continue;
					}
					letter = letters[0];
				}
				if(d3.contains(letter)) {
					letter = letters[1];
					if(d2.contains(letter)) {
						io.println("YES");
						continue;
					}
					if(d1.contains(letter)) {
						io.println("YES");
						continue;
					}
					if(d4.contains(letter)) {
						io.println("YES");
						continue;
					}
					letter = letters[0];

				}
				if(d4.contains(letter)) {
					letter = letters[1];
					if(d2.contains(letter)) {
						io.println("YES");
						continue;
					}
					if(d3.contains(letter)) {
						io.println("YES");
						continue;
					}
					if(d1.contains(letter)) {
						io.println("YES");
						continue;
					}
					letter = letters[0];

				}
				io.println("NO");
			}
			if(letters.length == 3) {
				if(d1.contains(letter)) {
					letter = letters[1];
					if(d2.contains(letter)) {
						letter = letters[2];
						if(d3.contains(letter)) {
							io.println("YES");
							continue;
						}
						if(d4.contains(letter)) {
							io.println("YES");
							continue;
						}
						letter = letters[1];

					}
					if(d3.contains(letter)) {
						letter = letters[2];
						if(d2.contains(letter)) {
							io.println("YES");
							continue;
						}
						if(d4.contains(letter)) {
							io.println("YES");
							continue;
						}
						letter = letters[1];

					}
					if(d4.contains(letter)) {
						letter = letters[2];
						if(d3.contains(letter)) {
							io.println("YES");
							continue;
						}
						if(d2.contains(letter)) {
							io.println("YES");
							continue;
						}
						letter = letters[1];

					}
					letter = letters[0];

				}
				if(d2.contains(letter)) {
					letter = letters[1];
					if(d1.contains(letter)) {
						letter = letters[2];
						if(d3.contains(letter)) {
							io.println("YES");
							continue;
							
						}
						if(d4.contains(letter)) {
							io.println("YES");
							continue;
						}
						letter = letters[1];

					}
					if(d3.contains(letter)) {
						letter = letters[2];
						if(d1.contains(letter)) {
							io.println("YES");
							continue;
						}
						if(d4.contains(letter)) {
							io.println("YES");
							continue;
						}
						letter = letters[1];

					}
					if(d4.contains(letter)) {
						letter = letters[2];
						if(d3.contains(letter)) {
							io.println("YES");
							continue;
						}
						if(d1.contains(letter)) {
							io.println("YES");
							continue;
						}
						letter = letters[1];

					}
					letter = letters[0];

				}
				if(d3.contains(letter)) {
					letter = letters[1];
					if(d2.contains(letter)) {
						letter = letters[2];
						if(d1.contains(letter)) {
							io.println("YES");
							continue;
						}
						if(d4.contains(letter)) {
							io.println("YES");
							continue;
						}
						letter = letters[1];

					}
					if(d1.contains(letter)) {
						letter = letters[2];
						if(d2.contains(letter)) {
							io.println("YES");
							continue;
						}
						if(d4.contains(letter)) {
							io.println("YES");
							continue;
						}
						letter = letters[1];

					}
					if(d4.contains(letter)) {
						letter = letters[2];
						if(d1.contains(letter)) {
							io.println("YES");
							continue;
						}
						if(d2.contains(letter)) {
							io.println("YES");
							continue;
						}
						letter = letters[1];

					}
					letter = letters[0];

				}
				if(d4.contains(letter)) {
					letter = letters[1];
					if(d2.contains(letter)) {
						letter = letters[2];
						if(d3.contains(letter)) {
							io.println("YES");
							continue;
						}
						if(d1.contains(letter)) {
							io.println("YES");
							continue;
						}
						letter = letters[1];

					}
					if(d3.contains(letter)) {
						letter = letters[2];
						if(d1.contains(letter)) {
							io.println("YES");
							continue;
						}
						if(d2.contains(letter)) {
							io.println("YES");
							continue;
						}
						letter = letters[1];

					}
					if(d1.contains(letter)) {
						letter = letters[2];
						if(d3.contains(letter)) {
							io.println("YES");
							continue;
						}
						if(d2.contains(letter)) {
							io.println("YES");
							continue;
						}
						letter = letters[1];

					}
					letter = letters[0];

				}
				io.println("NO");
			}
			if(letters.length == 4) {
				if(d1.contains(letter)) {
					letter = letters[1];
					if(d2.contains(letter)) {
						letter = letters[2];
						if(d3.contains(letter)) {
							letter = letters[3];
							if(d4.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						if(d4.contains(letter)) {
							letter = letters[3];
							if(d3.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						letter = letters[1];

					}
					if(d3.contains(letter)) {
						letter = letters[2];
						if(d2.contains(letter)) {
							letter = letters[3];
							if(d4.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						if(d4.contains(letter)) {
							letter = letters[3];
							if(d2.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						letter = letters[1];

					}
					if(d4.contains(letter)) {
						letter = letters[2];
						if(d3.contains(letter)) {
							letter = letters[3];
							if(d2.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						if(d2.contains(letter)) {
							letter = letters[3];
							if(d3.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						letter = letters[1];

					}
					letter = letters[0];

				}
				if(d2.contains(letter)) {
					letter = letters[1];
					if(d1.contains(letter)) {
						letter = letters[2];
						if(d3.contains(letter)) {
							letter = letters[3];
							if(d4.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						if(d4.contains(letter)) {
							letter = letters[3];
							if(d3.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						letter = letters[1];

					}
					if(d3.contains(letter)) {
						letter = letters[2];
						if(d1.contains(letter)) {
							letter = letters[3];
							if(d4.contains(letter)) {
								io.println("YES");
								continue;
								
							}
							letter = letters[2];

						}
						if(d4.contains(letter)) {
							letter = letters[3];
							if(d1.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						letter = letters[1];

					}
					if(d4.contains(letter)) {
						letter = letters[2];
						if(d3.contains(letter)) {
							letter = letters[3];
							if(d1.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						if(d1.contains(letter)) {
							letter = letters[3];
							if(d3.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						letter = letters[1];

					}
					letter = letters[0];

				}
				if(d3.contains(letter)) {
					letter = letters[1];
					if(d2.contains(letter)) {
						letter = letters[2];
						if(d1.contains(letter)) {
							letter = letters[3];
							if(d4.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						if(d4.contains(letter)) {
							letter = letters[3];
							if(d1.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						letter = letters[1];

					}
					if(d1.contains(letter)) {
						letter = letters[2];
						if(d2.contains(letter)) {
							letter = letters[3];
							if(d4.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						if(d4.contains(letter)) {
							letter = letters[3];
							if(d2.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						letter = letters[1];

					}
					if(d4.contains(letter)) {
						letter = letters[2];
						if(d1.contains(letter)) {
							letter = letters[3];
							if(d2.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						if(d2.contains(letter)) {
							letter = letters[3];
							if(d1.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						letter = letters[1];

					}
					letter = letters[0];

				}
				if(d4.contains(letter)) {
					letter = letters[1];
					if(d2.contains(letter)) {
						letter = letters[2];
						if(d3.contains(letter)) {
							letter = letters[3];
							if(d1.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						if(d1.contains(letter)) {
							letter = letters[3];
							if(d3.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						letter = letters[1];

					}
					if(d3.contains(letter)) {
						letter = letters[2];
						if(d1.contains(letter)) {
							letter = letters[3];
							if(d2.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						if(d2.contains(letter)) {
							letter = letters[3];
							if(d1.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						letter = letters[1];

					}
					if(d1.contains(letter)) {
						letter = letters[2];
						if(d3.contains(letter)) {
							letter = letters[3];
							if(d2.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						if(d2.contains(letter)) {
							letter = letters[3];
							if(d3.contains(letter)) {
								io.println("YES");
								continue;
							}
							letter = letters[2];

						}
						letter = letters[1];

					}
					letter = letters[0];

				}
				io.println("NO");
			}
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