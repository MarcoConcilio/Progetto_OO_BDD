import java.util.ArrayList;

public class vasca {
	private String idVasca; //primary key
	private int numeroTartarughe;
	//public tartaruga nome;
	
	ArrayList<tartaruga> tartaruga = new ArrayList<tartaruga>();
	
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

	/*public tartaruga getNome() {
		return nome;
	}

	public void setNome(tartaruga nome) {
		this.nome = nome;
	}*/

	public ArrayList<tartaruga> getTartaruga() {
		return tartaruga;
	}

	public void setTartaruga(ArrayList<tartaruga> tartaruga) {
		this.tartaruga = tartaruga;
	}

}