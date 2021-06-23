package AcessModifers;
//The private access modifier is accessible only within the class.
public class Private {
	private int test=0;  
	private void display()
	{
		System.out.println("Private Hei");
	}  
	public static void main(String[] args) {
		
		Private obj = new Private();
		System.out.println(obj.test);//
		obj.display();

	

	}

}
