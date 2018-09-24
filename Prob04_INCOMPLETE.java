import java.io.*;
import java.util.*;

public class Prob04_INCOMPLETE
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob04.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			String[] input = in.nextLine().split(" ");
			String prevWinner = input[0];
			boolean[] types = {false, false, false};
			if (prevWinner.equals("R"))
				types[0] = true;
			else if (prevWinner.equals("P"))
				types[1] = true;
			else if (prevWinner.equals("S"))
				types[2] = true;
			int numWinners = 1;
			
			for (int i = 1; i < input.length; i++)
			{
				String cur = input[i];
				if (cur.equals(prevWinner))
					numWinners++;
				if (cur.equals("R"))
					types[0] = true;
				else if (cur.equals("P"))
					types[1] = true;
				else if (cur.equals("S"))
					types[2] = true;
				if (cur.equals("R") && prevWinner.equals("S"))
					prevWinner = "R";
				else if (cur.equals("S") && prevWinner.equals("P"))
					prevWinner = "S";
				else if (cur.equals("P") && prevWinner.equals("R"))
					prevWinner = "P";
			}
			if (types[0] && types[1] && types[2])
				out.write("NO WINNER");
			else if (numWinners > 1)
				out.write("NO WINNER");
			else if (prevWinner.equals("R"))
				out.write("ROCK");
			else if (prevWinner.equals("S"))
				out.write("SCISSORS");
			else if (prevWinner.equals("P"))
				out.write("PAPER");
			out.write("\n");
		}
		out.close();
	}
}