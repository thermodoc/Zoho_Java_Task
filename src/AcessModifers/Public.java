package AcessModifers;

public class Public {
	

	public int test=0;  
	public void display()
	{
		System.out.println(" Public Hei");
	}  
	public static void main(String[] args) {
		
		Default obj = new Default();
		System.out.println(obj.test);//
		obj.display();

	

	}

}
