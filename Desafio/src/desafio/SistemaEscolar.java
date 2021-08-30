package desafio;
import desafio.Prova;
import desafio.Aluno;
import desafio.Turma;
import java.util.Scanner;

public class SistemaEscolar {

	public static void main(String[] args) {
		Scanner sC = new Scanner(System.in);
		Turma inf;
		inf = new Turma();
		
		Aluno h, i, j;
		h = new Aluno();
		i = new Aluno();
		j = new Aluno();
		
		
		Prova x, y;
		x = new Prova ();
		y = new Prova ();
		
		System.out.println("Insira as notas da primeira prova do primeiro aluno: ");
		
		x.notaParte1 = sC.nextDouble();
		x.notaParte2 = sC.nextDouble();
		
		System.out.println("Insira as notas da segunda prova do primeiro aluno: ");
		y.notaParte1 = sC.nextDouble();
		y.notaParte2 = sC.nextDouble();
		
		h.prova1 = x.calcularNotaTotal();
		h.prova2 = y.calcularNotaTotal();
		
		System.out.println("Insira as notas da primeira prova do segundo aluno: ");
		
		x.notaParte1 = sC.nextDouble();
		x.notaParte2 = sC.nextDouble();
		
		System.out.println("Insira as notas da segunda prova do segundo aluno: ");
		y.notaParte1 = sC.nextDouble();
		y.notaParte2 = sC.nextDouble();
		
		i.prova1 = x.calcularNotaTotal();
		i.prova2 = y.calcularNotaTotal();
		
		System.out.println("Insira as notas da primeira prova do terceiro aluno: ");
		
		x.notaParte1 = sC.nextDouble();
		x.notaParte2 = sC.nextDouble();
		
		System.out.println("Insira as notas da segunda prova do terceiro aluno: ");
		y.notaParte1 = sC.nextDouble();
		y.notaParte2 = sC.nextDouble();
		
		j.prova1 = x.calcularNotaTotal();
		j.prova2 = y.calcularNotaTotal();
		
		double k = h.calcularMedia();
		double kk = i.calcularMedia();
		double kkk = j.calcularMedia();
		
		
		
		
		System.out.println();
		System.out.printf("Média do Aluno 1 é: %.2f%n ", k);
		System.out.println();
		System.out.printf("Média do Aluno 2 é: %.2f%n ", kk);
		System.out.println();
		System.out.printf("Média do Aluno 3 é: %.2f%n ", kkk);
		System.out.println();
		
		
		System.out.printf("Média da turma é: %.2f%n ",inf.calcularMedia2());
		
		
		
	}

}
