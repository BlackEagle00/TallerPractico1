import java.io.*;

public class ejercicio5
/**
 *
 * @author Andrés Guillermo Bonilla Olarte
 */
{
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));       //creating the Reading Buffer
    static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));     //creating the Writing Buffer
	  static int counter=0;
/**
	 * 
	 * @param primero
	 * @param cadena
	 * @throws IOException 
	 */
   
    public static void combinaciones(String first,String string) throws IOException 
    {
    	if(string.length()==2)
    	{
    		counter=counter+2;
    		bw.write(first+string.charAt(1)+""+string.charAt(0));
    		bw.write(first+string.charAt(0)+""+string.charAt(1));
    		bw.flush();
    	}
    	else
      {
    		for (int i=0;i<string.length();i++) 
        {
    		   		combinaciones(first+string.charAt(i),removechar(string,i));
    		}
  
    	}
    }
      /**
   * 
   * @param cadena
   * @param i
   * @return
   */
   
    public static String removechar(String string,int i)
    {
    	if(i==0)
    	{
    		return string.substring(i+1,string.length());
    	}
    	else
    	{
    		if(i==string.length())
    		{
    			return string.substring(0,string.length()-1);
    		}
    		else
    		{
    			return string.substring(0,i)+string.substring(i+1,string.length());
    		}
    	}
    }
    /**
   * 
   * @param args
 * @throws IOException 
   */
    public static void main(String args[]) throws IOException 
    {
    	String string="abcde";
    	bw.write("combinaciones de :"+string);
    	bw.newLine();
    	combinaciones("\n"+"",string);
    	bw.newLine();
    	bw.write("total:"+counter);
    	bw.newLine();
    	bw.flush();
    }
}
