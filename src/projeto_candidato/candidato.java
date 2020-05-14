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
		
		//ler outros dados

		System.out.print("Quantos anos de experi�ncia profissional? ");
		EXPPRO = sc.nextDouble();

		System.out.print("Voc� tem disponibilidade para viajar? (S/N) ");
		VIAJEM = sc.next().charAt(0);

		System.out.print("Voc� tem habilita��o de motorista? (S/N) ");
		HABILITACAO = sc.next().charAt(0);
		
		
		//Calculo experiencia
		
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
        
        // calculo escolaridade
        PESCOLARIDADE = ESCOLARIDADE*10;
        
        
        // mostrar resultado da pontua��o
        System.out.println("Pontos por escolaridade: "+ PESCOLARIDADE);
        System.out.println("Pontos por experi�ncia: "+ PEXPPRO);
        
        // calculo resultado final
        
        if (PESCOLARIDADE >= 30 && PEXPPRO == 40 && HABILITACAO == 'S' && VIAJEM == 'S'){
            System.out.println("Voc� est� habilitado para o(s) seguinte(s) cargo(s):");
            System.out.println("ASSISTENTE");
            System.out.println("GERENTE");
            System.out.println("ANALISTA");
        }
        
        else if(PESCOLARIDADE >= 30 && PEXPPRO == 40  && VIAJEM == 'S' && HABILITACAO == 'N'){
            System.out.println("Voc� est� habilitado para o(s) seguinte(s) cargo(s):");
            System.out.println("GERENTE");
            System.out.println("ANALISTA");
        }
        else if(PESCOLARIDADE >= 30 && PEXPPRO <= 20 && HABILITACAO == 'N' && VIAJEM == 'N'){
            System.out.println("Voc� est� habilitado para o(s) seguinte(s) cargo(s):");
            System.out.println("GERENTE");

        }
        else if(PESCOLARIDADE >= 20 && HABILITACAO == 'S'){
            System.out.println("Voc� est� habilitado para o(s) seguinte(s) cargo(s):");
            System.out.println("ASSISTENTE");
        }
        else {
            System.out.println("Infelizmente seu perfil n�o atende a empresa");
        }

		sc.close();

	}
}
