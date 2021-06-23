package AcessModifers;
//The protected access modifier is accessible within package and outside the package but through inheritance only.
public class Protected {
	protected int test=0;  
	protected void display()
	{
		System.out.println(" protected Hei");
	}  
	public static void main(String[] args) {
		
		Protected obj = new Protected();
		System.out.println(obj.test);//
		obj.display();

	

	}


}
