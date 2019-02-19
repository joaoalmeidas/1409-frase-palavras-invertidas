import java.util.Scanner;

public class FraseInvertida {

	public static void main(String[] args) {
		
		String frase;
		String fraseInvertida = "";
		String[] token;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma frase:");
		frase = input.nextLine();
		frase = frase.toLowerCase();
		frase.replace(".", "");
			
		token = frase.split(" ");
		
		for(int i = 0; i < token.length; i++) {
			
			String palavraNormal = token[i];
			token[i] = "";
			
			for(int j = palavraNormal.length() - 1; j >= 0; j--) {
				
				token[i] += palavraNormal.charAt(j);
				
			}
			
		}
		
		for(int i = 0; i < token.length; i++) {
			
			if(i == 0) {
				
				fraseInvertida += token[i].substring(0, 1).toUpperCase() + token[i].substring(1);
				
			}else {
				
				fraseInvertida += token[i];
				
			}
			
			if(i == token.length - 1) {
				
				fraseInvertida += ".";
				
			}else {
				
				fraseInvertida += " ";
				
			}
			
		}
		
		System.out.println("Frase original:");
		System.out.println(frase.substring(0, 1).toUpperCase() + frase.substring(1) + ".");
		
		System.out.printf("%nFrase com palvras invertidas:%n");
		System.out.println(fraseInvertida);

	}

}
