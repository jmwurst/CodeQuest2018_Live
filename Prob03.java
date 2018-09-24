import java.io.*;
import java.util.*;

public class Prob03
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob03.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			String num = in.nextLine();
			String newnum = "";
			int digit = Integer.parseInt(num.substring(num.length() - 3, num.length() - 2));
			if (num.length() >= 4)
			{
				int elevens = Integer.parseInt(num.substring(num.length() - 4, num.length() - 2));
				if (elevens == 11 || elevens == 12 || elevens == 13)
				{
					out.write(num + "\n");
					continue;
				}
			}
			if (digit == 1)
				newnum = num.substring(0, num.length() - 2) + "st";
			else if (digit == 2)
				newnum = num.substring(0, num.length() - 2) + "nd";
			else if (digit == 3)
				newnum = num.substring(0, num.length() - 2) + "rd";
			else
				newnum = num;
			out.write(newnum + "\n");
		}
		out.close();
	}
}