import java.util.Scanner;

class Array5{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		
		int number1[]=new int[size];
		
		for(int i=0;i<number1.length;i++){
			System.out.println("Enter the element "+(i + 1)+" : ");
			number1[i] = sc.nextInt();
		}
		
		System.out.print("\nArray Elements :");
		for(int i=0;i<number1.length;i++){
			System.out.println(number1[i]+"\t");
		}

    int max=number1[0];
    int min=number1[0];	
    int sum=0;
	double average;
	
	for(int i=0;i<number1.length;i++){
		if(number1[i]>max){
			max=number1[i];
		}
		if (number1[i]<min){
			min=number1[i];
		}
		sum +=number1[i];
	}
	average=(double) sum/number1.length;
	
	System.out.println("\n\nMaximum Elements :"+max);
	System.out.println("Minimum Elements :"+min);
	System.out.println("Summation :"+sum);
	System.out.println("Average :"+average);
	
	System.out.print("\nEnter the element you want to search :");
	int searchElement =sc.nextInt();
	boolean found=false;
	for(int i=0;i<number1.length;i++){
		if(number1[i]==searchElement){
			System.out.println("Element found in the position :"+(i+1));
			found=true;
			break;
		}
	}
	if(!found){
		System.out.println("Element not found");
	}
	
	boolean isUnique=true;
	for(int i=0;i<number1.length;i++){
		for(int j=i+1;j<number1.length;j++){
			if(number1[i]==number1[j]){
				isUnique=false;
				break;
			}
		if (!isUnique){
			break;
		}
		}
	}
		
		if (isUnique){
		    System.out.println("All elements are unique.");}
		else
		{
			System.out.println("Not Unique-duplicate elements exist.");
		}
	 }
   }

	