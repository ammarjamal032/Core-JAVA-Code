package hcl.Day_5;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter some text :");
			String s = input.nextLine();
			char s1[] = s.toCharArray();
			int l = s1.length;
			char s2[] = new char[l];
			int j=l;
			for(int i=0 ;i<l;i++) {
				s2[j-1]=s1[i];
				j=j-1;
			}

			for(int i=0;i<l;i++) {
				System.out.print(s2[i]);
			}

		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	
}
