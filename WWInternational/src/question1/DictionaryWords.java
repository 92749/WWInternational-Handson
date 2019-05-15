package question1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

class DictionaryWords 
{
	public static void main(String[] args) 
	{
		doesFileExists("C:\\Users\\firef\\Words.txt");
	}

	private static void doesFileExists(String filePath) 
	{
		try {
			File file = new File(filePath);
			Scanner sobj = new Scanner(file);

			while (sobj.hasNextLine()) 
			{
				String str = sobj.nextLine();
				StringTokenizer st = new StringTokenizer(str, "-,");
				while (st.hasMoreTokens()) 
				{
					System.out.println(st.nextToken());
				}

			}
		} catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		} catch (Exception e) 
		{
			System.out.println("Execution Failed ");
		}
		
	}
}