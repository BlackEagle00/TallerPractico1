public class ejercicio5
/**
 *
 * @author Andrés Guillermo Bonilla Olarte
 */
{
	  static int counter=0;
/**
	 * 
	 * @param primero
	 * @param cadena
	 * @throws IOException 
	 */
   
    public static void combinaciones(String first,String string) 
    {
    	if(cadena.length()==2)
    	{
    		counter=counter+2;
    		System.out.println(first+string.charAt(1)+""+string.charAt(0));
    		System.out.println(first+string.charAt(0)+""+string.charAt(1));
    	}
    	else
      {
    		for (int i=0;i<string.length();i++) 
        {
    		   		combinaciones(first+string.charAt(i),quitarLetra(string,i));
    		}
    	}
    }
      /**
   * 
   * @param cadena
   * @param i
   * @return
   */
   
    public static String quitarLetra(String string,int i)
    {
    	if(i==0)
    	{
    		return cadena.substring(i+1,string.length());
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
    public static void main(String args[]) {
    	String string="abcde";
    	System.out.println("combinaciones de :"+string);
    	combinaciones("",string);
    	System.out.println("total:"+counter);
    }
}
