import java.util.Scanner;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		int i;
		String identificador[] = new String[10];
		double altura[] = new double[10];
		double largura[] = new double[10];
		double profundidade[] = new double[10];
		String fragil[] = new String[10];

		int op = 0;
		
		System.out.println("--------------------");
		System.out.println("1 - Empilhar        ");
		System.out.println("2 - Desempilhar     ");
		System.out.println("3 - Sair            ");
		System.out.println("--------------------");
		op = dado.nextInt();
		
		switch (op) {

		case 1:
			for (i = 0; i < 10; i++) {
				System.out.println("Identificador: 	     ");
				identificador[i] = dado.next();
				System.out.println("Altura:         	 ");
				altura[i] = dado.nextDouble();
				System.out.println("Largura:             ");
				largura[i] = dado.nextDouble();
				System.out.println("Profundidade:        ");
				System.out.println("Fragil?:             ");
				fragil[i] = dado.next();
				
				System.out.println("---------------------");
				if(fragil[i] == "Sim" || fragil[i] == "sim") {
					fragil[i] = "Sim";
				}else {
					fragil[i] = "Não";
				}
				for (i = identificador[i].length() -1; i >= 0; i--) {
					if(identificador[i] == null) {
						identificador[i] = identificador[i];
						break;
					}
					  
					if(i == 0) {
						System.out.println("A pilha está cheia!");
					}
				}
			}

			break;

		case 2:
			for (i = 0; i < identificador[i].length(); i++) {
				if(identificador[i] != null) {
					identificador[i] = null;
					System.out.println("Caixa retirada!");
					break;
				}
		
				if(i == identificador[i].length() -1) {
					System.out.println("A pilha está vazia!");
				}
			}
			
			break;

		case 3:
			System.out.println("Saiu");
			break;
		}
		
		for (i = 0; i < 2; i++) {

			if (identificador[i] == null && (i + 1) < i) {
				for (int j = i; j < i - 1; j++) {

					String caixaTroca = identificador[j];
					identificador[j] = identificador[j + 1];
					identificador[j + 1] = caixaTroca;
				}
			}
		}
		
	}

}
