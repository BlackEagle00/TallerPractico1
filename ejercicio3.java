import java.io.*;

/**
 * 
 * @author Andrés Guillermo Bonilla Olarte
 *
 */
public class ejercicio3
{
	
/**
 * 
 * @param args
 */
    public static void main(String[] args) 
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ));
        BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter ( System.out ));
        
        
        try
        {   
        	String string;   
        	char [] Arraystring;
        	char charact;
        	int accountant = 0;
        	bw.write("Write your string ");
        	bw.newLine();
        	bw.flush();
        	string = br.readLine();
        	bw.newLine();
        	Arraystring = string.toCharArray();
        	for (int h = 0;h < Arraystring.length; h++) 
        	{
        		charact = Arraystring[h];
        		for (int j = 0; j < Arraystring.length; j++) 
        		{
        			if (Arraystring [j] == charact) 
        			{
        				accountant++;
        			}
        		}
        		bw.write(Arraystring[h]+" "+accountant);
        		bw.newLine();
        		accountant = 0;
        		bw.flush();
        	}
        	
        	bw.flush(); //libera información
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }
    }
} 
