
public class tartaruga {
	private String nomeTartaruga; 
	private String idTartaruga; //primary key
	private boolean primoAccesso = true;
	
	


	//costruttore
	
	public tartaruga(String nomeTartaruga, String idTartaruga, boolean primoAccesso) {
		this.nomeTartaruga = nomeTartaruga;
		this.idTartaruga = idTartaruga;
		this.primoAccesso = primoAccesso;
	}
	
	
	//getter and setter
	public String getNomeTartaruga() {
		return nomeTartaruga;
	}
	
	public void setNomeTartaruga(String nomeTartaruga) {
		this.nomeTartaruga = nomeTartaruga;
	}
	
	public String getIdTartaruga() {
		return idTartaruga;
	}
	
	public void setIdTartaruga(String idTartaruga) {
		this.idTartaruga = idTartaruga;
	}
	
	public boolean isPrimoAccesso() {
		return primoAccesso;
	}

	public void setPrimoAccesso(boolean primoAccesso) {
		this.primoAccesso = primoAccesso;
	}

}
