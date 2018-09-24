import java.io.*;
import java.util.*;

public class Prob13
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("Prob13.in.txt"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			int people = Integer.parseInt(in.nextLine());
			String[] data = in.nextLine().split(",");
			//for(int i = 0; i < data.length; i++)System.out.println(data[i]);
			String[][] book = new String[people][6];
			for (int p = 0; p < people; p++)
			{
				int type = 0;
				for (int i = p; i < data.length; i += people)
				{
					if (type == 0)
						book[p][type] = "Name: " + debracket(data[i]);
					if (type == 1)
						book[p][type] = "Age: " + debracket(data[i]);
					if (type == 2)
						book[p][type] = "Instagram: " + debracket(data[i]);
					if (type == 3)
						book[p][type] = "Twitter: " + debracket(data[i]);
					if (type == 4)
						book[p][type] = "Phone: " + debracket(data[i]);
					if (type == 5)
						book[p][type] = "Email: " + debracket(data[i]);
					type++;
				}
			}
			for (int i = 0; i < people; i++)
			{
				String person = in.nextLine();
				for (int j = 0; j < people; j++)
				{
					if (person.equals(book[j][0].substring(6)))
					{
						for (int k = 0; k < book[j].length; k++)
						{
							out.write(book[j][k] + "\n");
						}
					}
				}
				
			}
		}
		out.close();
	}
	
	public static String debracket(String s)
	{
		String newstr = "";
		for (int i = 0; i < s.length(); i++)
			if (!s.substring(i, i+1).equals("[") && !s.substring(i, i+1).equals("]"))
				newstr += s.substring(i, i+1);
		return newstr;
	}
}