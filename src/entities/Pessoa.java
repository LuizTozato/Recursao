package entities;

public class Pessoa {
	
	public Integer nome;
	public Integer cargo;
	public Integer destino;
	public Integer atual;
	
	public Pessoa(Integer nome, Integer cargo, Integer destino, Integer atual) {
		this.nome = nome;
		this.cargo = cargo;
		this.destino = destino;
		this.atual = atual;
	}

	@Override
	public String toString() {
		//return "[nome=" + nome + ", cargo=" + cargo + ", destino=" + destino + ", atual=" + atual + "]";
		return nome+"-"+cargo+"-"+destino+"-"+atual;
	}
	
	
	

}
