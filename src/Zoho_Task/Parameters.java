package Zoho_Task;

import java.util.Arrays;

//In java the functions are called by values ,A mutable object’s value can be changed when it is passed to a method. 
public class Parameters {
	int a=50;
	String s="Yes";
	double f=1;
	int arr[] = {1,2};
	String str[]= {"Hi","Hello"};
	
public void integer(int a)
	{
		a = a+50;
		
	}
public void string(String s)
{
	s=s+"no";
}
public void doubleparameters(double f)
{
	f=f+1;
}
public void arrays(int arr[])
{
	for(int i=0;i<2;i++)
	{
		arr[i]=arr[i]+2;
	}
}
public void stringArrays(String str[])
{
	for(int i=0;i<2;i++)
	{
		str[i]=str[i]+"no";
	}
}
public void objectArrays(Parameters obj)
{
	for(int i=0;i<2;i++)
	{
		obj.arr[i]=obj.arr[i]+2;
	}
}
public void objectStringArrays(Parameters obj)
{
	for(int i=0;i<2;i++)
	{
		obj.str[i]=obj.str[i]+"no";
	}
}

public static void main(String args[])
{
	Parameters obj = new Parameters();
	System.out.println("Integer Before: "+obj.a);
	obj.integer(100);
	System.out.println("Integer After: "+obj.a);

	System.out.println("String Before: "+obj.s);
	obj.string("No");
	System.out.println("String After: "+obj.s);
	System.out.println("Double Before: "+obj.f);
	obj.doubleparameters(2);
	System.out.println("Double After: "+obj.f);
	
	System.out.println("Array Before"+Arrays.toString(obj.arr));
	obj.arrays(new int[] {2,3});
	System.out.println("Array After"+Arrays.toString(obj.arr));
	System.out.println("String Array Before"+Arrays.toString(obj.str));
	obj.stringArrays(new String[] {"a","b"});
	System.out.println("String Array After"+Arrays.toString(obj.str));
	System.out.println("String Array using object Before"+Arrays.toString(obj.str));
	obj.objectStringArrays(obj);
	System.out.println("String Array using object After"+Arrays.toString(obj.str));
	System.out.println("Array using object Before"+Arrays.toString(obj.arr));
	obj.objectArrays(obj);
	System.out.println("Array using object After"+Arrays.toString(obj.arr));
	
	
	
	
	
	
}
}
