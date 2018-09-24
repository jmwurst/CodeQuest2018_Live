import java.io.*;
import java.util.*;

public class Prob00
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob00.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			int lines = Integer.parseInt(in.nextLine());
			for (int l = 0; l < lines; l++)
			{
				String input = in.nextLine();
				out.write(input + "\n");
			}
		}
		out.close();
	}
}