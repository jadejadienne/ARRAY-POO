import java.util.ArrayList;
public class gerenciadelivros {
	private ArrayList<usuario> acervo = new ArrayList<usuario>();
	
	public ArrayList getacervo(){
		return acervo;
	}
	
	public void addusuario(String titulo, int anoPublicacao, String autor){
		usuario l = new usuario(titulo, anoPublicacao, autor);
		this.acervo.add(l);
	}
	
	public void addusuario(usuario l){
		this.acervo.add(l);
	}
	
	public void removerusuario(String titulo){
		for(usuario Usuario : acervo ){
			if(Usuario.getTitulo().equals(titulo)){
				this.acervo.remove(Usuario);
				
			}else{
				System.out.println("usuario não encontrado. ");
			}
		}
	}
	
	public int Exibirusuario(String titulo){ 
		for(usuario l : acervo){
			if(l.getTitulo().equals(titulo)){
			System.out.println("usuario"+ l.getTitulo());
			System.out.println("autor"+ l.getautor());
			System.out.println("anoPublicacao"+ l.getanoPublicacao());
			return 1;
				
			}
		}
		return 0;
	}
	
	public void exibirlistadusuario(){
		for(usuario l : acervo){

			System.out.println("usuario"+ l.getTitulo());
			System.out.println("autor"+ l.getautor());
			System.out.println("anoPublicacao"+ l.getanoPublicacao());
			
		}
		
	}
}
