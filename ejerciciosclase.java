/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerteorico;

import java.io.*;

/**
 *
 * @author BOG-A409-E-010
 */
public class ejercicio3 
{
        static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));       
        static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out)); 
        /**
         * 
         * @param total
         * @param sub
         * @return 
         */
    public static int substring_occurrences(String total, String sub)
    {
        int counter = 0;
        for (int i = 0; i <= (total.length() - sub.length()); i++)
        {
            if (total.substring(i, i + sub.length()).equals(sub))
            {
                counter += 1; 
            }
        }
        return counter;
    }
    /**
     * 
     * @param total
     * @throws IOException 
     */
    public static void all_substrings (String total) throws IOException
    {
        int max = Integer.MIN_VALUE;
        String winner = "";
        String temp = "";
        
         for (int i = 2; i <= total.length(); i++)
        {
            for (int j = 0; j <= (total.length() - i); j++)
            {
                if (substring_occurrences(total, total.substring( j, j+i )) > max)
                {
                    max = substring_occurrences(total, total.substring( j, j+i ));
                    winner = total.substring(j, j+i);
                }
            }        
        }      
        bw.write("La cadena que más se repite es "+ winner+ " y se repite "+max+ " veces\n");
        bw.flush();
    }
    
    
    
    
    public static boolean palindrome(String input)
    {
        if (input.length() <= 1)
        {
            return true;
        }
        else 
        {
            if (input.charAt(0) == input.charAt(input.length() - 1))
            {
                return palindrome(input.substring(i, input.length()-1));
            }
            else
            {
                return false;
            }
        }
    }
     /**
      * 
      * @param args 
      */
    public static void main (String [] args)
    {

        String input;
        try
        {
            input = br.readLine();
            all_substrings(input);
            
            input = br.readLine();
            input = Input.replace(" ","");
            bw.write("\nResultado 1: " + palindrome(input));
            bw.write("\nResultado 2: " + palindrome(input, 0, input.length() - 1));
            bw.flush();
        }
        catch (Exception ex)
        {
        }
    }
}
