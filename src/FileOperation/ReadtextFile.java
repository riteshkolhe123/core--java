package FileOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadtextFile {
	public static void main(String args[]) throws IOException
	{
		File file = new File("C:\\Users\\rites\\eclipse-workspace\\ReadWrite\\src\\FileOperation\\ReadWrite");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line ="";
		while(line!=null)
		{
			line = br.readLine();
			if(line==null)
			{
				break;
			}
			System.out.println(line);
		}
	}

}
