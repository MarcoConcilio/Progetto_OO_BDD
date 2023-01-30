package Entità;

import java.util.ArrayList;

public class vasca {
	private String idVasca;
	private ArrayList<tartaruga> tartaruga = new ArrayList<tartaruga>();

	public vasca(String idVasca, ArrayList<Entità.tartaruga> tartaruga) {
		super();
		this.idVasca = idVasca;
		this.tartaruga = tartaruga;
	}

	public String getIdVasca() {
		return idVasca;
	}

	public void setIdVasca(String idVasca) {
		this.idVasca = idVasca;
	}

	public ArrayList<tartaruga> getTartaruga() {
		return tartaruga;
	}

	public void setTartaruga(ArrayList<tartaruga> tartaruga) {
		this.tartaruga = tartaruga;
	}

}
