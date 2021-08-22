grammar Sophia;

sophia : (classes)(main_class)(classes) EOF;

main_class: CLS MAIN {System.out.println("ClassDec:Main"); } main_class_scope;

classes : (CLS{System.out.print("ClassDec:"+getCurrentToken().getText()); } ID
                    (EXT{System.out.print("," + getCurrentToken().getText());} ID)? {System.out.println();} class_scope)(classes) | ;

constructor : DEF{System.out.println("ConstructorDec:"+getCurrentToken().getText());} ID LPAR func_input_vars RPAR func_scope | ;

main_constructor : DEF MAIN {System.out.println("ConstructorDec:Main");} LPAR RPAR func_scope;

main_class_scope : LBRC (declarations)(main_constructor)(declarations) RBRC;

class_scope : LBRC (declarations)(constructor)(declarations) RBRC;

declarations : (func_declare | var_declare_statement)(declarations) | ;

func_declare : DEF func_ret_type {System.out.println("MethodDec:"+getCurrentToken().getText());} ID LPAR func_input_vars RPAR func_scope;

func_input_vars : var_declare (COMM func_input_vars) | var_declare | ;

func_ret_type : VOID | var_types;

func_scope: LBRC (some_declarations)(some_statements) RBRC | LBRC RBRC;

simple_scope : LBRC some_statements RBRC | LBRC RBRC;

some_declarations : (var_declare_statement)(some_declarations) | ;

some_statements: (statement)(some_statements) | statement;

statement: single_statement | if_statement | for_statement | foreachStatement | simple_scope ;

single_statement: (oneLine_statement | assign_statement | func_call{System.out.println("MethodCall");}) ENDOFLINE;

func_call: var LPAR func_args RPAR;

func_args: expr (COMM func_args) | expr | ;

assign_statement: var ASSIGN multiple_assign_statement{System.out.println("Operator:=");};

multiple_assign_statement: var ASSIGN multiple_assign_statement{System.out.println("Operator:=");} | expr;

foreachStatement: FORE{System.out.println("Loop:foreach");} LPAR (var IN expr ) RPAR (single_statement | simple_scope);

for_statement: FOR{System.out.println("Loop:for");} LPAR (assign_statement | )  ENDOFLINE (bool_expr | ) ENDOFLINE (assign_statement | ) RPAR (single_statement | simple_scope);

oneLine_statement: BRK{System.out.println("Control:break");} | CONT{System.out.println("Control:continue");}
                        | {System.out.println("Return");}RET expr | PRI{System.out.println("Built-in:print");} LPAR expr RPAR;

if_statement: open_if_statement | close_if_statement;

open_if_statement: IF{System.out.println("Conditional:if");} LPAR (bool_expr) RPAR (if_statement | close_if_statement ELSE{System.out.println("Conditional:else");} open_if_statement);

close_if_statement: non_if_statement | IF{System.out.println("Conditional:if");} LPAR (bool_expr) RPAR close_if_statement ELSE{System.out.println("Conditional:else");} close_if_statement;

non_if_statement:single_statement | simple_scope;

expr: PLUSPLUS var{System.out.println("Operator:++");} | MINMIN var{System.out.println("Operator:--");}
                        | var PLUSPLUS{System.out.println("Operator:++");} | var MINMIN{System.out.println("Operator:--");} | bool_expr;

bool_expr: and_expr OROP bool_expr{System.out.println("Operator:||");} | and_expr;

and_expr: unary_rel_expr ANDOP and_expr{System.out.println("Operator:&&");} | unary_rel_expr;

unary_rel_expr: UNARYLOGIC unary_rel_expr{System.out.println("Operator:!");} | rel_expr;

rel_expr: sum_expr COMPOP sum_expr{System.out.println("Operator:"+$COMPOP.text+"");} | sum_expr;

sum_expr: mul_expr (SUMOP mul_expr{System.out.println("Operator:"+$SUMOP.text+"");})* | mul_expr;

mul_expr: unary_expr (MULTOP unary_expr{System.out.println("Operator:"+$MULTOP.text+"");})* | unary_expr;

unary_expr: SUMOP unary_expr{System.out.println("Operator:-");} | single_unit;

single_unit: var | func_call | TRUE | FALSE | STRING | NUM | LBRA func_args RBRA | LPAR expr RPAR | NEW ID LPAR func_args RPAR;

var_types : INT | STR | BOOL | ID | FUNC GT (VOID | some_types) FUNCSIG (func_ret_type) LST | list_type;

list_type: LIST LPAR ((NUM COUPLE var_types) | some_types | func_input_vars) RPAR ;

some_types: (var_types COMM some_types) | var_types | ;

var_declare_statement: {System.out.println("VarDec:"+getCurrentToken().getText());}var_declare ENDOFLINE;

var_declare : ID DEFINIT var_types;

var : (THIS DOT)? variable;

variable: ID(LBRA expr RBRA | LPAR func_args RPAR)* DOT variable | ID(LBRA expr RBRA | LPAR func_args RPAR)*;

MAIN: 'Main';
MINMIN: '--';
PLUSPLUS: '++';
OROP: '||';
ANDOP: '&&';
UNARYLOGIC : '!';
SUMOP: '+' | '-';
COMPOP: '==' | '!=' | GT | LST;
MULTOP: '*' | '/' | '%';
CLS: 'class';
IF: 'if';
FALSE: 'false';
LIST: 'list';
EXT: 'extends';
ELSE: 'else';
TRUE: 'true';
IN: 'in';
THIS: 'this';
FOR: 'for';
INT: 'int';
NULL: 'null';
DEF: 'def';
FORE: 'foreach';
BOOL: 'bool';
NEW: 'new';
FUNC: 'func';
CONT: 'continue';
STR: 'string';
PRI: 'print';
RET: 'return';
BRK: 'break';
VOID: 'void';

ENDOFLINE: ';';
DEFINIT: ':';
COMM: ',';
ASSIGN: '=';
DOT: '.';
LBRC: '{';
RBRC: '}';
LBRA: '[';
RBRA: ']';
LPAR: '(';
RPAR: ')';
COUPLE: '#';
FUNCSIG: '->';
LST: '>';
GT: '<';

ID: (UPLETTER | LOWLETTER | UNDERSCORE)+(UPLETTER | LOWLETTER | UNDERSCORE | DIGIT)*;
NUM : POSNUM | ZERO;
POSNUM : (NOZERODIGIT)(DIGIT)*;
STRING:'"' ~('"')+ '"';
DIGIT: ('0'..'9') ;
NOZERODIGIT: ('1'..'9');
COMMENT: '//' ~('\r'|'\n')* -> skip;
UPLETTER: ('a'..'z') ;
LOWLETTER: ('A'..'Z') ;
UNDERSCORE: '_';
ZERO : '0';
NXTLINE: [\n\r]+ -> skip ;
WS: [ \t]+ -> skip;
