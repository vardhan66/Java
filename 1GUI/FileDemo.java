import java.io.*;
import javax.swing.*;
class FileDemo
{
	public static void main(String args[])
	{
		String filename = JOptionPane.showInputDialog("Enter filename: ");
		File f = new File(filename);
		System.out.println("File exists: "+f.exists());
		System.out.println("File is readable: "+f.canRead());
		System.out.println("File is writable: "+f.canWrite());
		System.out.println("Is a directory: "+f.isDirectory());
		System.out.println("length of the file: "+f.length()+" bytes");
		
		try
		{
			char ch;
			StringBuffer buff = new StringBuffer("");
			FileInputStream fis = new FileInputStream(filename);
			while(fis.available()!=0)
			{
				ch = (char)fis.read();
				buff.append(ch);
			}
			System.out.println("\nContents of the file are: ");
			System.out.println(buff);
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find the specified file...");
		}
		catch(IOException i)
		{
			System.out.println("Cannot read file...");
		}
	}
}