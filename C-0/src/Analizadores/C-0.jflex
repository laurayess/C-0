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
%line
%column
%char

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
<YYINITIAL> "(" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "LPAREN", yyline, yycolumn);
                   InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                   return new Symbol(sym.LPAREN, yycolumn, yyline, yytext());}

<YYINITIAL> ")" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "RPAREN", yyline, yycolumn);
                   InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                   return new Symbol(sym.RPAREN, yycolumn, yyline, yytext()); }

<YYINITIAL> ";" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "PTOCOMA", yyline, yycolumn);
                   InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                   return new Symbol(sym.PTOCOMA, yycolumn, yyline, yytext()); }

<YYINITIAL> "{" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "LLLAVE", yyline, yycolumn);
                   InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                   return new Symbol(sym.LLLAVE, yycolumn, yyline, yytext()); }

<YYINITIAL> "}" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "RLLAVE", yyline, yycolumn);
                   InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                   return new Symbol(sym.RLLAVE, yycolumn, yyline, yytext()); }

//-------> Aritméticos
<YYINITIAL> "*" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "PRODUCTO", yyline, yycolumn);
                   InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                   return new Symbol(sym.PRODUCTO, yycolumn, yyline, yytext()); }

<YYINITIAL> "+" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "SUMA", yyline, yycolumn);
                   InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                   return new Symbol(sym.SUMA, yycolumn, yyline, yytext()); }

<YYINITIAL> "/" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "DIVISION", yyline, yycolumn);
                   InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                   return new Symbol(sym.DIVISION, yycolumn, yyline, yytext()); }

<YYINITIAL> "-" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "RESTA", yyline, yycolumn);
                   InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                   return new Symbol(sym.RESTA, yycolumn, yyline, yytext()); }

//-------> Relacionales
<YYINITIAL> "<" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "MENOR", yyline, yycolumn);
                   InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                   return new Symbol(sym.MENOR, yycolumn, yyline, yytext()); }

<YYINITIAL> ">" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "MAYOR", yyline, yycolumn);
                   InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                   return new Symbol(sym.MAYOR, yycolumn, yyline, yytext()); }

<YYINITIAL> "==" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "IGUAL", yyline, yycolumn);
                    InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                    return new Symbol(sym.IGUAL, yycolumn, yyline, yytext()); }

<YYINITIAL> "¡=" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "DISTINTO", yyline, yycolumn);
                    InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                    return new Symbol(sym.DISTINTO, yycolumn, yyline, yytext()); }

//-------> Lógicos
<YYINITIAL> "||" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "OR", yyline, yycolumn);
                    InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                    return new Symbol(sym.OR, yycolumn, yyline, yytext()); }

<YYINITIAL> "&&" {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "AND", yyline, yycolumn);
                    InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                    return new Symbol(sym.AND, yycolumn, yyline, yytext()); }

//-------> Asignación
<YYINITIAL> "=" {   System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "ASIGNAR", yyline, yycolumn);
                    InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                    return new Symbol(sym.ASIGNAR, yycolumn, yyline, yytext()); }

//-------> Constantes
<YYINITIAL> {CadenaTexto} {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "CADENATEXTO", yyline, yycolumn);
                             InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                             return new Symbol(sym.CADENATEXTO, yycolumn, yyline, yytext()); }

//-------> Reservadas
<YYINITIAL> main {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "MAIN", yyline, yycolumn);
                    InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                    return new Symbol(sym.MAIN, yycolumn, yyline, yytext()); }

<YYINITIAL> if   {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "IF", yyline, yycolumn);
                    InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                    return new Symbol(sym.IF, yycolumn, yyline, yytext()); }

<YYINITIAL> while {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "WHILE", yyline, yycolumn);
                     InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                     return new Symbol(sym.WHILE, yycolumn, yyline, yytext()); }

<YYINITIAL> else {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "ELSE", yyline, yycolumn);
                    InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                    return new Symbol(sym.ELSE, yycolumn, yyline, yytext()); }

<YYINITIAL> putw {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "PUTW", yyline, yycolumn);
                    InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                    return new Symbol(sym.PUTW, yycolumn, yyline, yytext()); }

<YYINITIAL> puts {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "PUTS", yyline, yycolumn);
                    InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                    return new Symbol(sym.PUTS, yycolumn, yyline, yytext()); }

<YYINITIAL> int  {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "INT", yyline, yycolumn);
                    InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                    return new Symbol(sym.INT, yycolumn, yyline, yytext()); }

<YYINITIAL> break {  System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "BREAK", yyline, yycolumn);
                     InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                     return new Symbol(sym.BREAK, yycolumn, yyline, yytext()); }

//-------> Otros
<YYINITIAL> {Identificador} {System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "ID", yyline, yycolumn);
                             InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                             return new Symbol(sym.ID, yycolumn, yyline, yytext());}

<YYINITIAL> {Digito}+ { System.out.printf("Encontró Token: %-8s Linea:%-3d Columna:%-3d\n", "ENTERO", yyline, yycolumn);
                        InformacionCodigo.guardarInformacionCodigo(yyline,yytext());
                        return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }

<YYINITIAL> {EspacioOTerminador}+ { }
<YYINITIAL> [^] {System.err.println("Carácter no permitido: "+yytext()); }
