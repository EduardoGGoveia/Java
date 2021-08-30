package circulo;
import esfera.Esfera;
import java.util.Scanner;
public class Circulo {

	private static final double PI = 3.14159;

	public static void main(String[] args) {
		Esfera esfera = new Esfera();
		Scanner sC = new Scanner(System.in);
		System.out.println("Informe um valor");
		esfera.valor = sC.nextDouble();
		System.out.printf("A circuferencia de um circulo tendo como raio o valor informado é: %.2f ", esfera.circunferencia());
		System.out.println("");
		System.out.printf("O volume de uma esfera tendo como raio o valor informado é: %.2f ", esfera.volume());
		System.out.println("");
		System.out.printf("O valor de PI é: %.2f ",PI);
	}

}
