package desafio;

public class Turma {
	

	public Aluno aluno1 ;
	public Aluno aluno2 ;
	public Aluno aluno3 ;
	
	public double calcularMedia2() {
		double m2 = (aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia());
		return m2/3;
	}
}
