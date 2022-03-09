package com.cg.exceptionhandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CheckException1 {
static void writebuffer() throws IOException{
	
		BufferedWriter b =new BufferedWriter(new FileWriter("myfile.txt"));
       b.write("hello");
       b.close();
}
public static void main(String[]args) throws IOException
{
	writebuffer();
	}
}

