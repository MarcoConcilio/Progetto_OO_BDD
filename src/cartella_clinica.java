enum typeStato{
	testa, occhi, naso, becco, collo, pinne, coda
}

public class cartella_clinica {
	private String specie;
	private String lunghezza;
	private String larghezza;
	private String peso;
	private String luogoRitrovamento;
	private typeStato stato;
	
	
	//costruttore
	public cartella_clinica(String specie, String lunghezza, String larghezza, String peso, String luogoRitrovamento, typeStato stato) {
		this.specie = specie;
		this.lunghezza = lunghezza;
		this.larghezza = larghezza;
		this.peso = peso;
		this.luogoRitrovamento = luogoRitrovamento;
		this.stato = stato;
	}


	//getter and setter
	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}


	public String getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(String lunghezza) {
		this.lunghezza = lunghezza;
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

	public typeStato getStato() {
		return stato;
	}

	public void setStato(typeStato stato) {
		this.stato = stato;
	}
	
	
	
	
}
