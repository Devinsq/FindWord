package userPackage;

import java.util.ArrayList;

public class EditList {
	static ArrayList<String> List02 = new ArrayList<>();
	static ArrayList<String> List03 = new ArrayList<>();
	static ArrayList<String> List04 = new ArrayList<>();
	static ArrayList<String> List05 = new ArrayList<>();
	static ArrayList<String> List06 = new ArrayList<>();
	static ArrayList<String> List07 = new ArrayList<>();
	static ArrayList<String> List08 = new ArrayList<>();
	static ArrayList<String> List09 = new ArrayList<>();
	static ArrayList<String> List10 = new ArrayList<>();
	static ArrayList<String> List11 = new ArrayList<>();	
	static ArrayList<String> List12 = new ArrayList<>();
	static ArrayList<String> List13 = new ArrayList<>();
	static ArrayList<String> List14 = new ArrayList<>();
	static ArrayList<String> List15 = new ArrayList<>();
	static ArrayList<String> List16 = new ArrayList<>();
	static ArrayList<String> List17 = new ArrayList<>();
	static ArrayList<String> List18 = new ArrayList<>();
	static ArrayList<String> List19 = new ArrayList<>();
	static ArrayList<String> List20 = new ArrayList<>();
	static ArrayList<String> List21 = new ArrayList<>();
	static ArrayList<String> List22 = new ArrayList<>();
	static ArrayList<String> List23 = new ArrayList<>();
	static ArrayList<String> List24 = new ArrayList<>();
	static ArrayList<String> List25 = new ArrayList<>();
	static ArrayList<String> List26 = new ArrayList<>();
	static ArrayList<String> List27 = new ArrayList<>();
	static ArrayList<String> List28 = new ArrayList<>();
	/*maximum 28 char word*/
	
	public static void addValue(int varLength, String varInput){
		switch (varLength){
		case 2:
			List02.add(varInput);
			break;
		case 3:
			List03.add(varInput);
			break;
		case 4:
			List04.add(varInput);
			break;
		case 5:
			List05.add(varInput);
			break;
		case 6:
			List06.add(varInput);
			break;
		case 7:
			List07.add(varInput);
			break;
		case 8:
			List08.add(varInput);
			break;
		case 9:
			List09.add(varInput);
			break;
		case 10:
			List10.add(varInput);
			break;
		case 11:
			List11.add(varInput);
			break;
		case 12:
			List12.add(varInput);
			break;
		case 13:
			List13.add(varInput);
			break;
		case 14:
			List14.add(varInput);
			break;
		case 15:
			List15.add(varInput);
			break;
		case 16:
			List16.add(varInput);
			break;
		case 17:
			List17.add(varInput);
			break;
		case 18:
			List18.add(varInput);
			break;
		case 19:
			List19.add(varInput);
			break;
		case 20:
			List20.add(varInput);
			break;
		case 21:
			List21.add(varInput);
			break;
		case 22:
			List22.add(varInput);
			break;
		case 23:
			List23.add(varInput);
			break;
		case 24:
			List24.add(varInput);
			break;
		case 25:
			List25.add(varInput);
			break;
		case 26:
			List26.add(varInput);
			break;
		case 27:
			List27.add(varInput);
			break;
		case 28:
			List28.add(varInput);
			break;
		default:
			System.out.println("Too Long or Too Short");
			break;
		//This part allows the program to sort word by length
		}

	}
}
