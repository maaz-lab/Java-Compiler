package lexer;


public class Token {
	//Token.java
	
	public final int tag;
	public Token(int t)
	{
		tag =t;
	}
	public String toString() {
		
		return "" + (char)tag;
	}
}
