import java.io.*;
public class Ejercicio 
{
    public static int factorial(int x)
    {
        if ( x > 1 )
            return x * factorial ( x - 1 );
        else
            return 1;
    }       
            
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
    
    public int pascal(int n, int k)
	{
		return 0;
    }
    
    public String print_pascal()
	{
		String pascal_matrix = "";
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j <= i; j++)
				pascal_matrix += pascal(i, j) + "\t";
			
			pascal_matrix += "\n";
		}
		
		return pascal_matrix;
}
    public static void main(String[] args) 
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ));
        BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter ( System.out ));
        
        int input;
        int interations = 10;
        
        try
        {    
        for (int i = 0; i < interations; i++)
        {  
            input = Integer.parseInt(br.readLine());
            bw.write("\n El resultado del factorial de " + input + " es " + factorial(input));
            bw.write("\n El resultado la serie de Fibonacci " + input + " es " + fibonacci(input));
            bw.write("\n El triángulo de Pascal " + input + " es " + pascal(input));
        } 
    bw.flush(); //libera información
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
}
}    
