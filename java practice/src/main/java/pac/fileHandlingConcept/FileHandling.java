package pac.fileHandlingConcept;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
	String fileNamePath = "C:\\Users\\my pc\\Desktop\\java\\mohan java\\java practice\\src\\main\\java\\pac\\fileHandlingConcept.txt";
	
	File fileHandling = new File(fileNamePath);
	//fileHandling.createNewFile();
//	System.out.println("Can Read:"+fileHandling.canRead());
//	System.out.println("Can Write:"+fileHandling.canWrite());
//	System.out.println("Length:"+fileHandling.length());
//	System.out.println("Total Space:"+fileHandling.getTotalSpace());
//	System.out.println("File:"+fileHandling.isFile());
//	System.out.println("Name:"+fileHandling.getName());
//	System.out.println("Parent:"+fileHandling.getParent());
//	System.out.println("Path:"+fileHandling.getPath());
//	System.out.println("Can :"+fileHandling.toString());
//	System.out.println("Can AbPath:"+fileHandling.getAbsolutePath());
//	System.out.println("Can Delete:"+fileHandling.delete());
//	System.out.println("Can Exist:"+fileHandling.exists());
	
	
	FileReader fr = new FileReader(fileHandling);
	BufferedReader br = new BufferedReader(fr);
	System.out.println(br.readLine());
	
	FileWriter fw = new FileWriter(fileHandling);
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write("This is Write Operation::");
	bw.flush();

	}

}
