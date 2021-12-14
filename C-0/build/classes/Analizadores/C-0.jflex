/*-------- 1ra Area: Codigo de Usuario -------*/
//----> Paquetes, importaciones

package Analizadores;
import java_cup.runtime.Symbol;  
import java.lang.System;
import java.io.*;



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
<YYINITIAL> "(" {  System.out.println("Reconocio " + yytext() + " LPARENT");return new Symbol(sym.LPAREN, yycolumn, yyline, yytext()); }
<YYINITIAL> ")" {  System.out.println("Reconocio " + yytext() + " RPAREN");return new Symbol(sym.RPAREN, yycolumn, yyline, yytext()); }
<YYINITIAL> ";" {  System.out.println("Reconocio " + yytext() + " PTOCOMA");return new Symbol(sym.PTOCOMA, yycolumn, yyline, yytext()); }
<YYINITIAL> "{" {  System.out.println("Reconocio " + yytext() + " LLLAVE");return new Symbol(sym.LLLAVE, yycolumn, yyline, yytext()); }
<YYINITIAL> "}" {  System.out.println("Reconocio " + yytext() + " RLLAVE");return new Symbol(sym.RLLAVE, yycolumn, yyline, yytext()); }

//-------> Aritméticos
<YYINITIAL> "*" {  System.out.println("Reconocio " + yytext() + " PRODUCTO");return new Symbol(sym.PRODUCTO, yycolumn, yyline, yytext()); }
<YYINITIAL> "+" {  System.out.println("Reconocio " + yytext() + " SUMA");return new Symbol(sym.SUMA, yycolumn, yyline, yytext()); }
<YYINITIAL> "/" {  System.out.println("Reconocio " + yytext() + " DIVISION");return new Symbol(sym.DIVISION, yycolumn, yyline, yytext()); }
<YYINITIAL> "-" {  System.out.println("Reconocio " + yytext() + " RESTA");return new Symbol(sym.RESTA, yycolumn, yyline, yytext()); }

//-------> Relacionales
<YYINITIAL> "<" {  System.out.println("Reconocio " + yytext() + " MENOR");return new Symbol(sym.MENOR, yycolumn, yyline, yytext()); }
<YYINITIAL> ">" {  System.out.println("Reconocio " + yytext() + " MAYOR");return new Symbol(sym.MAYOR, yycolumn, yyline, yytext()); }
<YYINITIAL> "==" {  System.out.println("Reconocio " + yytext() + " IGUAL");return new Symbol(sym.IGUAL, yycolumn, yyline, yytext()); }
<YYINITIAL> "¡=" {  System.out.println("Reconocio " + yytext() + " DISTINTO");return new Symbol(sym.DISTINTO, yycolumn, yyline, yytext()); }

//-------> Lógicos
<YYINITIAL> "||" {  System.out.println("Reconocio " + yytext() + " OR");return new Symbol(sym.OR, yycolumn, yyline, yytext()); }
<YYINITIAL> "&&" {  System.out.println("Reconocio " + yytext() + " AND");return new Symbol(sym.AND, yycolumn, yyline, yytext()); }

//-------> Asignación
<YYINITIAL> "=" {   System.out.println("Reconocio " + yytext() + " ASIGNAR"); return new Symbol(sym.ASIGNAR, yycolumn, yyline, yytext()); }

//-------> Constantes
<YYINITIAL> {CadenaTexto} {  System.out.println("Reconocio " + yytext() + " CADENATEXTO"); return new Symbol(sym.CADENATEXTO, yycolumn, yyline, yytext()); }

//-------> Reservadas
<YYINITIAL> main {  System.out.println("Reconocio " + yytext() + " main"); return new Symbol(sym.MAIN, yycolumn, yyline, yytext()); }
<YYINITIAL> if {  System.out.println("Reconocio " + yytext() + " IF");return new Symbol(sym.IF, yycolumn, yyline, yytext()); }
<YYINITIAL> while {  System.out.println("Reconocio " + yytext() + " WHILE");return new Symbol(sym.WHILE, yycolumn, yyline, yytext()); }
<YYINITIAL> else {  System.out.println("Reconocio " + yytext() + " ELSE");return new Symbol(sym.ELSE, yycolumn, yyline, yytext()); }
<YYINITIAL> putw {  System.out.println("Reconocio " + yytext() + " PUTW");return new Symbol(sym.PUTW, yycolumn, yyline, yytext()); }
<YYINITIAL> puts {  System.out.println("Reconocio " + yytext() + " PUTS");return new Symbol(sym.PUTS, yycolumn, yyline, yytext()); }
<YYINITIAL> int {  System.out.println("Reconocio " + yytext() + " INT");return new Symbol(sym.INT, yycolumn, yyline, yytext()); }
<YYINITIAL> break {  System.out.println("Reconocio " + yytext() + " BREAK");return new Symbol(sym.BREAK, yycolumn, yyline, yytext()); }

//-------> Otros
<YYINITIAL> {Identificador} {System.out.println("Reconocio " + yytext() + " ID");return new Symbol(sym.ID, yycolumn, yyline, yytext());}
<YYINITIAL> {Digito}+ { System.out.println("Reconocio " + yytext() + " ENTERO");return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
<YYINITIAL> {EspacioOTerminador}+ { }
<YYINITIAL> [^] {System.err.println("Carácter no permitido: "+yytext()); }
