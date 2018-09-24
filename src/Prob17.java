import java.io.*;
import java.util.*;

public class Prob17
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob17.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			String b = in.nextLine();
			char[] board = b.toCharArray();
			boolean winner = false;
			out.print(b + " = ");
			if (!winner && board[0] == board[1] && board[1] == board[2])
			{
				if (board[0] != '-')
				{
					out.print(board[0] + " WINS\n");
					winner = true;
				}
			}
			if (!winner && board[3] == board[4] && board[4] == board[5])
			{
				if (board[3] != '-')
				{
					out.print(board[3] + " WINS\n");
					winner = true;
				}
			}
			if (!winner && board[6] == board[7] && board[7] == board[8])
			{
				if (board[6] != '-')
				{
					out.print(board[6] + " WINS\n");
					winner = true;
				}
			}
			if (!winner && board[0] == board[3] && board[3] == board[6])
			{
				if (board[0] != '-')
				{
					out.print(board[0] + " WINS\n");
					winner = true;
				}
			}
			if (!winner && board[1] == board[4] && board[4] == board[7])
			{
				if (board[1] != '-')
				{
					out.print(board[1] + " WINS\n");
					winner = true;
				}
			}
			if (!winner && board[2] == board[5] && board[5] == board[8])
			{
				if (board[2] != '-')
				{
					out.print(board[2] + " WINS\n");
					winner = true;
				}
			}
			if (!winner && board[0] == board[4] && board[4] == board[8])
			{
				if (board[0] != '-')
				{
					out.print(board[0] + " WINS\n");
					winner = true;
				}
			}
			if (!winner && board[2] == board[4] && board[4] == board[6])
			{
				if (board[2] != '-')
				{
					out.print(board[2] + " WINS\n");
					winner = true;
				}
			}
			if (!winner)
				out.print("TIE\n");
		}
		out.close();
	}
}