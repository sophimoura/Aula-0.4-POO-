package br.edu.principal;

public class Principal {
	public static void main (String[] args) 
	//DEMONSTRAÇÃO OPERADOR && E &: 
	   {

	       int a = 2;
	       int b = 16;
	       boolean test = false;
	   
	       // OPERADOR &&:
	       
	       test = (a > 16) && ( b++ > 2);
	       System.out.println (a); 
	       System.out.println (b);
	       System.out.println (test);
	       
	       //OPERADOR &: 
	       test = (a > 16) & ( b++ > 2);
	       System.out.println (a); 
	       System.out.println (b);
	       System.out.println (test);
	       
     }
}	   

