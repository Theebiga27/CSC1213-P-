import java.util.Scanner;
class javaEx4{
	public static void main(String[] args){
		Scanner ob=new Scanner(System.in);
		System.out.print ("Enter an Alphabet:");
		char vowels=ob.next().charAt(0);
		switch(vowels){
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':System.out.println(vowels +" is a vowel in alphabets!");
			         break;
			default :System.out.println(vowels+" is not a vowel!");
		}
	}
}	
			
			
		