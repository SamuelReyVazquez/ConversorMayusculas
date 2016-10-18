import java.util.Scanner;

public class Mayusculas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce un texto");
		String texto;
		texto=sc.next();
		texto=texto.toUpperCase();
		System.out.println(texto);

	}

}
