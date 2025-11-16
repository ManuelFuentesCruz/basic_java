import java.util.Scanner;


public class ecuacion{
	
	
	
	public static boolean verificar(int a1,int b1,int c1,int d1){
		
		if ((a1 * d1) - (b1 * c1) != 0){
		return true;
		}	
		
		else{
		return false;
		}
		
		
	}
	
	public static float calculox(int a1,int b1,int c1,int d1, int e1,int f1){
		float x;
		x = ((e1 * d1) - (b1 * f1)) / ((a1 * d1) - (b1 * c1));
		return x;
	}
	
	public static float calculoy(int a1,int b1,int c1,int d1, int e1,int f1){
		float y;
		y = ((a1 * f1) - (e1 * c1)) / ((a1 * d1) - (b1 * c1));
		return y;
	}
	
	
	public static void main(String[]args){
	int a,b,c,d,e,f;
	boolean resultado;
	float resultadox,resultadoy;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Segun la formula de verificacion de ecuaciones a *d - b  *c != 0 dime el valor de las distintas variables");
	System.out.print("Dime el valor de a ");
	a = sc.nextInt();
	System.out.print("Dime el valor de b ");
	b = sc.nextInt();
	System.out.print("Dime el valor de e ");
	e = sc.nextInt();
	System.out.print("Dime el valor de c ");
	c = sc.nextInt();
	System.out.print("Dime el valor de d ");
	d = sc.nextInt();
	System.out.print("Dime el valor de f ");
	f = sc.nextInt();
	
	
	resultado = verificar(a,b,c,d);
	resultadox = calculox(a,b,c,d,e,f);
	resultadoy = calculoy(a,b,c,d,e,f);
	
	if (resultado == true){ //== , si usamos = le estamos dando el valor a resultado de true todo el rato;
		System.out.println("La ecuacion tiene solucion");
		System.out.println("El resultado de x es " + resultadox);
		System.out.println("El resultado de y es " + resultadoy);
	} else{
		System.out.println("La ecuacion no tiene solucion");
	}
	
	}
}


