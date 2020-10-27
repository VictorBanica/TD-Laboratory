
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141204 (SVN rev 60)
//----------------------------------------------------

package cup.example;

/** CUP generated interface containing symbol constants. */
public interface sym {
  /* terminals */
  public static final int MINUS = 4;
  public static final int UMINUS = 5;
  public static final int NUMBER = 9;
  public static final int SEMI = 2;
  public static final int EOF = 0;
  public static final int PLUS = 3;
  public static final int error = 1;
  public static final int RPAREN = 8;
  public static final int TIMES = 6;
  public static final int LPAREN = 7;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "SEMI",
  "PLUS",
  "MINUS",
  "UMINUS",
  "TIMES",
  "LPAREN",
  "RPAREN",
  "NUMBER"
  };
  
  public static final int endTag = 1;
  public static final int bodyOpen = 2;
  public static final int bodyClose = 3;
  public static final int frameOpen = 4;
  public static final int framesetOpen = 5;
  public static final int framesetClose = 6;
  public static final int noframesOpen = 7;
  public static final int noframesClose = 8;
  public static final int formOpen = 9;
  public static final int formClose = 10;
  public static final int input = 11;
  public static final int selectOpen = 12;
  public static final int selectClose = 13;
  public static final int optionOpen = 14;
  public static final int optionClose = 15;
  public static final int tableOpen = 16;
  public static final int tableClose = 17;
  public static final int trOpen = 18;
  public static final int trClose = 19;
  public static final int tdOpen = 20;
  public static final int tdClose = 21;
  public static final int thOpen = 22;
  public static final int thClose = 23;
  public static final int thread = 24;
  public static final int tbody = 25;
  public static final int img = 26;
  public static final int aOpen = 27;
  public static final int aClose = 28;
  public static final int ulOpen = 29;
  public static final int ulClose = 30;
  public static final int liOpen = 31;
  public static final int liClose = 32;
  public static final int olOpen = 33;
  public static final int olClose = 34;
  public static final int pOpen = 35;
  public static final int pClose = 36;
  public static final int iOpen = 37;
  public static final int iClose = 38;
  public static final int uOpen = 39;
  public static final int uClose = 40;
  public static final int smallOpen = 41;
  public static final int smallClose = 42;
  public static final int supOpen = 43;
  public static final int supClose = 44;
  public static final int subOpen = 45;
  public static final int subClose = 46;
  public static final int centerOpen = 47;
  public static final int fontOpen = 48;
  public static final int fontClose = 49;
  public static final int h1Open = 50;
  public static final int h1Close = 51;
  public static final int h2Open = 52;
  public static final int h2Close = 53;
  public static final int h3Open = 54;
  public static final int h3Close = 55;
  public static final int h4Open = 56;
  public static final int h4Close = 57;
  public static final int h5Open = 58;
  public static final int h5Close = 59;
  public static final int h6Open = 60;
  public static final int h6Close = 61;
  public static final int hr = 62;
  public static final int br = 63;
  public static final int bOpen = 64;
  public static final int bClose = 65;
		            

  public static final int cls = 66;
  public static final int dir	= 67;              
  public static final int id	= 68           ;      
  public static final int lang = 69			;
  public static final int onclick = 70;
  public static final int ondblclick=71;               
  public static final int onkeydown  = 72;             
  public static final int onkeypress = 73 ;         
  public static final int onkeyup    = 74  ;        
  public static final int onmousedown = 75  ;        
  public static final int onmousemove  = 76  ;    
  public static final int onmouseout   = 77   ;    
  public static final int onmouseover  = 78    ;   
  public static final int onmouseup    = 79     ;
  public static final int style    = 80     ;
  public static final int title	=81;
  public static final int centerClose = 82;
  
  public static final int alink = 83;
  public static final int background = 84;
  public static final int bgcolor = 85;
  public static final int bgproperties = 86;
  public static final int leftmargin = 87;
  public static final int link = 88;
  public static final int onblur = 89; 
  public static final int onfocus = 90;
  public static final int onunload = 91;
  public static final int text = 92;
  public static final int topmargin = 93;
  public static final int vlink = 94;
  
  public static final int bordercolor = 95;
  public static final int longdesc = 96;
  public static final int marginheight = 97;
  public static final int marginwidth = 98;
  public static final int name = 99;
  public static final int noresize = 100;
  public static final int scrolling = 101;
  public static final int src = 102;
  public static final int border = 103;
  public static final int framespacing = 104;
  public static final int rows = 105;
  
  public static final int acceptcharlist = 106;
  public static final int action = 107;
  public static final int enctype = 108;
  public static final int method = 109;
  public static final int onreset = 110;
  public static final int onsubmit = 111;
  public static final int target = 112;
   
  public static final int disabled = 113;
  public static final int multiple = 114;
  public static final int onchange = 115; 
  public static final int size = 116;
  public static final int tabindex = 117;
  public static final int label  = 118; 
  public static final int selected = 119;
  public static final int value = 120;
  
  public static final int align = 121;
  public static final int bordercolordark = 122;
  public static final int bordercolorlight = 123;
  public static final int cellpadding = 124;
  public static final int cellspacing = 125;
  public static final int cols = 126;
  public static final int frame = 127;
  public static final int height = 128;
  public static final int hspace  = 129;
  public static final int nowrap  = 130;
  public static final int rules = 131;
  public static final int summary = 132;
  public static final int valign = 133;
  public static final int vspace = 134;
  public static final int width = 135;
  
  public static final int chr = 136;
  public static final int abbr = 137;
  public static final int axis = 138;
  public static final int charoff = 139;
  public static final int colspan = 140;
  public static final int headers = 141;
  public static final int rowspan  = 142;
  public static final int scope = 143;
  
  public static final int alt = 144;
  public static final int controls = 145;
  public static final int dynsrc = 146;
  public static final int ismap = 147;
  public static final int loop  = 149;
  public static final int lowsrc = 150;
  public static final int onabort = 151; 
  public static final int onerror = 152;
  public static final int start = 153;
  public static final int usemap = 154;
  
  public static final int accesskey = 156;
  public static final int charset = 157;
  public static final int coords = 158;
  public static final int href = 159;
  public static final int hreflang = 160;
  public static final int rel = 161;
  public static final int rev = 162;
  public static final int shape = 163;
  public static final int type = 164;
  
  public static final int compact = 165;
  public static final int face = 166;
  public static final int color = 167;
  public static final int noshade = 168;
  public static final int clear = 169;
  public static final int onload = 170;
  
  
  
  
}
