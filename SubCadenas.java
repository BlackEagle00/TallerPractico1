import java.io.*;

/**
 *
 * @author Andrés Guillermo Bonilla Olarte
 */

public class SubCadenas
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
	/**
      * 
      * @param args 
      */
    public static void main (String [] args)
    {

        String input;
        try
        {
        	bw.write("Ingrese cadena de caracteres\n");
        	bw.flush();
            input = br.readLine();
            all_substrings(input);
        }
        catch (Exception ex)
        {
        }
    }
}
