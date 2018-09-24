import java.io.*;
import java.util.*;

public class Prob01
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob01.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			int gr = Integer.parseInt(in.nextLine());
			if (gr >= 70)
				out.write("PASS\n");
			else
				out.write("FAIL\n");
		}
		out.close();
	}
}