package Entità;

public class centroRecupero {
	private String nome;
	private String indirizzo;
	private int numeroTelefono;
	private String id_sede;
	private String e_mail;

	public centroRecupero(String nome, String indirizzo, int numeroTelefono, String id_sede, String e_mail) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.numeroTelefono = numeroTelefono;
		this.id_sede = id_sede;
		this.e_mail = e_mail;
	}

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

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getId_sede() {
		return id_sede;
	}

	public void setId_sede(String id_sede) {
		this.id_sede = id_sede;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

}
