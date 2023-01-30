package Entità;

import java.util.ArrayList;

public class centroRicovero {
	private String idCentro;
	private String nome;
	private ArrayList<centroRecupero> centroRecuperoTartarughe = new ArrayList<centroRecupero>();

	public centroRicovero(String idCentro, String nome, ArrayList<Entità.centroRecupero> centroRecupero) {
		super();
		this.idCentro = idCentro;
		this.nome = nome;
		this.centroRecuperoTartarughe = centroRecupero;
	}

	public String getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(String idCentro) {
		this.idCentro = idCentro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<centroRecupero> getCentroRecupero() {
		return centroRecuperoTartarughe;
	}

	public void setCentroRecupero(ArrayList<centroRecupero> centroRecupero) {
		this.centroRecuperoTartarughe = centroRecupero;
	}
	
	

}
