import java.io.*;
import java.util.*;

public class Prob14
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob14.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		int Ulines = Integer.parseInt(in.nextLine());
		String[] Ulengths = in.nextLine().split(" ");
		int Llines = Integer.parseInt(in.nextLine());
		String[] Llengths = in.nextLine().split(" ");
		String[] upper = new String[Ulines];
		for (int i = 0; i < upper.length; i++)
			upper[i] = "";
		String[] lower = new String[Llines];
		for (int i = 0; i < lower.length; i++)
			lower[i] = "";
		int ui = 0;
		int li = 0;
		while(in.hasNextLine())
		{
			String ln = in.nextLine();
			for (int i = 0; i < ln.length(); i++)
			{
				String ch = ln.substring(i, i + 1);
				if (upper[ui].length() == Integer.parseInt(Ulengths[ui]))
					ui++;
				if (lower[li].length() == Integer.parseInt(Llengths[li]))
					li++;
				if (ch.equals("-"))
					upper[ui] += " ";
				else if (ch.equals("="))
					lower[li] += " ";
				else if (ch.toLowerCase().equals(ch))
					lower[li] += ch;
				else
					upper[ui] += ch;
			}
		}
		for (int i = 0; i < upper.length; i++)
			out.write(upper[i] + "\n");
		out.write("\n");
		for (int i = 0; i < lower.length; i++)
			out.write(lower[i] + "\n");
		out.close();
	}
}