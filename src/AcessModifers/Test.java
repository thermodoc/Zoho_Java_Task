package AcessModifers;

public class Test  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private objPrivate = new Private();
		//System.out.println(objPrivate.test);//Not Accessible because it is Private
		//objPrivate.display();// Not Not Accessible because it is Private
		Protected pro = new Protected();
		pro.display();// this is accessible because we are on the same package
		Default def = new Default();
		System.out.println(def.test++);
		def.display();
		Public pub = new Public();
		pub.display();
		System.out.println(pub.test);
		

	}

}
