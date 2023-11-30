
public class usuario {
	
	private String titulo;
	private int anoPublicacao;
	private String autor;
	
	public usuario(String titulo, int anopublicacao, String autor){
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
		this.autor = autor;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo (String Titulo){
		this.titulo = titulo;
	}
	
	public void setautor (String none){
		this.autor = none;
	}
	
	public String getautor(){
		return autor;
	}
	
	
	public void setanoPublicacao (int ano){
		this.anoPublicacao = anoPublicacao;
	}
	
	public int getanoPublicacao(){
		return anoPublicacao;

	}
}
