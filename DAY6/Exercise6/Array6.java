import java.util.Scanner;
class Array6{
	public static void main(String args[]){
		
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the size of row : ");
		int size1=ob.nextInt();
		System.out.print("Enter the size of column : ");
		int size2=ob.nextInt();
		int marks[][]=new int [size1][size2];
		System.out.print ("Enter the elements for row :");
		for (int i=0;i<size1;i++){
			for (int j=0;j<size2;j++){
				marks[i][j]=ob.nextInt();
			}
		}
		for (int i=0;i<size1;i++){
			for (int j=0;j<size2;j++){
				System.out.print(marks[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println();
        int maximum=marks[0][0];
		for (int i=0;i<size1;i++){
			for (int j=0;j<size2;j++){
				if (maximum<marks[i][j]){
					maximum=marks[i][j];
				}
			}
		}
		System.out.println("The maximum value is :" +maximum);  		
	}
}