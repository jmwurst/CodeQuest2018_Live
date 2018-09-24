import java.io.*;
import java.util.*;

public class Prob06
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob06.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			String[] status = in.nextLine().split(" ");
			int total = 0;
			if (status[0].equals("BROKEN"))
				total += 8;
			if (status[1].equals("BROKEN"))
				total += 4;
			if (status[2].equals("BROKEN"))
				total += 2;
			if (status[3].equals("BROKEN"))
				total += 1;
			if (total == 15)
				out.write("blue blue\n");
			if (total == 14)
				out.write("blue green\n");
			if (total == 13)
				out.write("blue red\n");
			if (total == 12)
				out.write("blue off\n");
			if (total == 11)
				out.write("green blue\n");
			if (total == 10)
				out.write("green green\n");
			if (total == 9)
				out.write("green red\n");
			if (total == 8)
				out.write("green off\n");
			if (total == 7)
				out.write("red blue\n");
			if (total == 6)
				out.write("red green\n");
			if (total == 5)
				out.write("red red\n");
			if (total == 4)
				out.write("red off\n");
			if (total == 3)
				out.write("off blue\n");
			if (total == 2)
				out.write("off green\n");
			if (total == 1)
				out.write("off red\n");
			if (total == 0)
				out.write("off off\n");
		}
		out.close();
	}
}