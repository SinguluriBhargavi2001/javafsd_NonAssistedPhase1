import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class File_Handling {
	
	public static void main(String[] args) throws IOException {
		ReadFile();
		WriteFile();
		createFileIn_NIO();
	}
	
	private static void ReadFile() throws IOException{
		File f=new File("C://Users//Intel//Desktop//SimpliLearn//testFile1.txt");
		if(f.exists()) {
			//for reading bytes
			FileInputStream f1=new FileInputStream(f);
			int num=f1.available();
			//System.out.println(num);
			byte b[]=new byte[num];
			//System.out.println(b);
			int n=f1.read(b);
			//System.out.println(n);
			String s=new String(b);
			System.out.println("File opened in read mode\nThe Contents of file are: "+s);
			f1.close();
			f=null;
		}
		else {
			System.out.println("File does not exist");
			System.exit(0);
		}
	}
	
	private static void WriteFile() throws IOException{
		//for writing bytes
		FileOutputStream fs=new FileOutputStream("C://Users//Intel//Desktop//SimpliLearn//testFile1.txt");
		System.out.println("\nFile opened in write mode, now writing contents\nIf contents already available, that will be overwritten");
		//Reading content from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter content: ");
		String data=sc.nextLine();
		//writing bytes to file 
		fs.write(data.getBytes());
		fs.flush();
		System.out.println("Contents Written");
		System.out.println("Closing file");
		fs.close();
	}
	
	private static void createFileIn_NIO() throws IOException{
		//Append contents to a file
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter contents to append: ");
		String lines=sc.nextLine();
        Files.write(Paths.get("C://Users//Intel//Desktop//SimpliLearn//testFile1.txt"),
                    lines.getBytes(), StandardOpenOption.APPEND );
    }
}