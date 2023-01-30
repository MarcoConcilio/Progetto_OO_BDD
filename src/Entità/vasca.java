package Entità;

import java.util.ArrayList;

public class vasca {
	private String idVasca;
	ArrayList<tartaruga> tartaruga = new ArrayList<tartaruga>();

	public vasca(String idVasca) {
		super();
		this.idVasca = idVasca;
	}

	public String getIdVasca() {
		return idVasca;
	}

	public void setIdVasca(String idVasca) {
		this.idVasca = idVasca;
	}

}
