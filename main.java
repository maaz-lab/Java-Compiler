package main;
import java.io.*;
import parser.*;
import lexer.*;
public class main {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin=new FileInputStream("D:\\testout.txt");    
        int i=0;    
        while((i=fin.read())!=-1){    
         System.out.print((char)i);    
        }    
		Lexer lex = new Lexer();
		Parser parse = new Parser(lex);
		parse.program();
		
	}
}
