package Sample;

public class Constructors {
	public static void main(String[] args) 
	{
		
		//PrivateConstructor pri = new PrivateConstructor();//cant create object because of the private constructor
		ProtectedConstructor pro = new ProtectedConstructor();// object is created as it is used within the same package
	}

}
