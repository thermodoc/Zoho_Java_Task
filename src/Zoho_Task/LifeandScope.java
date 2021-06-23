package Zoho_Task;

public class LifeandScope {
	//Scope determines where in a program that a variable can be accessed 
	//LifeTime determines when a variable or object is created and destroyed in memory 
	//The Scope and Life determined from where the variable is declared not initialized 
	public static void main(String args[])
	{
		int i=0;
		for(i=0;i<2;i++)
		{
			int k= 9;
			System.out.println("Value of i is "+i);
			System.out.println("K value is "+k++);
		}/* the value of k is initialized at the start of the loop and destroyed at the end of loop and it follows this 
		same procedure again and again that is why it's value is 9 every time , the lifetime of K starts and ends within this loop*/
		
		//System.out.println("K value is "+k); // this k cannot be printed because it is out of the scope of k 
	}

}
