import java.io.*;
import java.util.*;

public class Prob10_INCOMPLETE
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob10.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			String[] board = in.nextLine().split(",");
			String[] s = in.nextLine().split(",");
			String[] e = in.nextLine().split(",");
			int sx = Integer.parseInt(s[0]);
			int sy = Integer.parseInt(s[1]);
			int ex = Integer.parseInt(e[0]);
			int ey = Integer.parseInt(e[1]);
			if (sx - ex == sy - ey)
				out.write("Yes\n");
			else
				out.write("No\n");
		}
		out.close();
	}
}