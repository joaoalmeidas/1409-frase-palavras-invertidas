import java.util.Scanner;

public class FraseInvertida {

	public static void main(String[] args) {
		
		String frase;
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

	}

}
