class Ex{
	int id;
	String name;
	public Ex(String name,int id){
		
		this.name=name;
		this.id=id;
	}
}

class Ex3{	
	public static void main(String[] args){
		Ex sc=new Ex("shorubi",101);
		System.out.println(sc.id +" "+sc.name);
	}
}
