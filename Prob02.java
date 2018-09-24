import java.io.*;
import java.util.*;

public class Prob02
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob02.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			String line = in.nextLine();
			int vowels = 0;
			for (int i = 0; i < line.length(); i++)
			{
				String sub = line.substring(i, i + 1);
				if (sub.equals("a") || sub.equals("e") || sub.equals("i") || sub.equals("o") || sub.equals("u"))
					vowels++;
			}
			out.print(vowels + "\n");
		}
		out.close();
	}
}