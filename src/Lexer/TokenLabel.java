/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexer;

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
    
    
    
     static ArrayList<TokenLabel> initializeTokensArray()
     {
        ArrayList<TokenLabel> tokenLabels = new ArrayList<>();
        
        ////////////////////////////////////////////////////////////////////////
     String EOL = "\n" 
     
            /** Mazen STARTED FROM HERE  **/ 
	   
	   , MOD = "\\%"        	// check
	   , LESSTHAN = "\\<"		// check
	   , GREATERTHAN = "\\>"	// check
           , LESS_EQ = "\\<\\="		// check
	   , GREATER_EQ = "\\>\\="	// check
	   , IF = "\\bif\\b"
           , INT = "\\bint\\b"
           , ELSE = "\\belse\\b"
           , MAIN = "\\bmain\\b"
           , THIS = "\\bthis\\b"
           , TRUE = "\\btrue\\b"
	   , VOID = "\\bvoid\\b"
           , CLASS = "\\bclass\\b"
           , FALSE = "\\bfalse\\b"
	   , WHILE = "\\bwhile\\b"
	   , LENGTH = "\\blength\\b"
           , PUBLIC = "\\bpublic\\b"
	   , PRIVATE = "\\bprivate\\b"
	   , PROTECTED = "\\bprotected\\b"
           , RETURN = "\\breturn\\b"
       
            /// Mazen END HERE
	   
            /** AZZAM STARTED FROM HERE  **/ 
	   
	   , STATIC = "\\bstatic\\b"
	   , NEW = "\\bnew\\b"
	   , STRING = "\\bstring\\b"
           , FLOAT = "\\bfloat\\b"
	   , CHARACTER = "\\bchar\\b"
	   , BOOLEAN = "\\bboolean\\b"
           , EXTENDS = "\\bextends\\b"
           , NULL = "\\bnull\\b"
           , ABSTRACT = "\\babstract\\b" 
           , ASSERT = "\\bassert\\b"
           , BREAK = "\\bbreak\\b"
           , CONTINUE = "\\bcontinue\\b"
           , BYTE = "\\bbyte\\b"    
           , CASE = "\\bcase\\b" 
           , CATCH = "\\bcatch\\b"
           , CONST = "\\bconst\\b"
           , DEFAULT = "\\bdefault\\b"
           , DO = "\\bdo\\b"
           , DOUBLE = "\\bdouble\\b"
           , ENUM = "\\benum\\b"
           , FINAL = "\\bfinal\\b"  
             
            /// AZZAM END HERE      
             
     ;
    
    //==========================================================================
     String EOL_LABEL = "EOL"
   
	 
            /** Mazen STARTED FROM HERE  **/ 
	   
	   , MOD_LABEL = "MOD"        	
	   , LESSTHAN_LABEL = "LESSTHAN"		
	   , GREATERTHAN_LABEL = "GREATERTHAN"
           , LESS_EQ_LABEL = "LESS_EQ"
	   , GREATER_EQ_LABEL = "GREATER_EQ"
	   , IF_LABEL = "IF"
           , INT_LABEL = "INT"
           , ELSE_LABEL = "ELSE"
           , MAIN_LABEL = "MAIN"
           , THIS_LABEL = "THIS"
           , TRUE_LABEL = "TRUE"
	   , VOID_LABEL = "VOID"
           , CLASS_LABEL = "CLASS"
           , FALSE_LABEL = "FALSE"
	   , WHILE_LABEL = "WHILE"
	   , LENGTH_LABEL = "LENGTH"
           , PUBLIC_LABEL = "PUBLIC"
	   , PRIVATE_LABEL = "PRIVATE"
	   , PROTECTED_LABEL = "PROTECTED"
           , RETURN_LABEL = "RETURN"
       
            /// Mazen END HERE
    
            /** AZZAM STARTED FROM HERE  **/ 
       
	   , STATIC_LABEL = "STATIC"
           , NEW_LABEL = "NEW" 
	   , STRING_LABEL = "STRING"
           , FLOAT_LABEL = "FLOAT"
           , CHARACTER_LABEL = "CHARACTER"
           , BOOLEAN_LABEL = "BOOLEAN"
	   , EXTENDS_LABEL = "EXTENDS"
           , NULL_LABEL = "NULL"
           , ABSTRACT_LABEL = "ABSTRACT" 
           , ASSERT_LABEL = "ASSERT"
           , BREAK_LABEL = "BREAK"
           , CONTINUE_LABEL = "CONTINUE"
           , BYTE_LABEL = "BYTE"    
           , CASE_LABEL = "CASE" 
           , CATCH_LABEL = "CATCH"
           , CONST_LABEL = "CONST"
           , DEFAULT_LABEL = "DEFAULT"
           , DO_LABEL = "DO"
           , DOUBLE_LABEL = "DOUBLE"
           , ENUM_LABEL = "ENUM"
           , FINAL_LABEL = "FINAL"  
             
            /// AZZAM END HERE            
             
             ;
        ////////////////////////////////////////////////////////////////////////
		
		
        /**  MAZEN START HERE **/

          tokenLabels.add(new TokenLabel( MOD_LABEL , MOD ) ) ;
          tokenLabels.add(new TokenLabel( LESSTHAN_LABEL , LESSTHAN ) ) ;
          tokenLabels.add(new TokenLabel( GREATERTHAN_LABEL , GREATERTHAN ) ) ;
          tokenLabels.add(new TokenLabel( LESS_EQ_LABEL , LESS_EQ ) ) ;
          tokenLabels.add(new TokenLabel( GREATER_EQ_LABEL , GREATER_EQ ) ) ;
          tokenLabels.add(new TokenLabel( IF_LABEL , IF ) ) ;
          tokenLabels.add(new TokenLabel( INT_LABEL , INT ) ) ;
          tokenLabels.add(new TokenLabel( ELSE_LABEL , ELSE ) ) ;
          tokenLabels.add(new TokenLabel( MAIN_LABEL , MAIN ) ) ;
          tokenLabels.add(new TokenLabel( THIS_LABEL , THIS ) ) ;
          tokenLabels.add(new TokenLabel( TRUE_LABEL , TRUE ) ) ;
          tokenLabels.add(new TokenLabel( VOID_LABEL , VOID ) ) ;
          tokenLabels.add(new TokenLabel( CLASS_LABEL , CLASS ) ) ;
          tokenLabels.add(new TokenLabel( FALSE_LABEL , FALSE ) ) ;
          tokenLabels.add(new TokenLabel( WHILE_LABEL , WHILE ) ) ;
          tokenLabels.add(new TokenLabel( LENGTH_LABEL , LENGTH ) ) ;
          tokenLabels.add(new TokenLabel( PUBLIC_LABEL , PUBLIC ) ) ;
          tokenLabels.add(new TokenLabel( PRIVATE_LABEL , PRIVATE ) ) ;
          tokenLabels.add(new TokenLabel( PROTECTED_LABEL , PROTECTED ) ) ;
          tokenLabels.add(new TokenLabel( RETURN_LABEL , RETURN ) ) ;

          /** MAZEN END HERE **/

          /**  AZZAM START HERE **/

          tokenLabels.add(new TokenLabel(STATIC_LABEL , STATIC));
          tokenLabels.add(new TokenLabel(NEW_LABEL , NEW));
          tokenLabels.add(new TokenLabel(STRING_LABEL , STRING));
          tokenLabels.add(new TokenLabel(FLOAT_LABEL , FLOAT));
          tokenLabels.add(new TokenLabel(CHARACTER_LABEL , CHARACTER));
          tokenLabels.add(new TokenLabel(BOOLEAN_LABEL , BOOLEAN));
          tokenLabels.add(new TokenLabel(EXTENDS_LABEL , EXTENDS));
          tokenLabels.add(new TokenLabel( NULL_LABEL , NULL ) ) ;
          tokenLabels.add(new TokenLabel( ABSTRACT_LABEL , ABSTRACT ) ) ;
          tokenLabels.add(new TokenLabel( ASSERT_LABEL , ASSERT ) ) ;
          tokenLabels.add(new TokenLabel( BREAK_LABEL , BREAK ) ) ;
          tokenLabels.add(new TokenLabel( CONTINUE_LABEL , CONTINUE ) ) ;
          tokenLabels.add(new TokenLabel( BYTE_LABEL , BYTE ) ) ;
          tokenLabels.add(new TokenLabel( CASE_LABEL , CASE ) ) ;
          tokenLabels.add(new TokenLabel( CATCH_LABEL , CATCH ) ) ;
          tokenLabels.add(new TokenLabel( CONST_LABEL ,CONST ) ) ;
          tokenLabels.add(new TokenLabel( DEFAULT_LABEL , DEFAULT ) ) ;
          tokenLabels.add(new TokenLabel( DO_LABEL, DO ) ) ;
          tokenLabels.add(new TokenLabel( DOUBLE_LABEL , DOUBLE ) ) ;
          tokenLabels.add(new TokenLabel( ENUM_LABEL , ENUM) ) ;
          tokenLabels.add(new TokenLabel( FINAL_LABEL , FINAL ) ) ;

          /** AZZAM END HERE **/

        return tokenLabels;
        
    }
    
    
}

