import java.io.*;
import java.util.*;

public class Prob08
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob08.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			double a1 = in.nextDouble();
			double a2 = in.nextDouble();
			double a3 = in.nextDouble();
			a1 -= 180.00;
			a2 -= 180.00;
			a3 -= 180.00;
			if (a1 < 0)
				a1 = 360.00 + a1;
			if (a2 < 0)
				a2 = 360.00 + a2;
			if (a3 < 0)
				a3 = 360.00 + a3;
			String s1 = String.format("%.2f", a1) + "";
			while (s1.length() < 6)
				s1 = "0" + s1;
			String s2 = String.format("%.2f", a2) + "";
			while (s2.length() < 6)
				s2 = "0" + s2;
			String s3 = String.format("%.2f", a3) + "";
			while (s3.length() < 6)
				s3 = "0" + s3;
			out.write(s1 + " " + s2 + " " + s3 + "\n");
		}
		out.close();
	}
}