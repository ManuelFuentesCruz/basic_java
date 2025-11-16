import java.util.Scanner;
import java.util.Random;

public class calculadora{
	public static boolean comprobar(int x,int y){
		return x<= 10 && y<= 10;
	}
	
	
	public static void operaciones(int x,int y,int eleccion,boolean comproba,Scanner sc){	
	if(comproba == true){
		do{
			System.out.println("1.Sumar/n2,Restar/n3.Multiplicar/n4.Salir");
			eleccion = sc.nextInt();
			switch(eleccion){
				case 1:
				System.out.println("La suma es de " + (x+y));
				break;
				case 2:
				System.out.println("La suma es de " + (x+y));
				break;
				case 3:
				System.out.println("La suma es de " + (x+y));
				break;
				case 4:
				System.out.println("Adios");
				break;
				default:
				System.out.println("Da otro valor");
			}
		} while(eleccion != 4);
		
	}else{
		System.out.println("Malos valores");
	}	
		
	}
	public static void main(String[]args){
	System.out.println("VAmos a calcular");
	Scanner sc = new Scanner(System.in);
	System.out.println("Dame los dos valores");
	int x = sc.nextInt();
	int y = sc.nextInt();
	int eleccion = 0;
	boolean comproba = comprobar(x,y);
	operaciones(x,y,eleccion,comproba,sc);
	}
}