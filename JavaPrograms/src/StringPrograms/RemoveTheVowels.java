package StringPrograms;
import java.util.Scanner;


//WAP to remove the vowels from the input string
public class RemoveTheVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String Value");
		
		 String s1 = sc.nextLine();
		 System.out.println("Remove the Vowels From String Value");
		 String s2 = s1.replaceAll("[aeiouAEIOU]", "");
		 System.out.println(s2);
		sc.close();
	}

}
