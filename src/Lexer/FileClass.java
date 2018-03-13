package Lexer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class FileClass {
    private Scanner in ;
    private Formatter x ;
    
    void OpenWrite(String fileName) throws FileNotFoundException
    {
        try{
            x = new Formatter(fileName) ; 
        }
        catch (Exception e) {
            System.out.println("Error Opening File");
        }
    }
    
   void WriteData(ArrayList<TokenLabel> output )
   {
       for(int i = 0 ; i < output.size() ; i++ )
       {
           x.format("%s %s", output.get(i).getLabel(), output.get(i).getToken()) ;
       }
   }
   void closeWrite()
   {
       x.close(); 
   }

   void OpenRead(String fileName)
   {
       try {
            in = new Scanner(new File(fileName));
        } catch (Exception e) {
            System.out.println("Error Openning File");
        }
   }
   
   String ReadData()
   {
       String result = "" ; 
       while(in.hasNext())
       {
           String var = in.next() ; 
           if( var.charAt( var.length()-1 ) == ';' && var.length() > 1 )
           {
               result+= var.substring(0, var.length()-1 ) ;
               result+= " " ; 
               result+= var.charAt( var.length()-1 ) ; 
               result+= " " ;
           }
           else
           {
               result += var ; 
               result += " " ;
           }
       }
       //result += "\n" ; 
       return result ; 
   }
   
   void closeRead()
   {
       in.close(); ;
   }
    
}
