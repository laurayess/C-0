/*-------- 1ra Area: Codigo de Usuario -------*/
//----> Paquetes, importaciones

package Analizadores;
import java_cup.runtime.*;
import java.io.IOException;

/*-------- 2ra Area: Opciones y Declaraciones -------*/
%%
%{
    //--> Codigo de usuario en sintaxis Java
    
%}

//-----> Directivas
%eofval{

    { return Token(sym.EOF); }

%eofval}
%implements java_cup.runtime.Scanner
%type java_cup.runtime.Symbol
%function next_token

%{
  StringBuffer string = new StringBuffer();

  private Symbol Token(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol Token(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

//-------> Expresiones Regulares
EspacioOTerminador=[\ \t\f\r|\n|\r\n]
Digito = [0-9]
Letra = [A-Za-z_]
Alfanumerico = ({Letra}|{Digito})
Identificador = ({Letra})({Alfanumerico})*
CadenaTexto = \"([\x20-\x21\x23-\xFE])*\"

%%
/*-------- 3ra Area: Reglas Lexicas -------*/

//---------------------------> Simbolos

//-------> Delimitadores
<YYINITIAL> "(" {  System.out.println("Reconocio " + yytext() + " LPAREN");return Token(sym.LPAREN); }
<YYINITIAL> ")" {  System.out.println("Reconocio " + yytext() + " RPAREN");return Token(sym.RPAREN); }
<YYINITIAL> ";" {  return Token(sym.PTOCOMA); }
<YYINITIAL> "{" {  System.out.println("Reconocio " + yytext() + " LLLAVE");return Token(sym.LLLAVE); }
<YYINITIAL> "}" {  System.out.println("Reconocio " + yytext() + " RLLAVE");return Token(sym.RLLAVE); }

//-------> Aritméticos
<YYINITIAL> "*" { return Token(sym.PRODUCTO); }
<YYINITIAL> "+" {  return Token(sym.SUMA); }
<YYINITIAL> "/" { return Token(sym.DIVISION); }
<YYINITIAL> "-" {  return Token(sym.RESTA); }

//-------> Relacionales
<YYINITIAL> "<" { return Token(sym.MENOR); }
<YYINITIAL> ">" { return Token(sym.MAYOR); }
<YYINITIAL> "==" { return Token(sym.IGUAL); }
<YYINITIAL> "¡=" { return Token(sym.DISTINTO); }

//-------> Lógicos
<YYINITIAL> "||" { return Token(sym.OR); }
<YYINITIAL> "&&" { return Token(sym.AND); }

//-------> Asignación
<YYINITIAL> "=" {   return Token(sym.ASIGNAR); }

//-------> Constantes
<YYINITIAL> {CadenaTexto} {  return Token(sym.CADENA); }

//-------> Reservadas
<YYINITIAL> main {  System.out.println("Reconocio " + yytext() + " main"); return Token(sym.MAIN); }
<YYINITIAL> if {  return Token(sym.IF); }
<YYINITIAL> while {  return Token(sym.WHILE); }
<YYINITIAL> else {  return Token(sym.ELSE); }
<YYINITIAL> putw {  return Token(sym.PUTW); }
<YYINITIAL> puts {  return Token(sym.PUTS); }
<YYINITIAL> int {  return Token(sym.INT); }
<YYINITIAL> break {  return Token(sym.BREAK); }

//-------> Otros
<YYINITIAL> {Identificador} {return Token(sym.ID);}
<YYINITIAL> {Digito}+ { return Token(sym.NUMERO); }
<YYINITIAL> {EspacioOTerminador}+ { }
<YYINITIAL> [^] {System.err.println("Carácter no permitido: "+yytext()); }




