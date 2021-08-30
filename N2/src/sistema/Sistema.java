package sistema;
import aluno.Aluno;
import java.util.Scanner;
public class Sistema {

	public static void main(String[] args) {
		Scanner sC = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Insira o nome do aluno:");
		aluno.nome = sC.next();
		System.out.println("Insiria a primeira nota do Aluno: " + aluno.nome);
		aluno.nota1 = sC.nextDouble();
		System.out.println("Insiria a segunda nota do Aluno: " + aluno.nome);
		aluno.nota2 = sC.nextDouble();
		System.out.println("Insiria a terceira nota do Aluno: " + aluno.nome);
		aluno.nota3 = sC.nextDouble();
		System.out.println("");
		System.out.printf("A nota final do aluno "+ aluno.nome + " é " + aluno.calculodaNota());
		if (aluno.resultado == true){
			System.out.println("");
			System.out.println(" Passou");
		} else {
			System.out.println(" Reprovou");
			System.out.println("Faltou: " + aluno.m2 +" pontos.");
		}
	}
}