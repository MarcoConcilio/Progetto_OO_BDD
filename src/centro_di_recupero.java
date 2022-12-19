
public class centro_di_recupero {
	private String nome;
	private String indirizzo;
	private String numero_telefono;
	private String idSede; //primary key
	private String e_mail;
	
	//costruttore
	public centro_di_recupero(String nome, String indirizzo, String numero_telefono, String idSede, String e_mail) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.numero_telefono = numero_telefono;
		this.idSede = idSede;
		this.e_mail = e_mail;
	}

	
	//getter and setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNumero_telefono() {
		return numero_telefono;
	}

	public void setNumero_telefono(String numero_telefono) {
		this.numero_telefono = numero_telefono;
	}

	public String getIdSede() {
		return idSede;
	}

	public void setIdSede(String idSede) {
		this.idSede = idSede;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	
	
	
}
