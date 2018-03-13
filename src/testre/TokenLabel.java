/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testre;

import java.util.ArrayList;

/**
 *
 * @author anaconda
 */
 class TokenLabel {
    
    private String token;
    private String label;

    @Override
  public   String toString() {
        return "<"+label+"> : "+token;
    }
    
     TokenLabel(String label , String token){
        this.token = token;
        this.label = label;
    }
    
     String getLabel(){
        return label;
    }
     String getToken(){
        return token;
    }
    
    
    
     static ArrayList<TokenLabel> initializeTokensArray(){
        ArrayList<TokenLabel> tokenLabels = new ArrayList<>();
        
        ///////////////////////
     String EOF = "\n" 
     , IF = "\\bif\\b"
     , ELSE = "\\belse\\b"
     , WHILE = "\\bwhile\\b"
     , MAIN = "\\bmain\\b"
     , VOID = "\\bvoid\\b"
     , THIS = "\\bthis\\b"
     , CLASS = "\\bclass\\b"
     , PUBLIC = "\\bpublic\\b"
     , RETURN = "\\breturn\\b"
     , STATIC = "\\bstatic\\b"
     , NEW = "\\bnew\\b"
    
     , TRUE = "\\btrue\\b"
     , FALSE = "\\bfalse\\b"
    
     , LENGTH = "\\blength\\b"
    
     , EXTENDS = "\\bextends\\b"
     , SYSTEM_OUT_PRINTLN = "\\bSystem\\.out\\.println\\b"
     , INTEGRAL_LITERAL = "\\b(-?)\\d+\\b"
     , FLOAT_LITERAL = "\\b\\d+\\.\\d+\\b"
     , STRING_LITERAL = "\"\\w+\""
     , ID = "\\b[a-zA-Z]\\w*\\b"
    
     , SQUOTE = "\'"
     , DQUOTE = "\""
     , COMMA = ","
     , SEMICOLON = ";"
     , DOT = "\\."
    
     , A_CHAR = "\'\\w\'"
    
     , STRING = "\\bstring\\b"
     , FLOAT = "\\bfloat\\b"
     , CHARACTER = "\\bchar\\b"
     , BOOLEAN = "\\bboolean\\b"
     , INT = "\\bint\\b"
    
    
     , COMMENT1 = "\\/\\/.*"
     , COMMENT2 = "\\/\\*.*\\*\\/"
     , COMMENT_L = "\\/\\*"
     , COMMENT_R = "\\*\\/"
    
     , PLUS = "\\+"
     , MINUS = "\\-"
     , MULTIPLY = "\\*"
     , EQUAL = "\\="
     , DIVITION = "\\/"
    
     , LEFT_CURLY_B = "\\{"
     , RIGHT_CURLY_B = "\\}"
     , LEFT_SQUARE_B = "\\["
     , RIGHT_SQUARE_B = "\\]"
     , LEFT_ROUND_B = "\\("
     , RIGHT_ROUND_B = "\\)"
     , LESSTHAN = ">"
     , GREATERTHAN = "<"
    
     , NOT = "!"
     , AND = "&&"
     , OR = "\\|\\|";
    
    //==========================================================================
     String EOF_LABEL = "EOF"
    
     , IF_LABEL = "IF"
     , ELSE_LABEL = "ELSE"
     , WHILE_LABEL = "WHILE"
    
     , MAIN_LABEL = "MAIN"
     , VOID_LABEL = "VOID"
     , THIS_LABEL = "THIS"
     , CLASS_LABEL = "CLASS"
     , PUBLIC_LABEL = "PUBLIC "
     , RETURN_LABEL = "RETURN"
     , STATIC_LABEL = "STATIC"
     , NEW_LABEL = "NEW"
    
     , TRUE_LABEL = "TRUE"
     , FALSE_LABEL = "FALSE"
    
     , LENGTH_LABEL = "LENGTH"
    
     , EXTENDS_LABEL = "EXTENDS"
     , SYSTEM_OUT_PRINTLN_LABEL = "SYSTEM_OUT_PRINTLN"
     , INTEGRAL_LITERAL_LABEL = "INTEGRAL_LITERAL"
     , FLOAT_LITERAL_LABEL = "FLOAT_LITERAL"
     , STRING_LITERAL_LABEL = "STRING_LITERAL"
     , ID_LABEL = "ID"
    
     , SQUOTE_LABEL = "SQUOTE"
     , DQUOTE_LABEL = "DQUOTE"
     , COMMA_LABEL = "COMMA"
     , SEMICOLON_LABEL = "SEMICOLON"
     , DOT_LABEL = "DOT"
    
     , A_CHAR_LABEL = "A_CHAR"
    
     , STRING_LABEL = "STRING"
     , FLOAT_LABEL = "FLOAT"
     , CHARACTER_LABEL = "CHARACTER"
     , BOOLEAN_LABEL = "BOOLEAN"
     , INT_LABEL = "INT"
    
    
     , COMMENT1_LABEL = "COMMENT1"
     , COMMENT2_LABEL = "COMMENT2"
     , COMMENT_L_LABEL = "unknown token"
     , COMMENT_R_LABEL = "unknown token"
    
     , PLUS_LABEL = "PLUS"
     , MINUS_LABEL = "MINUS"
     , MULTIPLY_LABEL = "MULTIPLY"
     , EQUAL_LABEL = "EQUAL"
     , DIVITION_LABEL = "DIVITION"
    
     , LEFT_CURLY_B_LABEL = "LEFT_CURLY_B"
     , RIGHT_CURLY_B_LABEL = "RIGHT_CURLY_B"
     , LEFT_SQUARE_B_LABEL = "LEFT_SQUARE_B"
     , RIGHT_SQUARE_B_LABEL = "RIGHT_SQUARE_B"
     , LEFT_ROUND_B_LABEL = "LEFT_ROUND_B"
     , RIGHT_ROUND_B_LABEL = "RIGHT_ROUND_B"
     , LESSTHAN_LABEL = "LESSTHAN"
     , GREATERTHAN_LABEL = "GREATERTHAN"
    
     , NOT_LABEL = "NOT"
     , AND_LABEL = "AND"
     , OR_LABEL = "OR";
        /////////////////////
        
        tokenLabels.add(new TokenLabel(IF_LABEL , IF));
        tokenLabels.add(new TokenLabel(ELSE_LABEL , ELSE));
        tokenLabels.add(new TokenLabel(WHILE_LABEL , WHILE));
        tokenLabels.add(new TokenLabel(MAIN_LABEL , MAIN));
        tokenLabels.add(new TokenLabel(VOID_LABEL , VOID));
        tokenLabels.add(new TokenLabel(THIS_LABEL , THIS));
        tokenLabels.add(new TokenLabel(CLASS_LABEL , CLASS));
        tokenLabels.add(new TokenLabel(PUBLIC_LABEL , PUBLIC));
        tokenLabels.add(new TokenLabel(RETURN_LABEL , RETURN));
        tokenLabels.add(new TokenLabel(STATIC_LABEL , STATIC));
        tokenLabels.add(new TokenLabel(NEW_LABEL , NEW));
        tokenLabels.add(new TokenLabel(TRUE_LABEL , TRUE));
        tokenLabels.add(new TokenLabel(FALSE_LABEL , FALSE));
        tokenLabels.add(new TokenLabel(LENGTH_LABEL , LENGTH));
        tokenLabels.add(new TokenLabel(EXTENDS_LABEL , EXTENDS));
        tokenLabels.add(new TokenLabel(SYSTEM_OUT_PRINTLN_LABEL , SYSTEM_OUT_PRINTLN));
        tokenLabels.add(new TokenLabel(FLOAT_LITERAL_LABEL , FLOAT_LITERAL));
        tokenLabels.add(new TokenLabel(INTEGRAL_LITERAL_LABEL , INTEGRAL_LITERAL));
        tokenLabels.add(new TokenLabel(STRING_LITERAL_LABEL , STRING_LITERAL));
        tokenLabels.add(new TokenLabel(SQUOTE_LABEL , SQUOTE));
        tokenLabels.add(new TokenLabel(DQUOTE_LABEL , DQUOTE));
        
        tokenLabels.add(new TokenLabel(COMMA_LABEL , COMMA));
        tokenLabels.add(new TokenLabel(SEMICOLON_LABEL , SEMICOLON));
        tokenLabels.add(new TokenLabel(DOT_LABEL , DOT));
        tokenLabels.add(new TokenLabel(A_CHAR_LABEL , A_CHAR));
        tokenLabels.add(new TokenLabel(STRING_LABEL , STRING));
        tokenLabels.add(new TokenLabel(FLOAT_LABEL , FLOAT));
        tokenLabels.add(new TokenLabel(CHARACTER_LABEL , CHARACTER));
        tokenLabels.add(new TokenLabel(BOOLEAN_LABEL , BOOLEAN));
        tokenLabels.add(new TokenLabel(INT_LABEL , INT));
        tokenLabels.add(new TokenLabel(COMMENT1_LABEL , COMMENT1));
        tokenLabels.add(new TokenLabel(COMMENT2_LABEL , COMMENT2));
        tokenLabels.add(new TokenLabel(COMMENT_L_LABEL , COMMENT_L));
        tokenLabels.add(new TokenLabel(COMMENT_R_LABEL , COMMENT_R));
        tokenLabels.add(new TokenLabel(PLUS_LABEL , PLUS));
        tokenLabels.add(new TokenLabel(MINUS_LABEL , MINUS));
        tokenLabels.add(new TokenLabel(MULTIPLY_LABEL , MULTIPLY));
        tokenLabels.add(new TokenLabel(EQUAL_LABEL , EQUAL));
        tokenLabels.add(new TokenLabel(DIVITION_LABEL , DIVITION));
        tokenLabels.add(new TokenLabel(LEFT_CURLY_B_LABEL , LEFT_CURLY_B));
        tokenLabels.add(new TokenLabel(RIGHT_CURLY_B_LABEL , RIGHT_CURLY_B));
        tokenLabels.add(new TokenLabel(LEFT_SQUARE_B_LABEL , LEFT_SQUARE_B));
        tokenLabels.add(new TokenLabel(RIGHT_SQUARE_B_LABEL , RIGHT_SQUARE_B));
        tokenLabels.add(new TokenLabel(LEFT_ROUND_B_LABEL , LEFT_ROUND_B));
        tokenLabels.add(new TokenLabel(RIGHT_ROUND_B_LABEL , RIGHT_ROUND_B));
        tokenLabels.add(new TokenLabel(LESSTHAN_LABEL , LESSTHAN));
        tokenLabels.add(new TokenLabel(GREATERTHAN_LABEL , GREATERTHAN));
        tokenLabels.add(new TokenLabel(NOT_LABEL , NOT));
        tokenLabels.add(new TokenLabel(AND_LABEL , AND));
        tokenLabels.add(new TokenLabel(OR_LABEL , OR));
        tokenLabels.add(new TokenLabel(EOF_LABEL , EOF));
        tokenLabels.add(new TokenLabel(ID_LABEL , ID));
        return tokenLabels;
        
    }
    
    
}

