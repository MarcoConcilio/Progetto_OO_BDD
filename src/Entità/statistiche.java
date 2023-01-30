package Entità;

import java.sql.Date;

public class statistiche {
	private Date dataInizio;
	private int numTartarughe;
	private Date dataFine;

	public statistiche(Date dataInizio, int numTartarughe, Date dataFine) {
		super();
		this.dataInizio = dataInizio;
		this.numTartarughe = numTartarughe;
		this.dataFine = dataFine;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public int getNumTartarughe() {
		return numTartarughe;
	}

	public void setNumTartarughe(int numTartarughe) {
		this.numTartarughe = numTartarughe;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

}
