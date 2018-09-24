import java.io.*;
import java.util.*;

public class Prob09
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob09.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			String[] line = in.nextLine().split(",");
			int m = Integer.parseInt(line[0]);
			int s = Integer.parseInt(line[1]);
			while(true)
			{
				if (s > m)
				{
					int temp = s;
					s = m;
					m = temp;
				}
				if (m - s != 0)
				{
					out.write(m + "-" + s + "=" + (m - s) + "\n");
					int temp = m;
					m = s;
					s = temp - s;
				}
				else
				{
					out.write(m + "-" + s + "=" + (m - s) + "\n");
					if (m == 1 && s == 1)
						out.write("COPRIME\n");
					else
						out.write("NOT COPRIME\n");
					break;
				}
			}
		}
		out.close();
	}
}