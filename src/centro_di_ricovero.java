import java.util.ArrayList;

public class centro_di_ricovero {
	private String idCentro; //primary key
	private String nome;
	
	ArrayList<centro_di_recupero> centro_di_recupero = new ArrayList<centro_di_recupero>();
	
	//costruttore
	
	
	
	
	
	//getter and setter
	public String getIdCentro() {
		return idCentro;
	}
	
	public void setIdCentro(String idCentro) {
		this.idCentro = idCentro;
	}
	
	public ArrayList<centro_di_recupero> getCentro_di_recupero() {
		return centro_di_recupero;
	}

	public void setCentro_di_recupero(ArrayList<centro_di_recupero> centro_di_recupero) {
		this.centro_di_recupero = centro_di_recupero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
