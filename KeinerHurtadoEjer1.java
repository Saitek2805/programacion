import java.util.Scanner;

public class KeinerHurtadoEjer1 {

	public static void main(String[] args) {
		int numero,sumapar=0,sumaimpar=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el número deseado");
		numero=teclado.nextInt();
		
		for (int x=1;x<=numero;x++) {
			if (x%2==0) {
				sumapar=sumapar+x;	
			}else sumaimpar=sumaimpar+x;
		}System.out.println("La suma total de los número pares es: " + sumapar);
		System.out.println("La suma total de los número impares es: " + sumaimpar);
	}

}
