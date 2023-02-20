package br.edu.principal;

public class Principal {
	 public static void main(String[] args) {
		 
	String status = "";
	String status1 = "";
	String status2 = "";
	
	int nota = 80;
	int nota1 = 60;
	int nota2 = 50;
		 
	//STATUS DO ALUNO
		 
	status = (nota >= 60)?"Aprovado":"Lascado";
	status1 = (nota1 >= 60)?"Aprovado":"Lascado";
	status2 = (nota2 >= 60)?"Aprovado":"Lascado";
	
	//PRINT STATUS
		 
	System.out.println( status );
	System.out.println( status1 );
	System.out.println( status2 );
	  }

	 
}