package Entità;

import java.util.ArrayList;

public class tartaruga {
	private String nome;
	private String targhetta;
	private String idTartaruga;
	private ArrayList<cartellaClinica> cartellaClinica = new ArrayList<cartellaClinica>();

	public tartaruga(String nome, String targhetta, String id_tartaruga,
			ArrayList<Entità.cartellaClinica> cartellaClinica) {
		super();
		this.nome = nome;
		this.targhetta = targhetta;
		this.idTartaruga = id_tartaruga;
		this.cartellaClinica = cartellaClinica;
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

	public ArrayList<cartellaClinica> getCartellaClinica() {
		return cartellaClinica;
	}

	public void setCartellaClinica(ArrayList<cartellaClinica> cartellaClinica) {
		this.cartellaClinica = cartellaClinica;
	}

	public String getIdTartaruga() {
		return idTartaruga;
	}

	public void setIdTartaruga(String idTartaruga) {
		this.idTartaruga = idTartaruga;
	}

}
