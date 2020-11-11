package cup.example; 
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory.*;
import java.io.InputStream;
import java_cup.runtime.ComplexSymbolFactory;
%%

%class Lexer
%implements sym
%unicode
%cup
%line
%column

%{

	private ComplexSymbolFactory symbolFactory;
	
    public Lexer(ComplexSymbolFactory factory, InputStream in){
    	this(new java.io.InputStreamReader(in));
    	this.symbolFactory = factory;
    }
   
    StringBuffer string = new StringBuffer();
    
    private Symbol symbol(int code){
         int yylen = yylength();
         Location left = new Location(yyline + 1, yycolumn + 1, yychar);
         Location right = new Location(yyline + 1, yycolumn + yylen, yychar + yylen);
         // Calculate symbol name
         int max_code = sym.terminalNames.length;
         String name = code < max_code ? sym.terminalNames[code] : "<UNKNOWN(" + yytext() + ")>";
         	return this.symbolFactory.newSymbol(name, code, left, right);
        //new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int code, Object value){
         // Calculate symbol location
    	 int yylen = yylength();
         Location left = new Location(yyline + 1, yycolumn + 1, yychar);
         Location right = new Location(yyline + 1, yycolumn + yylen, yychar + yylen);
         // Calculate symbol name
         int max_code = sym.terminalNames.length;
         String name = code < max_code ? sym.terminalNames[code] : "<UNKNOWN(" + yytext() + ")>";
        	 return this.symbolFactory.newSymbol(name, code, left, right, value);
        //new Symbol(type, yyline, yycolumn, value);
    }
%}


%eofval{

return symbol(sym.EOF);
%eofval}


Comment = "<!--" [^*] ~"-->" 
   
%%

    <YYINITIAL> {

      /* HTML Tags */
      ">"                         { return symbol(sym.endTag); }
      "<body"                     { return symbol(sym.bodyOpen); }
      "</body>"			              { return symbol(sym.bodyClose); }
      "<frame"			              { return symbol(sym.frameOpen); }
      "<frameset"		              { return symbol(sym.framesetOpen); }
      "</frameset>"		            { return symbol(sym.framesetClose); }
      "<noframes"		              { return symbol(sym.noframesOpen); }
      "</noframes>"		            { return symbol(sym.noframesClose); }
      "<form"			                { return symbol(sym.formOpen); }
      "</form>"			              { return symbol(sym.formClose); }
      "<input"			              { return symbol(sym.input); }
      "<select"			              { return symbol(sym.selectOpen); }
      "</select>"		              { return symbol(sym.selectClose); }
      "<option"			              { return symbol(sym.optionOpen); }
      "</option>"		              { return symbol(sym.optionClose); }
      "<table"		  	            { return symbol(sym.tableOpen); }
      "</table>"			              { return symbol(sym.tableClose); }
      "<tr"			                  { return symbol(sym.trOpen); }
      "</tr>"			                { return symbol(sym.trClose); }
      "<td"			                  { return symbol(sym.tdOpen); }
      "</td>"			                { return symbol(sym.tdClose); }
      "<th"			                  { return symbol(sym.thOpen); }
      "</th>"			                { return symbol(sym.thClose); }
      "<thead"			              { return symbol(sym.thead); }
      "<tbody"			              { return symbol(sym.tbody); }
      "<img"			                { return symbol(sym.img); }
      "<a"			                  { return symbol(sym.aOpen); }
      "</a>"			                  { return symbol(sym.aClose); }
      "<ul"			                  { return symbol(sym.ulOpen); }
      "</ul>"			                { return symbol(sym.ulClose); }
      "<li"			                  { return symbol(sym.liOpen); }
      "</li>"			                { return symbol(sym.liClose); }
      "<ol"			                  { return symbol(sym.olOpen); }
      "</ol>"			                { return symbol(sym.olClose); }
      "<p"			                  { return symbol(sym.pOpen); }
      "</p>"			                { return symbol(sym.pClose); }
      "<i"			                  { return symbol(sym.iOpen); }
      "</i>"			                  { return symbol(sym.iClose); }
      "<u"			                  { return symbol(sym.uOpen); }
      "</u>"			                  { return symbol(sym.uClose); }
      "<b"			                  { return symbol(sym.bOpen); }
      "</b>"			                  { return symbol(sym.bClose); }
      "<small"			              { return symbol(sym.smallOpen); }
      "</small>"			              { return symbol(sym.smallClose); }
      "<sup"			                { return symbol(sym.supOpen); }
      "</sup>"			                { return symbol(sym.supClose); }
      "<sub"			                { return symbol(sym.subOpen); }
      "</sub>"			                { return symbol(sym.subClose); }
      "<center"			              { return symbol(sym.centerOpen); }
      "</center>"			              { return symbol(sym.centerClose); }
      "<font"			                { return symbol(sym.fontOpen); }
      "</font>"			              { return symbol(sym.fontClose); }
      "<h1"			                  { return symbol(sym.h1Open); }
      "</h1>"			                { return symbol(sym.h1Close); }
      "<h2"			                  { return symbol(sym.h2Open); }
      "</h2>"			                { return symbol(sym.h2Close); }
      "<h3"			                  { return symbol(sym.h3Open); }
      "</h3>"			                { return symbol(sym.h3Close); }
      "<h4"			                  { return symbol(sym.h4Open); }
      "</h4>"			                { return symbol(sym.h4Close); }
      "<h5"			                  { return symbol(sym.h5Open); }
      "</h5>"			                { return symbol(sym.h5Close); }
      "<h6"			                  { return symbol(sym.h6Open); }
      "</h6>"			                { return symbol(sym.h6Close); }
      "<hr"			                  { return symbol(sym.hr); }
      "<br"			                  { return symbol(sym.br); }
      "<html"			                  { return symbol(sym.htmlOpen); }
      "</html>"			                  { return symbol(sym.htmlClose); }
      "<<EOF>>"                            { return symbol(sym.EOF); }	
      
    }
    
    