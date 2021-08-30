package aluno;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public boolean resultado;
	public double m2 = 60;
public double calculodaNota() {
	double m = nota1+nota2+nota3;
			if(m >= 60) {
		resultado = true;
	return m;
			}
			else {
		resultado = false;
		
		m2=	m2 - m;
	return m;			
		} 
	}
}
