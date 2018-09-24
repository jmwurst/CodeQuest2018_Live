import java.io.*;
import java.util.*;

public class Prob07_INCOMPLETE
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob07.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			int lines = Integer.parseInt(in.nextLine());
			boolean[] pal = new boolean[lines];
			Arrays.fill(pal, true);
			for (int l = 0; l < lines; l++)
			{
				String input = in.nextLine();
				for (int i = 0; i < Math.floor(input.length() / 2.0); i++)
					if (!input.substring(i, i+1).toLowerCase().equals(input.substring(input.length() - i - 1, input.length() - i).toLowerCase()))
					{
						pal[l] = false;
						break;
					}
			}
			String wrong = "";
			for (int i = 0; i < pal.length; i++)
				if (!pal[i])
					wrong += (i + 1) + "";
			if (wrong.length() == 0)
				out.write("True\n");
			else
			{
				String[] wrongones = wrong.split("");
				out.write("False - ");
				for (int i = 0; i < wrongones.length; i++)
				{
					out.write(wrongones[i]);
					if (i < wrongones.length - 1)
						out.write(", ");
				}
				out.write("\n");
			}
		}
		out.close();
	}
}