import java.io.*;
/**
* This program is a calculator with 8 different mah operations
 * This calculator is free software: you can redistribute it and/or modify it under the terms of the 
 * GNU General Public License as published by the Free Software Foundation, version 3
 * 
 * @author Andrés_Bonilla
 * 
 */
public class Calculadora
{
	/**
	 * 
	 * @param n
	 * @param x
	 * @return
	 */
public static int multiplicacion(int n1, int n2)
	{
	if (n2 == 1)
	{
		return n1;
	}
	else
	{
		return n1 + multiplicacion(n1, n2-1);
	}
	}
/**
 * 
 * @param n1
 * @param n2
 * @return
 */
public static int potencia (int n1, int n2)
{
	int res=0;
	if(n2 == 0)
	{
        res = 1;
    }
    else{
        res = multiplicacion (n1, potencia(n1, n2 - 1));
    }      
    return res;
}
	/**
	 * 
	 * @param args
	 */
    public static void main(String[] args) 
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ));
        BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter ( System.out ));
        int n1, n2, s, r, d, mod;
		double ra;
        int opc = 1;
        try
        {   
		
	    
	    while(opc!=0) 
	    {
	    	
	    	bw.flush(); 
        	bw.write("Bienvenido a la calculadora, ingrese la operación a realizar");
        	bw.newLine();
        	bw.flush(); 
        	bw.write("1. Suma");
        	bw.newLine();
        	bw.flush(); 
        	bw.write("2. Resta");
        	bw.newLine();
        	bw.flush(); 
        	bw.write("3. Multiplicación");
        	bw.newLine();
        	bw.flush(); 
        	bw.write("4. División");
        	bw.newLine();
        	bw.flush(); 
        	bw.write("5. Potencia");
        	bw.newLine();
        	bw.flush(); 
        	bw.write("6. Raíz cuadrada");
        	bw.newLine();
        	bw.flush(); 
        	bw.write("7. Módulo");
        	bw.newLine();
        	bw.newLine();
        	bw.flush(); 
        	opc = Integer.parseInt(br.readLine());
        	bw.flush(); 
		
		if (opc == 0) 
		{
			
			bw.write("Gracias por usar la calculadora");
			bw.flush();
			break;
			
		} 
		
		if (opc == 6) 
		{
			bw.write("Ingrese el número a operar\n");
			bw.flush();
			int num = Integer.parseInt(br.readLine());
			bw.write("Resultado de la raíz cuadrada: "+ Math.sqrt(num));
    		bw.flush();
    		bw.newLine();
    		
		}
		
        	
        	if (opc < 8) 
        	{
        		bw.write("Ingrese los números a operar");
            	bw.newLine(); 
            	bw.flush();
            	bw.write("Número 1");
            	n1 = Integer.parseInt(br.readLine());
            	bw.newLine();
            	bw.flush(); 
            	bw.write("Número 2");
            	n2 = Integer.parseInt(br.readLine());
            	bw.newLine();
            	bw.flush(); 
        		switch (opc) 
            	{
            	case 1:
            		s = n1 + n2;
            		bw.write("Resultado de la suma: "+s);
            		bw.newLine();
            		bw.flush(); 
            		break;
            	case 2:
            		r = n1 - n2;
            		bw.write("Resultado de la resta: "+r);
            		bw.newLine();
            		bw.flush(); 
            		break;
            	case 3:
             		bw.write("Resultado de la multiplicación: "+ multiplicacion(n1, n2));
            		bw.newLine();
            		bw.flush(); 
            		break;
            	case 4:
            		d = n1 / n2;
            		bw.write("Resultado de la división: "+d);
            		bw.newLine();
            		bw.flush(); 
            		break;
            	case 5:
            		bw.write("Resultado de la potencia: "+potencia(n1, n2));
            		bw.newLine();
            		bw.flush(); 
            		break;
            	case 6:
            		break;
            		
            	case 7:
            		mod = n1 % n2;
            		bw.write("Resultado del módulo/residuo: "+mod);
            		bw.newLine();
            		bw.flush(); 
            		break;
            	}
        	}
        	bw.flush(); 
        }
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
} 
