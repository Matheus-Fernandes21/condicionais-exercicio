import java.util.Scanner;
public class condicional6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,b,c;
    
    Scanner leitor = new Scanner(System.in);
    
    System.out.print("Nota da primeira avaliacao:");
    a = leitor.nextInt();
    
    if(a>2) {
    	System.out.println("impossivel");
    }
    else {
    	System.out.println("Nota da segunda avalicao");
    	b = leitor.nextInt();
    	
    if (b>3) {
    	System.out.println("impossivel");
    }
    	else {
    		System.out.println("Nota da terceira avaliacao");
    		 c = leitor.nextInt();
    		 if(c>5) {
    			 System.out.println("impossivel");
    		 }
    			 
    			 if(a+b+c<7) {
    				 System.out.println("reprovado");
    			 }
    			 else {
    				 System.out.println("aprovado");
    			 }
    		 }
    	
    	
    	}
    
    
    	
    
    
    

    
  
	
	
	
	
	
	
	
	
	
	
	}

}
