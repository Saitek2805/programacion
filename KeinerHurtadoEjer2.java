import java.util.Scanner;

public class KeinerHurtadoEjer2 {
	
	public static void main(String[] args) {
		float temperatura;
		byte eleccion;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el número deseado");
		temperatura=teclado.nextFloat();
		System.out.println("¿Quieres convertirlo a Farenheit (1) o Celsius (2)?");
		eleccion=teclado.nextByte();
		while (eleccion<1|| eleccion>2) {
			System.out.println("Introduzca (1) o (2)");
			eleccion=teclado.nextByte();
			
			}if (eleccion==1) {
				System.out.print("La temperatura es de :" +(temperatura*9/5+32)+ "ºF");
			}else if (eleccion==2) {
				System.out.print("La temperatura es de :" +(temperatura-32)*5/9 + "ºC");
		}
	}

}
