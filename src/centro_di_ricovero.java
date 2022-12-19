
public class centro_di_ricovero {
	private String idCentro; //primary key
	private String nome;
	
	//costruttore
	public centro_di_ricovero(String idCentro, String nome) {
		this.idCentro = idCentro;
		this.nome = nome;
	}

	
	
	
	
	//getter and setter
	public String getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(String idCentro) {
		this.idCentro = idCentro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
