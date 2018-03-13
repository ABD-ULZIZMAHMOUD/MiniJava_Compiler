/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testre;

import java.util.HashMap;
import java.util.Map;
import jdk.nashorn.internal.runtime.regexp.RegExp;

/**
 *
 * @author abdulaziz
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testre {

    public static void main( String args[] ) {
      // String to be scanned to find the pattern.
     // TokenLabel t =new TokenLabel("label", "token");
       // System.err.println(t.initializeTokensArray().get(2).toString());
        System.out.println(TestStringAgenstRegEX.test("int intvalue = 10+5;"));;
        
        Map<Integer,String> z=new HashMap<Integer,String>();
z.put(2, "mody");
z.put(1, "zizo");
        System.out.println(z.toString());
   }
}
    
