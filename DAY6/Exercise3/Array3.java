class Array3{
	public static void main(String args[]){
		int elements[][]={{98,12,34,32},{45,54,67,45},{13,14,89,87}};
		
		int sum=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.print (elements[i][j]+ " ");
				sum+=elements[i][j];
			}
			System.out.println();
		}
		System.out.print("The sum of the elements is :"+sum);
	}
}