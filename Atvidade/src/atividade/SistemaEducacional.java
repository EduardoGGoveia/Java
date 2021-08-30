package atividade;
public class SistemaEducacional {
	public static void main(String[] args) {
		Turma inf;
		inf = new Turma();
		Aluno h, i, j;
		h = new Aluno();
		i = new Aluno();
		j = new Aluno();
		Prova x, y;
		x = new Prova ();
		y = new Prova ();
		
		x.notaParte1 = (4);
		x.notaParte2 = (2.5);
		y.notaParte1 = (1);
		y.notaParte2 = (7);
		h.prova1 = x.calcularNotaTotal();
		h.prova2 = y.calcularNotaTotal();
		x.notaParte1 = (6.5);
		x.notaParte2 = (3.5);
		y.notaParte1 = (0);
		y.notaParte2 = (3);
		i.prova1 = x.calcularNotaTotal();
		i.prova2 = y.calcularNotaTotal();
		x.notaParte1 = (5);
		x.notaParte2 = (4);
		y.notaParte1 = (6);
		y.notaParte2 = (1.5);
		j.prova1 = x.calcularNotaTotal();
		j.prova2 = y.calcularNotaTotal();
		System.out.println();
		System.out.println("Média do Aluno 1 é: "+ h.calcularMedia());
		System.out.println();
		System.out.println("Média do Aluno 2 é: "+ i.calcularMedia());
		System.out.println();
		System.out.println("Média do Aluno 3 é: "+ j.calcularMedia());
		System.out.println();
		inf.aluno1 = h.calcularMedia();
		inf.aluno2 = i.calcularMedia();
		inf.aluno3 = j.calcularMedia();
		System.out.println("Média da turma é: "+inf.calcularMedia2());
	}
}