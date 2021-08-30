package desafio;
public class Aluno {
	public Prova prova1  ; 
	public Prova prova2;
	
public double calcularMedia() {
	double m = (prova1.calcularNotaTotal() + prova2.calcularNotaTotal());
	return m/2;
	
	}
}


