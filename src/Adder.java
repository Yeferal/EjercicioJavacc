/* Adder.java */
/* Generated By:JavaCC: Do not edit this line. Adder.java */
        public class Adder implements AdderConstants {
            private Integer valx;
            private Integer valy;
            private Integer valz;
            public Integer resultadoFinal = 0;

            public Adder(Integer valx,Integer valy,Integer valz){
                this.valx=valx;
                this.valy=valy;
                this.valz=valz;
            }

           public Integer getValx(){
            return this.valx;
           }
           public Integer getValy(){
            return this.valy;
           }
            public Integer getValz(){
            return this.valz;
           }

  final public void Start() throws ParseException {Adder letras = null;
    letras = Z();
    X(letras);
}

  final public Adder Z() throws ParseException {Token valx;Token valy;Token valz;
    jj_consume_token(LETRAX);
    jj_consume_token(IGUAL);
    valx = jj_consume_token(NUMBER);
    jj_consume_token(COMA);
    jj_consume_token(LETRAY);
    jj_consume_token(IGUAL);
    valy = jj_consume_token(NUMBER);
    jj_consume_token(COMA);
    jj_consume_token(LETRAZ);
    jj_consume_token(IGUAL);
    valz = jj_consume_token(NUMBER);
    jj_consume_token(PUNTOCOMA);
{if ("" != null) return new Adder(Integer.parseInt(valx.image),Integer.parseInt(valy.image),Integer.parseInt(valz.image));}
    throw new Error("Missing return statement in function");
}

  final public void X(Adder letras) throws ParseException {int resultadoT; int resultadoXP;
    resultadoT = T(letras);
    resultadoXP = XP(letras);
System.out.println("EL RESULTADO ES: "+(resultadoT+resultadoXP)); resultadoFinal=resultadoT+resultadoXP;
}

  final public int XP(Adder letras) throws ParseException {Integer numero1; Integer numero2; Integer resultado;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MAS:{
      jj_consume_token(MAS);
      numero1 = T(letras);
      numero2 = XP(letras);
resultado = numero2+numero1; {if ("" != null) return resultado;}
      break;
      }
    case MENOS:{
      jj_consume_token(MENOS);
      numero1 = T(letras);
      numero2 = XP(letras);
resultado = numero2-numero1; {if ("" != null) return resultado;}
      break;
      }
    default:
      jj_la1[0] = jj_gen;
{if ("" != null) return 0;}
    }
    throw new Error("Missing return statement in function");
}

  final public int T(Adder letras) throws ParseException {Integer numero; Integer resultado;
    numero = F(letras);
    resultado = TP(numero,letras);
{if ("" != null) return resultado;}
    throw new Error("Missing return statement in function");
}

  final public int TP(Integer val,Adder letras) throws ParseException {Integer numero;Integer resultado;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MUL:{
      jj_consume_token(MUL);
      numero = F(letras);
      resultado = TP(val*numero,letras);
{if ("" != null) return resultado;}
      break;
      }
    case DIV:{
      jj_consume_token(DIV);
      numero = F(letras);
      resultado = TP(val/numero,letras);
{if ("" != null) return resultado;}
      break;
      }
    default:
      jj_la1[1] = jj_gen;
{if ("" != null) return val;}
    }
    throw new Error("Missing return statement in function");
}

  final public int F(Adder letras) throws ParseException {Token numero;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUMBER:{
      numero = jj_consume_token(NUMBER);
{if ("" != null) return Integer.parseInt(numero.image);}
      break;
      }
    case LETRAX:{
      jj_consume_token(LETRAX);
{if ("" != null) return letras.getValx();}
      break;
      }
    case LETRAY:{
      jj_consume_token(LETRAY);
{if ("" != null) return letras.getValy();}
      break;
      }
    case LETRAZ:{
      jj_consume_token(LETRAZ);
{if ("" != null) return letras.getValz();}
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
}

  /** Generated Token Manager. */
  public AdderTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[3];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x60,0x180,0x8e00,};
	}

  /** Constructor with InputStream. */
  public Adder(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Adder(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new AdderTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Adder(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new AdderTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new AdderTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Adder(AdderTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(AdderTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[19];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 3; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 19; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

        }
