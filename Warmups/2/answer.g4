lexer grammar answer;

IDENTIFIER : [A-Za-z_][A-Za-z_0-9]* {System.out.println("IDENTIFIER = " + getText() + " ");};

NUM : ([0] | [1-9][0-9]*) {System.out.println("NUM = " + getText() + " ");};

STR : '"' ~('"')+ '"' {System.out.println("STR = " + getText() + " ");};

COMMENT : '//' ~('\n')+ ('\n' | EOF) {System.out.println("COMMENT = " + getText() + " ");};

MLCOMMENT : '/*' .*? '*/' {System.out.println("MLCOMMENT = " + getText() + " ");};