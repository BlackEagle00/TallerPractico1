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
   
    public static void combinaciones(String primero,String cadena) 
    {
    	if(cadena.length()==2)
    	{
    		counter=counter+2;
    		System.out.println(primero+cadena.charAt(1)+""+cadena.charAt(0));
    		System.out.println(primero+cadena.charAt(0)+""+cadena.charAt(1));
    	}
    	else
      {
    		for (int i=0;i<cadena.length();i++) 
        {
    		   		combinaciones(primero+cadena.charAt(i),quitarLetra(cadena,i));
    		}
    	}
    }
      /**
   * 
   * @param cadena
   * @param i
   * @return
   */
   
    public static String quitarLetra(String cadena,int i)
    {
    	if(i==0)
    	{
    		return cadena.substring(i+1,cadena.length());
    	}
    	else
    	{
    		if(i==cadena.length())
    		{
    			return cadena.substring(0,cadena.length()-1);
    		}
    		else
    		{
    			return cadena.substring(0,i)+cadena.substring(i+1,cadena.length());
    		}
    	}
    }
    /**
   * 
   * @param args
 * @throws IOException 
   */
    public static void main(String args[]) {
    	String cadena="abcde";
    	System.out.println("combinaciones de :"+cadena);
    	combinaciones("",cadena);
    	System.out.println("total:"+count);
    }
}
