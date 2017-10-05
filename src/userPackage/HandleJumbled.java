package userPackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HandleJumbled {
	String varInput = null;	//Initialize a string to copy stream
	String arrayName;
	permutate permutator = new permutate();
	SearchEngine Engine0 = new SearchEngine();
	public ArrayList<String> OpenJumbled(String fileName){
		ArrayList<String> rambles = new ArrayList<>();
		try{
			FileReader fileReader = new FileReader(fileName);	//create a filereader to read file
			BufferedReader bufReader = new BufferedReader(fileReader);	//create a buffer reader to read buffer value
			String inputString = null;	//create and initialize a string to copy buffer input
			while((inputString = bufReader.readLine()) != null){	//copy buffer value & make sure the value != null 			
				rambles.add(inputString);
			}
			bufReader.close();	//shutdown buffer reader in case read in null value		
		}
		catch(FileNotFoundException ex){
			System.out.println("No such file");	//in case file name is wrong
		}
		catch(IOException ex){
			System.out.println("File Format err");		//in case content of file is unreadable 
		}
		rambles = Sort.sortor(rambles);
		return rambles;
	}
}
