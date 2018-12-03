import java.io.*;
/**
 * 
 * @author Andrés Guillermo Bonilla Olarte
 *
 */
public class Fibo_Pascal_Fact
{
    public static int factorial(int x)
    {
        if ( x > 1 )
            return x * factorial ( x - 1 );
        else
            return 1;
    }       
    /**
     *         
     * @param x
     * @return
     */
    public static int fibonacci (int x)
    {
      if (x == 0)
          return 0;
      else
          if (x == 1)
              return 1;
          else
              return fibonacci (x - 1) + fibonacci (x - 2);
    } 
    /**
     * 
     * @param n
     * @param k
     * @return
     */
    public static long pascal(int n, int k)
	{
		if (k == 0 || k == n )
		{
			return 1;
		}
		else 
		{
			return pascal(n-1, k-1) + pascal(n-1, k);
		}
    }
    /**
     * 
     * @return
     */
    public static void main(String[] args) 
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ));
        BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter ( System.out ));
        
        int input;
        
        int interations = 10;
        
        try
        {   
        	bw.write("Triángulo de Pascal \n");
        	for (int  i = 0; i < 10; i++)
        	{
        		for (int j = 0; j <= i; j++) 
        		{
        			bw.write((pascal(i,j))+" ");
        			bw.flush();
        		}
        		bw.newLine();
        	}
        	bw.newLine();
        	bw.flush();
        	
        for (int i = 0; i < interations; i++)
        {  
            input = Integer.parseInt(br.readLine());
            bw.write("\n El resultado del factorial de " + input + " es " + factorial(input));
            bw.newLine();
            bw.write("\n La serie de Fibonacci " + input + " es " + ((i+1)+" : "+fibonacci(input)));
            bw.newLine();
            
        } 
        
    bw.flush(); //libera información
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
}
}
