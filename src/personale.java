enum typePersonale{
	medico, operatore, ricercatore, tecnicoDiLaboratorio
}

public class personale {
	private String nome;
	private String cognome;
	private String CF; 
	private String matricola; //primary key
	private typePersonale personale;
	
	
	//costruttore
	public personale(String nome, String cognome, String cF, String matricola, typePersonale personale) {
		this.nome = nome;
		this.cognome = cognome;
		CF = cF;
		this.matricola = matricola;
		this.personale = personale;
	}

	//getter and setter
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getCF() {
		return CF;
	}
	
	public void setCF(String cF) {
		CF = cF;
	}
	
	public String getMatricola() {
		return matricola;
	}
	
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	public typePersonale getPersonale() {
		return personale;
	}
	
	public void setPersonale(typePersonale personale) {
		this.personale = personale;
	}
	
	
	
	
	
	
}
