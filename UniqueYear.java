package assignment;

import java.util.*;
public class UniqueYear {

	static int No_Of_Unique_Years(String para) {
		
		String str2 = "";
		Set<String> unique_years = new HashSet<>();
                int count=0;
		for (int i = 0; i < para.length(); i++) {

			if (Character.isDigit(para.charAt(i))) {
				str2 += (para.charAt(i));
			}

			if (para.charAt(i) == '-') {
				str2 = "";
                               count++;                         
			}

			if (str2.length() == 4&&count==2) {
                            if(i<para.length()-2&&para.charAt(i+1)=='-')
                                 {
                                   count=0;}
                            else{
                            unique_years.add(str2);                               
                            str2 = "";
                            count=0;
                            }                          
			}
		}
            System.out.println(unique_years);
            return unique_years.size();
	}

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the string");
		String paragraph = obj.nextLine();
		System.out.println(No_Of_Unique_Years(paragraph));
	}
}



