package StringPrograms;
import java.util.*;



//WAP to convert uppercase to lower case and vice versa of a given string or sentence
public class UpperToLowerCase {
	public static void main(String[] args) {
		


			int i,len;
			char ch;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String: ");
			String str=sc.nextLine();
			len=str.length();
			for(i=0;i<len;i++)
			{
				ch=str.charAt(i);
				if(Character.isUpperCase(ch))
					System.out.print(Character.toLowerCase(ch));
				else
					System.out.print(Character.toUpperCase(ch));
				
				sc.close();
			}
		}
	}
