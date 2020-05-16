package exercicio;

import java.util.Scanner;

public class ex04 {
	private static Scanner n1;
	private static Scanner aluno;
	private static Scanner n2;

	public static void main(String args[])
	{
		int i=0;
	for(i=0;i<=5;i++) {
	while(i<5) {
		String nome;
		int nota1,nota2,media;
		aluno = new Scanner(System.in);
		System.out.print ("Entre com o nome do aluno:");
		nome = aluno.toString();
		n1 = new Scanner(System.in);
		System.out.print ("Entre com a primeira nota:");
		nota1 = n1.nextInt();
		n2 = new Scanner(System.in);
		System.out.print ("Entre com a segunda nota:");
		nota2 = n2.nextInt();
		
		media = (nota1*1 + 2*nota2/3);
		
		System.out.print ("O aluno:"+ nome +"tem media"+ media);
	}
	}
	}
	}
	