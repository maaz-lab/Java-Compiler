package lexer;

import java.util.*;
import symbols.*;
import java.io.*;

public class Lexer{
	
	
	String l;
	public static int line =1;
	char peek = ' ';
	
	Hashtable<String, Words> words = new Hashtable();
//to store all the keywords or holds the pattern of that keywords 
	
	void reserve(Words w) {
		words.put(w.lexeme,w);
	}
	
	public Lexer() {
		reserve( new Words("if",Tag.IF));
		reserve( new Words("else",Tag.ELSE));
		reserve( new Words("while",Tag.WHILE));
		reserve( new Words("do",Tag.DO));
		reserve( new Words("break",Tag.BREAK));
		reserve( Words.True); reserve (Words.False);
	}
	void readch() throws IOException {
		
		peek = (char)System.in.read();
	}
	boolean readch(char c) throws IOException{
		readch();
		if(peek != c)
			return false;
		peek = ' ';
		return true;
	}
	public Token scan() throws IOException{
		for( ; ; readch() ) {
			if(peek== ' '|| peek == '\t')
				continue;
			else if(peek == '\n')
				line = line+1;
			else
				break;
		}
		switch(peek) {
		case '&':
			if(readch('&'))
				return Words.and; //&&
			else
				return new Token('&');
		case '|':
			if(readch('|'))
				return Words.or; //||
			else
				return new Token('|');
		case '=':
			if(readch('='))
				return Words.eq; //==
			else
				return new Token('=');
		case '!':
			if(readch('!'))
				return Words.ne; 
			else
				return new Token('!');
		case '<':
			if(readch('<'))
				return Words.le;
			else
				return new Token('<');
		case '>':
			if(readch('>'))
				return Words.ge;
			else
				return new Token('>');
		}
		if (Character.isDigit(peek)){
			int v=0;
			do {
				v=10*v + Character.digit(peek,10);
				readch();
			}while(Character.isDigit(peek));
			if(peek != '.')
				return new Num(v);
			float x = v;
			float d = 10;
			for(;;) {
				readch();
				if(! Character.isDigit(peek))
					break;
				x=x+Character.digit(peek, 10)/d;
				d=d+10;
			}
			return new Real(x);
		}
		if (Character.isLetter(peek)){
			StringBuffer b = new StringBuffer();
			
			do {
				b.append(peek);
				readch();
			}while(Character.isLetterOrDigit(peek));
			String s = b.toString();
			Words w = (Words)words.get(s);
			if(w!=null)
				return w;
			w = new Words(s,Tag.ID);
			words.put(s, w);
			return w;
			}
		Token tok = new Token(peek);
		peek = ' ';
		System.out.println(tok);
		return tok;
		}
}
