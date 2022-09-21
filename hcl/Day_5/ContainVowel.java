package hcl.Day_5;
import java.util.*;
public class ContainVowel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Text :");
		String s = input.nextLine();
		char s1[] = s.toCharArray();
		int l = s.length();
		int count=0,sp=0;
		for (int i=0;i<l;i++) {
			if(s1[i]=='a'|| s1[i]=='i'|| s1[i]=='o'|| s1[i]=='u'|| s1[i]=='v' ||s1[i]=='A'|| s1[i]=='I'|| s1[i]=='O'|| s1[i]=='U'|| s1[i]=='V') {
				count += 1;
			}
			
		}
		System.out.println("Vowels are :"+count);
		
		for (int i=0;i<l;i++) {
			if(s1[i]==' ') {
				sp += 1;
			}
			
		}
		System.out.println("Consonants are :"+(l-count-sp));
		System.out.println(l);
		
		input.close();
	}
}
