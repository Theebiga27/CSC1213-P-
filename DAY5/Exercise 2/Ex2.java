import java.util.Scanner;
public class Ex2{
	public static void main(String args[]){
		Scanner sc = new  Scanner(System.in);
		int[] numbers= new int[10];
		for (int i=0; i<10; i++){
		System.out.print("Enter the number "+(i+1)+" : ");
		numbers[i]=sc.nextInt();
		}
		for (int i=0; i<10; i++){
		System.out.print(numbers[i]+"\t");
		}
		System.out.println();
		String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	for(String day:days){
		System.out.print(day+"\t");
	}
	}
}