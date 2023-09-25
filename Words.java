package lexer;

public class Words extends Token{

	public String lexeme = "";
	public Words (String s, int tag) {
		super(tag); 
		lexeme = s;
	}
	public String toString() {
		return lexeme;
	}
	public static final Words 
		and = new Words ("&&",Tag.AND),
		or = new Words ("||",Tag.OR),
		eq = new Words ("==",Tag.EQ),
		ne = new Words ("!=",Tag.NE),
		le = new Words ("<=",Tag.LE),
		ge = new Words (">=",Tag.GE),
		True = new Words ("true",Tag.TRUE),
		False = new Words ("false",Tag.FALSE),
		Temp = new Words ("t",Tag.TEMP),
		minus = new Words ("-",Tag.MINUS);
}
