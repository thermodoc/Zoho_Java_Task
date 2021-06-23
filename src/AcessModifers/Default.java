package AcessModifers;
//If you don't use any modifier, 
//it is treated as default by default. The default modifier is accessible only within package. It cannot be accessed from outside the package.
class Default { // this class is Default so it can only be accessed by other classes in same package whereas public classes can be accessed anywere 
	int test=0;  
	void display()
	{
		System.out.println("Default Hei");
	}  
	public static void main(String[] args) {
		
		Default obj = new Default();
		System.out.println(obj.test);//
		obj.display();

	

	}

}
