package Entità;

public class statoTartaruga {
	private String testa;
	private String occhi;
	private String naso;
	private String becco;
	private String collo;
	private String pinne;
	private String coda;
	private String idStato;

	public statoTartaruga(String testa, String occhi, String naso, String becco, String collo, String pinne,
			String coda, String idStato) {
		super();
		this.testa = testa;
		this.occhi = occhi;
		this.naso = naso;
		this.becco = becco;
		this.collo = collo;
		this.pinne = pinne;
		this.coda = coda;
		this.idStato = idStato;
	}

	public String getTesta() {
		return testa;
	}

	public void setTesta(String testa) {
		this.testa = testa;
	}

	public String getOcchi() {
		return occhi;
	}

	public void setOcchi(String occhi) {
		this.occhi = occhi;
	}

	public String getNaso() {
		return naso;
	}

	public void setNaso(String naso) {
		this.naso = naso;
	}

	public String getBecco() {
		return becco;
	}

	public void setBecco(String becco) {
		this.becco = becco;
	}

	public String getCollo() {
		return collo;
	}

	public void setCollo(String collo) {
		this.collo = collo;
	}

	public String getPinne() {
		return pinne;
	}

	public void setPinne(String pinne) {
		this.pinne = pinne;
	}

	public String getCoda() {
		return coda;
	}

	public void setCoda(String coda) {
		this.coda = coda;
	}

	public String getIdStato() {
		return idStato;
	}

	public void setIdStato(String idStato) {
		this.idStato = idStato;
	}

}
