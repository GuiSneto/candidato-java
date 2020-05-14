package projeto_candidato;

// bibliotecas
import java.util.Locale;
import java.util.Scanner;

public class candidato {
	
	public static void main(String[] args) {
		    
			Locale.setDefault(Locale.US); // idioma US
			Scanner sc = new Scanner(System.in); // leitura
			
			int ESCOLARIDADE; // variavel
			
			// mostra as opções
	        System.out.println("Qual sua escolaridade?");
	        System.out.println("1) Ensino Fundamental");
	        System.out.println("2) Ensino Médio");
	        System.out.println("3) Ensino Superior");
	        System.out.println("4) Pós-graduação");
	        System.out.print("Digite uma opção: ");
	        
	        // ler a resposta
	        ESCOLARIDADE = sc.nextInt();
	        
	        sc.close();
	        
	}        
}
