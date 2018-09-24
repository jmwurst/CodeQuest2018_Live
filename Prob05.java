import java.io.*;
import java.util.*;

public class Prob05
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob05.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			int num = Integer.parseInt(in.nextLine());
			int orig = num;
			int steps = 1;
			while (true)
			{
				if (num == 1)
					break;
				else if (num % 2 == 0)
					num /= 2;
				else
					num = num * 3 + 1;
				steps++;
			}
			out.print(orig + ":" + steps + "\n");
		}
		out.close();
	}
}