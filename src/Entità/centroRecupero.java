package Entità;

import java.util.ArrayList;

public class centroRecupero {
	private String nome;
	private String indirizzo;
	private int numeroTelefono;
	private String idSede;
	private String eMail;
	private ArrayList<tartaruga> tartarughe = new ArrayList<tartaruga>();
	private ArrayList<personale> lavoratori = new ArrayList<personale>();

	public centroRecupero(String nome, String indirizzo, int numeroTelefono, String idSede, String eMail,
			ArrayList<tartaruga> tartarughe, ArrayList<personale> lavoratori) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.numeroTelefono = numeroTelefono;
		this.idSede = idSede;
		this.eMail = eMail;
		this.tartarughe = tartarughe;
		this.lavoratori = lavoratori;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getIdSede() {
		return idSede;
	}

	public void setIdSede(String idSede) {
		this.idSede = idSede;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public ArrayList<tartaruga> getTartarughe() {
		return tartarughe;
	}

	public void setTartarughe(ArrayList<tartaruga> tartarughe) {
		this.tartarughe = tartarughe;
	}

	public ArrayList<personale> getLavoratori() {
		return lavoratori;
	}

	public void setLavoratori(ArrayList<personale> lavoratori) {
		this.lavoratori = lavoratori;
	}

}
