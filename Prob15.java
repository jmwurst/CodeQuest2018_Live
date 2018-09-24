import java.io.*;
import java.util.*;

public class Prob15
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob15.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			char[] input = in.nextLine().toCharArray();
			String output = "";
			for (char ch : input)
			{
				int mod = 0;
				if (ch > 90)
					mod = 96;
				else
					mod = 64;
				
				int numerval = ch - mod;
				int orig = numerval;
				if (numerval >= 1 && numerval <= 5)
					numerval += 6;
				else if (numerval >= 6 && numerval <= 10)
					numerval = numerval * numerval;
				else if (numerval >= 11 && numerval <= 15)
					numerval = (numerval % 3) * 5 + 1;
				else if (numerval >= 16 && numerval <= 20)
				{
					String num = numerval + "";
					numerval = Integer.parseInt(num.substring(0, 1)) + Integer.parseInt(num.substring(1, 2));
					numerval *= 8;
				}
				else if (numerval >= 21 && numerval <= 26)
				{
					int largest = 1;
					for (int i = numerval - 1; i > 0; i--)
						if (numerval % i == 0)
						{
							largest = i;
							break;
						}
					numerval = largest * 2;
				}
				if (numerval != 0)
				{
					if (numerval % 26 == 0)
						numerval = 26;
					else
						numerval = numerval % 26;
				}
				else
					numerval = orig;
				char newch = (char)(numerval + mod);
				output += newch;
			}
			out.write(output + "\n");
		}
		out.close();
	}
}