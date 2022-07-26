package Email;

import java.util.Scanner;
import java.util.regex.*;

public class Emailid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email:");
		String str= sc.nextLine();
		Pattern pat =Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
		//System.out.println("");
		Matcher m=pat.matcher(str);
		if(m.find()) {
			System.out.println("Valid email id");
		}
		else {
			System.out.println("Invalid email id");
		}
	}

}
