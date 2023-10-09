package FileOperation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
	public static void main(String args[]) throws IOException 
	{
		File file = new File("C:\\Users\\rites\\eclipse-workspace\\ReadWrite\\src\\FileOperation\\ReadWrite");
		FileWriter fileWriter = new FileWriter(file,false);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		String contentToWrite = "i'm adding a new line.\n";
		bufferedWriter.write(contentToWrite);
		bufferedWriter.close();
		fileWriter.close();
		file=null;
	}

}