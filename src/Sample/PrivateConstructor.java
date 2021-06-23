package Sample;

public class PrivateConstructor {
	public int a = 1;
	static PrivateConstructor pri = null;

	private PrivateConstructor()
	{
		//Private constructors are mainly used to crerate singleton classes
		// a class is said to be singleton if it limits the number of objects of that class to one.
		//We can’t have more than a single object for such classes.
	}
	public static PrivateConstructor get()
	{
		if(pri == null)
		{
			pri = new PrivateConstructor();
		}
		return pri;
	}

	


}
