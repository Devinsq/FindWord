package userPackage;
import java.io.*;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) throws IOException{	
		int i;
		HandleJumbled readJumbled = new HandleJumbled();			//create an object of HandleJumbled class to use the openfile function
		SearchEngine Engine0 = new SearchEngine();
		HandleDictionary readDictionary = new HandleDictionary();	//create an object of HandleDictionary class to use the readDictionary function
		String dictionaryName = "dictionary.txt";	//the file name of dictionary
		String jumbledName = "jumbles.txt";
		readDictionary.OpenDictionary(dictionaryName);	
		ArrayList<String> sortedJumbled = new ArrayList<>();
		sortedJumbled = readJumbled.OpenJumbled(jumbledName);
		for (i = 0; i < sortedJumbled.size(); i++){
			String inputString;
			inputString = sortedJumbled.get(i);
			ArrayList<String> COMBINATIONLIST = new ArrayList<>();
			ArrayList<String> matchLIST = new ArrayList<>();
			String str[] = inputString.split("");
			permutate.arrange(str, 0, str.length, COMBINATIONLIST);	
			matchLIST = Engine0.Engine(COMBINATIONLIST, inputString.length(), inputString);
			System.out.println(matchLIST);
			//WriteFile.OutputFile(matchLIST);
		}
		System.out.println("done");
	}

}
