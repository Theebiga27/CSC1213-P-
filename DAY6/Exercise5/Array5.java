class Array5{
	public static void main(String args[]){
		int marks[][]={{54,02,45},{67,54,87},{76,46,89},{9,10,65}};
		
		for (int i=0;i<4;i++){
			int maximum=marks[i][0];
			for (int j=0;j<3;j++){
				System.out.print(marks[i][j]+" ");
				if (maximum<marks[i][j]){
					maximum=marks[i][j];
				}
			}
			    System.out.println();
				System.out.print ("the maximum marks of raw "+(i+1) +"is :"+maximum);
				System.out.println();
		}
	}
}