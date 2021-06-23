package Sample;

//import AcessModifers.Default;
import AcessModifers.Private;
import AcessModifers.Protected;
import AcessModifers.Public;

public class AcessModiferTest extends Protected 
{
	public static void main(String[] args) {
		Private pri = new Private();
		//pri.display();// not accessible because of private 
		//Default def = new Default();
		//def.display();//// not accessible because of private 

		AcessModiferTest pro = new AcessModiferTest();
		pro.display();// this is accessible because we are extending the protected package
		Public pub = new Public();
		pub.display();
		System.out.println(pub.test);
		

	}
}
