import java.util.Scanner;
public class condiconal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String nome1,nome2;
	int idade1,idade2;
	
	Scanner leitor=new Scanner(System.in);
	
	System.out.println("digite o primeiro nome:");
	nome1=leitor.next();
	
    System.out.println("digite a primeira idade:");
    idade1=leitor.nextInt();
    
    System.out.println("digite o segundo nome:");
    nome2=leitor.next();
    
    System.out.println("digite a segunda idade:");
    idade2=leitor.nextInt();
    
    if(idade1>idade2)
    	System.out.println(nome1+" e mais velho");
    else if (idade2>idade1)
    	System.out.println(nome2+" e mais velho");
    
    else
    	System.out.println("mesma idade");	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
