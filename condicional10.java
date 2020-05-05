import java.util.Scanner;

public class condicional10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner leitor = new Scanner (System.in);
		
		String sexo ;
		String Masculino=("Masculino");
		float altura;
		
		
		System.out.println("Digite sua Altura:");
		altura=leitor.nextFloat();
		
		System.out.println("Seu sexo e Masculino ou Feminino:");
		sexo=leitor.next();
		
		if (sexo.equalsIgnoreCase(Masculino))
		
		System.out.println("Seu peso ideal e de:"+((72.7*altura/100)-58));
		
		else
			
		System.out.println("Seu peso ideal e de:"+((62.1*altura/100)-44.7));
		
		
		
		
		
		
		

	
		
	}

}
