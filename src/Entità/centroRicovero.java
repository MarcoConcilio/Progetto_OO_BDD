package Entità;

import java.util.ArrayList;

public class centroRicovero {
	private String idCentro;
	private String nome;
	ArrayList<centroRecupero> centroRecupero = new ArrayList<centroRecupero>();

	public centroRicovero(String idCentro, String nome) {
		super();
		this.idCentro = idCentro;
		this.nome = nome;
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

}
