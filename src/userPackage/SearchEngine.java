package userPackage;

import java.util.ArrayList;

public class SearchEngine {
	//public static String correctWord = null;
	public ArrayList<String> Engine(ArrayList<String> list, int len, String originalWord){
		int i;
		String correctWord;
		ArrayList<String> correctWordList = new ArrayList<>();
		correctWordList.add(originalWord);
		correctWordList.add("	");
		for(i = 0; i < list.size(); i++){
			correctWord = DictionarySearch(list.get(i), len);
			if(correctWord != null && (!correctWordList.contains(correctWord))){
				correctWordList.add(correctWord);
			}
		}
		return correctWordList;
	}
	
	public String DictionarySearch(String Word, int len){
		int dicListLen = 0;
		int k;
		String correctWord = null;
		switch(len){
		case 2:
			dicListLen = EditList.List02.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List02.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 3:
			dicListLen = EditList.List03.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List03.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 4:
			dicListLen = EditList.List04.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List04.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 5:
			dicListLen = EditList.List05.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List05.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 6:
			dicListLen = EditList.List06.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List06.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 7:
			dicListLen = EditList.List07.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List07.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 8:
			dicListLen = EditList.List08.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List08.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 9:
			dicListLen = EditList.List09.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List09.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 10:
			dicListLen = EditList.List10.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List10.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 11:
			dicListLen = EditList.List11.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List11.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 12:
			dicListLen = EditList.List12.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List12.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 13:
			dicListLen = EditList.List13.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List13.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 14:
			dicListLen = EditList.List14.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List14.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 15:
			dicListLen = EditList.List15.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List15.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 16:
			dicListLen = EditList.List16.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List16.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 17:
			dicListLen = EditList.List17.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List17.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 18:
			dicListLen = EditList.List18.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List18.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 19:
			dicListLen = EditList.List19.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List19.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 20:
			dicListLen = EditList.List20.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List20.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 21:
			dicListLen = EditList.List21.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List21.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 22:
			dicListLen = EditList.List22.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List22.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 23:
			dicListLen = EditList.List23.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List23.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 24:
			dicListLen = EditList.List24.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List24.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 25:
			dicListLen = EditList.List25.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List25.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 26:
			dicListLen = EditList.List26.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List26.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 27:
			dicListLen = EditList.List27.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List27.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		case 28:
			dicListLen = EditList.List28.size();
			for(k = 0; k < dicListLen; k++){
				if(Word.equals(EditList.List28.get(k)) == true){
					correctWord = Word;
				}
			}
			break;
		default:
			System.out.println("Word Too Long or Too Short");
			break;	
		}
		return correctWord;
	}
}
