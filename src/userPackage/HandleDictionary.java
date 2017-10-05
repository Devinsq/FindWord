package userPackage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HandleDictionary extends Main{
	String varInput = null;	//Initialize a string to copy stream
	static int VAR_Length = -1;	//Initialize an integer to count word length
	static ArrayList<Integer> LENGTH_List = new ArrayList<>(); //Declare an integer to store length value
	static int i;	//for loop use
	static boolean FLAG;	//for loop use
	String arrayName;
	public void OpenDictionary(String fileName){
		try{
			FileReader fileReader = new FileReader(fileName);	//create a filereader to read file
			BufferedReader bufReader = new BufferedReader(fileReader);	//create a buffer reader to read buffer value
			String inputString = null;	//create and initialize a string to copy buffer input
			while((inputString = bufReader.readLine()) != null){	//copy buffer value & make sure the value != null 
				SortByLength(inputString);
			}
			bufReader.close();	//shutdown buffer reader in case read in null value		
		}
		catch(FileNotFoundException ex){
			System.out.println("No such file");	//in case file name is wrong
		}
		catch(IOException ex){
			System.out.println("File Format err");		//in case content of file is unreadable 
		}
	}
	
	public static void SortByLength(String latestInput){
		VAR_Length = latestInput.length();	//get the length of input word
		//System.out.println("Function called");
		if(VAR_Length != 0){	//make sure the word is not empty
			FLAG =true;	//set flag true, assume the length number is not on the length list
			for(i = 0; i < LENGTH_List.size(); i++){
				if(LENGTH_List.get(i) == VAR_Length){	//check if this specific word length is already in length list
					FLAG = false;	//if found, flag false
				}
			}
			if(FLAG == true){
				LENGTH_List.add(VAR_Length);	//if not found, add the specific length to list
			}
		}
		EditList.addValue(VAR_Length, latestInput);
	}
}
