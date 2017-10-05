package userPackage;

import java.util.ArrayList;

public class permutate {
	public static int total = 0;  
	
    public static void swap(String[] str, int i, int j){  
        String temp = new String();  
        temp = str[i];  
        str[i] = str[j];  
        str[j] = temp;  
    }  
    
    public static ArrayList<String> arrange (String[] str, int initialValue, int len, ArrayList<String> inputList){  
        if (initialValue == len - 1){  
        	String s = "";
            for (int i = 0; i < len; i ++)  
            {
                s = s.concat(str[i]);
            }  
            inputList.add(s); 
            total++;  
        }  
        else{  
            for (int i = initialValue; i < len; i ++){  
                swap(str, initialValue, i);  
                arrange(str, initialValue + 1, len,inputList);  
                swap(str, initialValue, i);  
            }  
        }
		return inputList;  
}
}
