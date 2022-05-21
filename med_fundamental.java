package ex1;

import java.util.Scanner;

public class med_fundamental {
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in); //criando o scanner 
		double nota1,nota2,nota3; //variavel que vai guardar as notas 
		double notaF = 0; //variavel que vai guardar o resultado final
		int RA = 1; //variavel que vai receber o RA
		
		System.out.println("Digite o RA do aluno");
		RA = ler.nextInt(); //vai ler o numero do RA
		
		//vai executar o loop caso o RA seja diferente de 0
		while(RA != 0) {
			//vão pegat os valores das notas
			System.out.println("Digite a nota de sua primeira prova");
			nota1 = ler.nextInt(); 
			System.out.println("Digite a nota de sua segunda prova");
			nota2 = ler.nextInt(); 
			System.out.println("Digite a nota de sua terceira prova");
			nota3 = ler.nextInt();
			//vai executar a soma da media final
			notaF = (nota1+nota2+nota3)/3;
			break; //break para que o loop não fique repetindo denovo apos todo o processo ter sido feito 
		}
		if(notaF >= 8) { //caso a nota seja acuma ou igual a 8 executar
			System.out.println("Aprovado !");
		}else if(notaF <8 && notaF > 6 ) { //caso a nota esteja entre 8 e 6 executar
			System.out.println("Ficou de recuperação");
		}else // caso a nota seja menor que 6 executar
			System.out.println("Reprovado");
	}
}
