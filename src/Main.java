import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(Scanner.in);
		int cont=0;
		int opcao;
		Gerienciadordeusuario gl = new Gerienciadordeusuario();
		while(cont!=1){
			System.out.println("informe a opção desejada:");
			System.out.println("cadrastar usuario n2");
			System.out.println("remover usuario:");
			System.out.println("Exibir:");
			System.out.println("lista todos os usuarios:");
			System.out.println("sair:");
			opcao ler.nextInt();
			switch(opcao){
			
			case 1:	
			System.out.println("Informe os dados dos usuario:");
			System.out.println("Titulo:");
			String titulo = sc.nextLine();
				
			System.out.println("autor:");
			String autor = sc.nextLine();
			
			System.out.println("anopublicacao:");
			String anopublicacao = sc.nextLine();
			
			int anopublicacao = sc.nextLine();
			gl.addusuario(titulo, autor,anopublicacao);
			
			System.out.println(" usuario cadrastrado com suscesso:");
			break;
			
			case 2: 
				
			System.out.println("Informe o titulo do usuario:");
				
				
			
			}
		}
		
	}

}
