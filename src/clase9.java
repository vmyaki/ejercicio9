import java.util.Scanner;

public class clase9
{

	public static void main(String[] args)
	{
		// Declaramos las variables
		
		double n1,n2,n3,media;
		
		//Mostramos mensaje
		System.out.println("Introduce 3 números");
		
		//Creamos una clase o objeto para poder pedir por teclado
		Scanner teclado=new Scanner (System.in);
		
		n1=teclado.nextInt();
		n2=teclado.nextInt();
		n3=teclado.nextInt();
		
		media=(n1+n2+n3)/3;
		
		System.out.println("La media es: "+media); 
		
	}

}
