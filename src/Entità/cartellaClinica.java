package Entità;

import java.sql.Date;

public class cartellaClinica {
	private String specie;
	private String lughezza;
	private String larghezza;
	private String peso;
	private String luogoRitrovamento;
	private String idCartellaClinica;
	private Date dataIngresso;
	private String matricola;
	
	public cartellaClinica(String specie, String lughezza, String larghezza, String peso, String luogoRitrovamento,
			String idCartellaClinica, Date dataIngresso, String matricola) {
		super();
		this.specie = specie;
		this.lughezza = lughezza;
		this.larghezza = larghezza;
		this.peso = peso;
		this.luogoRitrovamento = luogoRitrovamento;
		this.idCartellaClinica = idCartellaClinica;
		this.dataIngresso = dataIngresso;
		this.matricola = matricola;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public String getLughezza() {
		return lughezza;
	}

	public void setLughezza(String lughezza) {
		this.lughezza = lughezza;
	}

	public String getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(String larghezza) {
		this.larghezza = larghezza;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getLuogoRitrovamento() {
		return luogoRitrovamento;
	}

	public void setLuogoRitrovamento(String luogoRitrovamento) {
		this.luogoRitrovamento = luogoRitrovamento;
	}

	public String getIdCartellaClinica() {
		return idCartellaClinica;
	}

	public void setIdCartellaClinica(String idCartellaClinica) {
		this.idCartellaClinica = idCartellaClinica;
	}

	public Date getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(Date dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	
	
	
}
