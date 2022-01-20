package excecao;

import java.util.Objects;

public class ModeloAluno {
	public String nome;
	public double nota;
	public boolean bomComportamento;
	
	public ModeloAluno(String nome, double nota){
		this(nome, nota, true);
		
		
	}
	public ModeloAluno(String nome, double nota, boolean bomComportamento){
		this.nome= nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}
	@Override
	public String toString() {
		return "ModeloAluno [nome=" + nome + ", nota=" + nota + ", bomComportamento=" + bomComportamento + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bomComportamento, nome, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModeloAluno other = (ModeloAluno) obj;
		return bomComportamento == other.bomComportamento && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	
}
