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
<YYINITIAL> ";" {  System.out.println("Reconocio " + yytext() + " PTOCOMA");return Token(sym.PTOCOMA); }
<YYINITIAL> "{" {  System.out.println("Reconocio " + yytext() + " LLLAVE");return Token(sym.LLLAVE); }
<YYINITIAL> "}" {  System.out.println("Reconocio " + yytext() + " RLLAVE");return Token(sym.RLLAVE); }

//-------> Aritméticos
<YYINITIAL> "*" {  System.out.println("Reconocio " + yytext() + " PRODUCTO");return Token(sym.PRODUCTO); }
<YYINITIAL> "+" {  System.out.println("Reconocio " + yytext() + " SUMA");return Token(sym.SUMA); }
<YYINITIAL> "/" {  System.out.println("Reconocio " + yytext() + " DIVISION");return Token(sym.DIVISION); }
<YYINITIAL> "-" {  System.out.println("Reconocio " + yytext() + " RESTA");return Token(sym.RESTA); }

//-------> Relacionales
<YYINITIAL> "<" {  System.out.println("Reconocio " + yytext() + " MENOR");return Token(sym.MENOR); }
<YYINITIAL> ">" {  System.out.println("Reconocio " + yytext() + " MAYOR");return Token(sym.MAYOR); }
<YYINITIAL> "==" {  System.out.println("Reconocio " + yytext() + " IGUAL");return Token(sym.IGUAL); }
<YYINITIAL> "¡=" {  System.out.println("Reconocio " + yytext() + " DISTINTO");return Token(sym.DISTINTO); }

//-------> Lógicos
<YYINITIAL> "||" {  System.out.println("Reconocio " + yytext() + " OR");return Token(sym.OR); }
<YYINITIAL> "&&" {  System.out.println("Reconocio " + yytext() + " AND");return Token(sym.AND); }

//-------> Asignación
<YYINITIAL> "=" {   System.out.println("Reconocio " + yytext() + " ASIGNAR"); return Token(sym.ASIGNAR); }

//-------> Constantes
<YYINITIAL> {CadenaTexto} {  System.out.println("Reconocio " + yytext() + " CADENA"); return Token(sym.CADENA); }

//-------> Reservadas
<YYINITIAL> main {  System.out.println("Reconocio " + yytext() + " main"); return Token(sym.MAIN); }
<YYINITIAL> if {  System.out.println("Reconocio " + yytext() + " IF");return Token(sym.IF); }
<YYINITIAL> while {  System.out.println("Reconocio " + yytext() + " WHILE");return Token(sym.WHILE); }
<YYINITIAL> else {  System.out.println("Reconocio " + yytext() + " ELSE");return Token(sym.ELSE); }
<YYINITIAL> putw {  System.out.println("Reconocio " + yytext() + " PUTW");return Token(sym.PUTW); }
<YYINITIAL> puts {  System.out.println("Reconocio " + yytext() + " PUTS");return Token(sym.PUTS); }
<YYINITIAL> int {  System.out.println("Reconocio " + yytext() + " INT");return Token(sym.INT); }
<YYINITIAL> break {  System.out.println("Reconocio " + yytext() + " BREAK");return Token(sym.BREAK); }

//-------> Otros
<YYINITIAL> {Identificador} {System.out.println("Reconocio " + yytext() + " ID");return Token(sym.ID);}
<YYINITIAL> {Digito}+ { System.out.println("Reconocio " + yytext() + " NUMERO");return Token(sym.NUMERO); }
<YYINITIAL> {EspacioOTerminador}+ { }
<YYINITIAL> [^] {System.err.println("Carácter no permitido: "+yytext()); }




