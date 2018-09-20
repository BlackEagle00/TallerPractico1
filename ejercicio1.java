import java.io.*;
/**
 * 
 * @author Andrés Guillermo Bonilla Olarte
 *
 */
public class ejercicio1
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
	if(n2 == 0){
        res = 1;
    }
    else{
        res = n1 * potencia(n1, n2 - 1);
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
        int opc;
        try
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
        	if (opc != 0 && opc <= 7) 
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
            		ra = Math.sqrt(n1);
            		bw.write("Resultado de la raíz cuadrada: "+ra);
            		bw.newLine();
            		bw.flush(); 
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
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
}    
