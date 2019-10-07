package app;

public class OrdenarAlunos {

	CadastroAlunos src;
	Aluno res[];
	
	String matricula1, matricula2;
	
	public OrdenarAlunos(CadastroAlunos src) {
		this.src = src;
	}
	
	public Aluno[] computa() {
		Aluno resposta[] = new Aluno[src.alunos.length];
		//copia o vetor para o vetor de resposta
		for (int i=0; i < src.alunos.length; i++) {
			resposta[i] = src.alunos[i]; 
		}
		
		for (int i = 0; i < resposta.length - 1; i++) {
			for (int j = i; j < resposta.length; j++) {
				String matricula1 = src.geraMatricula(resposta, i);
				String matricula2 = src.geraMatricula(resposta, j);
				if (matricula1.compareTo(matricula2) > 0) {
					Aluno t = resposta[i]; 
					resposta[i] = resposta[j];
					resposta[j] = t;
				}
			}
		}
		
		return resposta;
	}

}
