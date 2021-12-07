// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: C-0.jflex

/*-------- 1ra Area: Codigo de Usuario -------*/
//----> Paquetes, importaciones

package Analizadores;
import java_cup.runtime.*;
import java.io.IOException;

/*-------- 2ra Area: Opciones y Declaraciones -------*/

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\2\1\1\0\2\1\22\0\1\2\1\3\1\4"+
    "\3\3\1\5\1\3\1\6\1\7\1\10\1\11\1\3"+
    "\1\12\1\3\1\13\12\14\1\3\1\15\1\16\1\17"+
    "\1\20\2\3\32\21\4\3\1\21\1\3\1\22\1\23"+
    "\2\21\1\24\1\25\1\21\1\26\1\27\1\21\1\30"+
    "\1\31\1\32\1\33\1\21\1\34\1\21\1\35\1\36"+
    "\1\37\1\40\1\21\1\41\3\21\1\42\1\43\1\44"+
    "\43\3\1\45\40\3\1\46\74\3\u0101\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\7\16"+
    "\1\17\1\2\1\20\1\1\1\0\1\21\1\22\1\23"+
    "\2\16\1\24\4\16\1\25\1\0\2\16\1\26\3\16"+
    "\1\27\1\16\1\30\1\31\1\32\1\33\1\16\1\34"+
    "\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[55];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\165\0\234\0\47\0\47\0\47"+
    "\0\47\0\47\0\47\0\303\0\47\0\47\0\352\0\47"+
    "\0\u0111\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4\0\u01fb\0\47"+
    "\0\u0222\0\47\0\u0249\0\165\0\47\0\47\0\47\0\u0270"+
    "\0\u0297\0\u0111\0\u02be\0\u02e5\0\u030c\0\u0333\0\116\0\u035a"+
    "\0\u0381\0\u03a8\0\u0111\0\u03cf\0\u03f6\0\u041d\0\47\0\u0444"+
    "\0\u0111\0\u0111\0\u0111\0\u0111\0\u046b\0\u0111\0\u0111";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[55];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\2\21\1\22\1\23\2\21\1\24\2\21\1\25\1\21"+
    "\1\26\4\21\1\27\1\30\1\31\1\32\1\2\1\33"+
    "\50\0\2\3\40\0\1\3\5\0\2\34\1\35\42\34"+
    "\5\0\1\36\55\0\1\14\51\0\1\37\43\0\1\21"+
    "\4\0\21\21\21\0\1\21\4\0\14\21\1\40\4\21"+
    "\21\0\1\21\4\0\10\21\1\41\10\21\21\0\1\21"+
    "\4\0\4\21\1\42\5\21\1\43\6\21\21\0\1\21"+
    "\4\0\1\21\1\44\17\21\21\0\1\21\4\0\17\21"+
    "\1\45\1\21\21\0\1\21\4\0\5\21\1\46\13\21"+
    "\6\0\2\3\40\0\1\47\50\0\1\50\15\0\1\21"+
    "\4\0\3\21\1\51\15\21\21\0\1\21\4\0\15\21"+
    "\1\52\3\21\21\0\1\21\4\0\16\21\1\53\2\21"+
    "\21\0\1\21\4\0\6\21\1\54\12\21\21\0\1\21"+
    "\4\0\16\21\1\55\2\21\21\0\1\21\4\0\6\21"+
    "\1\56\12\21\24\0\1\57\43\0\1\21\4\0\1\21"+
    "\1\60\17\21\21\0\1\21\4\0\3\21\1\61\15\21"+
    "\21\0\1\21\4\0\12\21\1\62\6\21\21\0\1\21"+
    "\4\0\15\21\1\63\2\21\1\64\21\0\1\21\4\0"+
    "\10\21\1\65\10\21\21\0\1\21\4\0\7\21\1\66"+
    "\11\21\21\0\1\21\4\0\3\21\1\67\15\21\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1170];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\6\11\1\1\2\11\1\1\1\11"+
    "\7\1\1\11\1\1\1\11\1\1\1\0\3\11\10\1"+
    "\1\0\6\1\1\11\10\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[55];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    //--> Codigo de usuario en sintaxis Java
    
  StringBuffer string = new StringBuffer();

  private Symbol Token(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol Token(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          { 
    { return Token(sym.EOF); }

 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.err.println("Carácter no permitido: "+yytext());
            }
            // fall through
          case 30: break;
          case 2:
            { 
            }
            // fall through
          case 31: break;
          case 3:
            { System.out.println("Reconocio " + yytext() + " LPARENT");return Token(sym.LPAREN);
            }
            // fall through
          case 32: break;
          case 4:
            { System.out.println("Reconocio " + yytext() + " RPAREN");return Token(sym.RPAREN);
            }
            // fall through
          case 33: break;
          case 5:
            { System.out.println("Reconocio " + yytext() + " PRODUCTO");return Token(sym.PRODUCTO);
            }
            // fall through
          case 34: break;
          case 6:
            { System.out.println("Reconocio " + yytext() + " SUMA");return Token(sym.SUMA);
            }
            // fall through
          case 35: break;
          case 7:
            { System.out.println("Reconocio " + yytext() + " RESTA");return Token(sym.RESTA);
            }
            // fall through
          case 36: break;
          case 8:
            { System.out.println("Reconocio " + yytext() + " DIVISION");return Token(sym.DIVISION);
            }
            // fall through
          case 37: break;
          case 9:
            { System.out.println("Reconocio " + yytext() + " ENTERO");return Token(sym.ENTERO);
            }
            // fall through
          case 38: break;
          case 10:
            { System.out.println("Reconocio " + yytext() + " PTOCOMA");return Token(sym.PTOCOMA);
            }
            // fall through
          case 39: break;
          case 11:
            { System.out.println("Reconocio " + yytext() + " MENOR");return Token(sym.MENOR);
            }
            // fall through
          case 40: break;
          case 12:
            { System.out.println("Reconocio " + yytext() + " ASIGNAR"); return Token(sym.ASIGNAR);
            }
            // fall through
          case 41: break;
          case 13:
            { System.out.println("Reconocio " + yytext() + " MAYOR");return Token(sym.MAYOR);
            }
            // fall through
          case 42: break;
          case 14:
            { System.out.println("Reconocio " + yytext() + " ID");return Token(sym.ID);
            }
            // fall through
          case 43: break;
          case 15:
            { System.out.println("Reconocio " + yytext() + " LLLAVE");return Token(sym.LLLAVE);
            }
            // fall through
          case 44: break;
          case 16:
            { System.out.println("Reconocio " + yytext() + " RLLAVE");return Token(sym.RLLAVE);
            }
            // fall through
          case 45: break;
          case 17:
            { System.out.println("Reconocio " + yytext() + " CADENATEXTO"); return Token(sym.CADENATEXTO);
            }
            // fall through
          case 46: break;
          case 18:
            { System.out.println("Reconocio " + yytext() + " AND");return Token(sym.AND);
            }
            // fall through
          case 47: break;
          case 19:
            { System.out.println("Reconocio " + yytext() + " IGUAL");return Token(sym.IGUAL);
            }
            // fall through
          case 48: break;
          case 20:
            { System.out.println("Reconocio " + yytext() + " IF");return Token(sym.IF);
            }
            // fall through
          case 49: break;
          case 21:
            { System.out.println("Reconocio " + yytext() + " OR");return Token(sym.OR);
            }
            // fall through
          case 50: break;
          case 22:
            { System.out.println("Reconocio " + yytext() + " INT");return Token(sym.INT);
            }
            // fall through
          case 51: break;
          case 23:
            { System.out.println("Reconocio " + yytext() + " DISTINTO");return Token(sym.DISTINTO);
            }
            // fall through
          case 52: break;
          case 24:
            { System.out.println("Reconocio " + yytext() + " ELSE");return Token(sym.ELSE);
            }
            // fall through
          case 53: break;
          case 25:
            { System.out.println("Reconocio " + yytext() + " main"); return Token(sym.MAIN);
            }
            // fall through
          case 54: break;
          case 26:
            { System.out.println("Reconocio " + yytext() + " PUTS");return Token(sym.PUTS);
            }
            // fall through
          case 55: break;
          case 27:
            { System.out.println("Reconocio " + yytext() + " PUTW");return Token(sym.PUTW);
            }
            // fall through
          case 56: break;
          case 28:
            { System.out.println("Reconocio " + yytext() + " BREAK");return Token(sym.BREAK);
            }
            // fall through
          case 57: break;
          case 29:
            { System.out.println("Reconocio " + yytext() + " WHILE");return Token(sym.WHILE);
            }
            // fall through
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
