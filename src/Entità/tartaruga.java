package Entità;

import java.util.ArrayList;

public class tartaruga {
	private String nome;
	private String targhetta;
	private String id_tartaruga;
	ArrayList<cartellaClinica> cartellaClinica = new ArrayList<cartellaClinica>();
	
	public tartaruga(String nome, String targhetta, String id_tartaruga) {
		super();
		this.nome = nome;
		this.targhetta = targhetta;
		this.id_tartaruga = id_tartaruga;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTarghetta() {
		return targhetta;
	}

	public void setTarghetta(String targhetta) {
		this.targhetta = targhetta;
	}

	public String getId_tartaruga() {
		return id_tartaruga;
	}

	public void setId_tartaruga(String id_tartaruga) {
		this.id_tartaruga = id_tartaruga;
	}

}
