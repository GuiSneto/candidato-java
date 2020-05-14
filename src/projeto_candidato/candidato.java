package projeto_candidato;

// bibliotecas
import java.util.Locale;
import java.util.Scanner;

public class candidato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // idioma US
		Scanner sc = new Scanner(System.in); // leitura

		int ESCOLARIDADE,PEXPPRO,PESCOLARIDADE; // variavel
		double EXPPRO;
		char VIAJEM, HABILITACAO;

		// mostra as opções
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.print("Digite uma opção: ");

		// ler a escolaridade
		ESCOLARIDADE = sc.nextInt();

		System.out.print("Quantos anos de experiência profissional? ");
		EXPPRO = sc.nextDouble();

		System.out.print("Você tem disponibilidade para viajar? (S/N) ");
		VIAJEM = sc.next().charAt(0);

		System.out.print("Você tem habilitação de motorista? (S/N) ");
		HABILITACAO = sc.next().charAt(0);
		
        if (EXPPRO == 0){
            PEXPPRO = 0;
        }
        else if(EXPPRO <= 2){
            PEXPPRO = 10;
        }
        else if (EXPPRO > 2 && EXPPRO <5){
            PEXPPRO = 20;
        }
        else {
            PEXPPRO = 40;
        }
        
        PESCOLARIDADE = ESCOLARIDADE*10;
        
        System.out.println("Pontos por escolaridade: "+ PESCOLARIDADE);
        System.out.println("Pontos por experiência: "+ PEXPPRO);

		sc.close();

	}
}
