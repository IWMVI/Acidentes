package controller;

public class Cidades {

	Cidades[] cidades = new Cidades[10];
	private String nome;
	private int acidentes;

	public Cidades() {

	}

	public Cidades(String nome) {
		this.nome = nome;
	}

	public Cidades[] getCidade() {
		return cidades;
	}

	public String getNomeCidades() {
		return nome;
	}

	public void setAcidente(int acidentes) {
		this.acidentes += acidentes;
	}

	public int getAcidentes() {
		return acidentes;
	}

}
