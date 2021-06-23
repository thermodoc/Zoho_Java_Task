package Zoho_Task;

public class StringandStringBuffer {
	public static void stringConcat(String string)
    {
        string = string +"hello";
    }
 

    public static void StringBuilderConcat(StringBuilder stringBuider)
    {
        stringBuider.append("hello");
    }
 
   
    public static void StringBufferConcat(StringBuffer stringBuffer)
    {
        stringBuffer.append("hello");
    }
 
    public static void main(String[] args)
    {
        String string = "hi ";
 

        stringConcat(string);
        System.out.println("String: " + string);
 
        StringBuilder stringBuilder = new StringBuilder("hi ");
 
        
        StringBuilderConcat(stringBuilder);
        System.out.println("StringBuilder: " + stringBuilder);
 
        StringBuffer stringBuffer = new StringBuffer("hi ");
 
 
        StringBufferConcat(stringBuffer);
        System.out.println("StringBuffer: " + stringBuffer);
    }
    //From the output we can see that the String value has not changed as java only passes by value and String is immutable on the other hand 
    //StringBuilder and StringBuffers are Mutable and The main difference between String Buffer and String Builders are that Buffers are thread safe 
    // and Because of that they are a bit slower than String Builder, StringBuilders are not Thread-safe and is fasted than String buffer

}
