package projeto_candidato;

// bibliotecas
import java.util.Locale;
import java.util.Scanner;

public class candidato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // idioma US
		Scanner sc = new Scanner(System.in); // leitura

		int ESCOLARIDADE; // variavel
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

		sc.close();

	}
}
