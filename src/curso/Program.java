package curso;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		int a = 1, b = 1;
		int c = a + b, repete;
		System.out.println("digite o tamanho da sequencia de fibonnaci abaixo:");
	    
		Scanner tecla = new Scanner(System.in);
	    
        repete = Integer.parseInt(tecla.nextLine());
	    
        System.out.println("itera��o 1: 1");
	    System.out.println("itera��o 2: 1");
	    
	    for( int i = 3; i < repete + 1; i ++) {
	    	c = a + b;	
	    System.out.println("itera��o " + i + ": " + c);
	    
	    b = a;
	    a = c;
	   
	    
	    }
	    
	    
	    
	    
	    
	    
	    tecla.close();
		
	
		
	}

}
