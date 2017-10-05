package userPackage;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	public static ArrayList<String> sortor(ArrayList<String> listofRumbles){
		Collections.sort(listofRumbles, String.CASE_INSENSITIVE_ORDER);
		return listofRumbles;
	}
}
