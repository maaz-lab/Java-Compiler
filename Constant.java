package inter;
import lexer.*; // lexical anylizal
import symbols.*; //symbol table
public class Constant extends Expr{
	public Constant(Token tok, Type p) {
		super(tok,p);
	}
	public Constant(int i) {
		super(new Num(i),Type.Int);
	}
	public static final Constant
		True = new Constant(Words.True,Type.Bool),
		False= new Constant(Words.False,Type.Bool);
	public void jumping(int t,int f) {
		if(this == True && t !=0)
			emit("goto L" + t);
		else if(this == False && f !=0)
			emit("goto L" + f);
	}
}
