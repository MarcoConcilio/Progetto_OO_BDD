import java.util.ArrayList;

public class vasca {
	private String idVasca; //primary key
	private int numeroTartarughe;
	ArrayList<tartaruga> tartarugaVasca = new ArrayList<tartaruga>();
	
	

	//getter and setter
	public String getIdVasca() {
		return idVasca;
	}

	public void setIdVasca(String idVasca) {
		this.idVasca = idVasca;
	}

	public int getNumeroTartarughe() {
		return numeroTartarughe;
	}

	public void setNumeroTartarughe(int numeroTartarughe) {
		this.numeroTartarughe = numeroTartarughe;
	}

	public ArrayList<tartaruga> getTartaruga() {
		return tartarugaVasca;
	}

	public void setTartaruga(ArrayList<tartaruga> tartarugaVasca) {
		this.tartarugaVasca = tartarugaVasca;
	}

}