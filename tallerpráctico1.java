import java.io.*;
/**
 * 
 * @author Andr�s Guillermo Bonilla Olarte
 *
 */
public class tallerpr�ctico1 

{
	/**
	 * 
	 * @param args
	 */
	public static void main (String [] args) 
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); 
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
        try
        {
			String word, word1 = ""; 
			System.out.println("Ingrese una palabra"); 
			word = br.readLine();
			for (int i = word.length() - 1; i >= 0; i--) 
			{ 
				word1 = word1 + word.charAt(i); 
			} 
			if (word.equals(word1)) 
			{ 
				bw.write("La palabra es un pal�ndromo");  
			} 
			else
			{
				bw.write("La palabra no es pal�ndromo");
			}
			bw.flush();
        }
        catch (Exception ex)
        {
        	ex.printStackTrace();
        }
	}
}