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

		// mostra as op��es
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.print("Digite uma op��o: ");

		// ler a escolaridade
		ESCOLARIDADE = sc.nextInt();

		System.out.print("Quantos anos de experi�ncia profissional? ");
		EXPPRO = sc.nextDouble();

		System.out.print("Voc� tem disponibilidade para viajar? (S/N) ");
		VIAJEM = sc.next().charAt(0);

		System.out.print("Voc� tem habilita��o de motorista? (S/N) ");
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
        System.out.println("Pontos por experi�ncia: "+ PEXPPRO);

		sc.close();

	}
}
