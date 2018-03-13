/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author abdulaziz
 */


public class Matcher {
  String word;
  Map<String,String> map=new HashMap<String,String>(); 
  public void data(){
  map.put("\n","EOL");
  map.put("+","PLUS");
  map.put("{","LEFT_CURLY_B");
  map.put("}","RIGHT_CURLY_B");
  map.put("[","LEFT_SQUARE_B");
  map.put("]","RIGHT_SQUARE_B");
  map.put("(","LEFT_ROUND_B");
  map.put(")","RIGTH_ROUND_B");
  map.put(",","COMMA");
  map.put(";","SEMICOLON");
  map.put(".","DOT");
  map.put("!","NOT");
  map.put("$$","AND");
  map.put("=","EQUAL");
  map.put("-","MINUS");
  map.put("<","GREATERTHAN");
  map.put(">","LESSTHAN");
  map.put("*","MULTIPLY");
  map.put("//","S_COMMENT");
  map.put("if","IF");
  map.put("else","ELSE");
  map.put("int","INT");
  
  
  map.put("+","PLUS");
  map.put("+","PLUS");
  
  }
   

    public void setWord(String word) {
        this.word = word;
    }

    public Matcher() {
        word="";
    }
   public Matcher(String w) {
        word=w;
    }

    public String getWord() {
        return word;
    }
    public String getType(String word){
    data();
    
    String type =null;
    type=map.get(word);
    if (type==null){
    
    }
    return type;
    }
    
}
