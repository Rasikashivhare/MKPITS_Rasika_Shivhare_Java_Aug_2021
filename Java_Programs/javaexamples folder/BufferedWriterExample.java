//Java BufferedWriter Class

import java.io.*;
public class BufferedWriterExample 
{
public static void main(String[] args) throws Exception 
{
FileWriter writer = new FileWriter("D:\\testout.txt");
BufferedWriter buffer = new BufferedWriter(writer);
buffer.write("Welcome to mkpits");
buffer.close();
System.out.println("Success");
}
}
