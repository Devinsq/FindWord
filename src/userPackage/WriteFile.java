package userPackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteFile {
	private static final String FILENAME = "C:\\Users\\SIQI CHAI\\Desktop\\FindWord\\Output.txt";
	public static void OutputFile(ArrayList<String> inputList){
		PrintWriter printWriter = null;
		File file = new File(FILENAME);
		String jumbledWord = inputList.get(0);
		//String realWord = inputList.get(1);
		if(jumbledWord != null){
			try{
				if (!file.exists()) file.createNewFile();
		        printWriter = new PrintWriter(new FileOutputStream(FILENAME, true));
		        int listLength = inputList.size();
		        int i;
		        for(i = 0; i < listLength; i++){
		        	printWriter.write(inputList.get(i)+"	");
		        }
		        printWriter.println();
			}catch (IOException e) {
				e.printStackTrace();
			}finally {
					if (printWriter != null) {
			            printWriter.flush();
			            printWriter.close();
			        }
			}
		}	//End if
	}
}
