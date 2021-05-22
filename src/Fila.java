import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {

		String deseja = "";
		do {
			Scanner dado = new Scanner(System.in);

			int i, atendimento = 1;
			String nome[] = new String[20];
			String idade[] = new String[20];
			String descricao[] = new String[20];

			int op = 0;

			System.out.println("--------------------");
			System.out.println("1 - Incluir paciente");
			System.out.println("2 - Atender paciente");
			System.out.println("3 - Sair            ");
			System.out.println("--------------------");
			op = dado.nextInt();

			switch (op) {

			case 1:
				for (i = 0; i < 20; i++) {
					System.out.println("Informe o nome: 	 ");
					nome[i] = dado.next();
					System.out.println("Informe a idade: 	 ");
					idade[i] = dado.next();
					System.out.println("Informe a descricao: ");
					descricao[i] = dado.next();
					System.out.println("---------------------");

				}

				break;

			case 2:

				do {

					System.out.println("1 - Atender pelo nome");
					System.out.println("2 - Atender pela ordem");
					atendimento = dado.nextInt();

					if (atendimento == 1 || atendimento == 2) {

						if (atendimento == 1) {

							dado.nextLine();

							System.out.println("Informe o paciente atendido: ");
							String nomePaciente = dado.nextLine();

							for (i = 0; i < nomePaciente.length(); i++) {

								if (i != 0) {
									if (i == 1) {
										nome[i] = null;
										System.out.println("Cliente atendido!");
										break;
									}
								}

								if (i == i - 1) {
									System.out.println("Cliente não está na fila!");
								}
							}

						} else {
							for (i = 0; i < nome[i].length(); i++) {

								if (nome[i] != null) {
									nome[i] = null;
									System.out.println("Cliente atendido!");
									break;
								}

								if (i == nome[i].length() - 1) {
									System.out.println("Sem clientes na fila!");
								}
							}
						}

					}

				} while (atendimento != 1 || atendimento == 2);

				break;

			case 3:
				System.out.println("Saiu");
				break;
			}

			if (op != 2) {
				for (i = 0; i < 20; i++) {
					System.out.println("Nome: " + nome[i]);
					System.out.println("Idade: " + idade[i]);
					System.out.println("Descricão: " + descricao[i]);
					System.out.println("--------------------------");
				}
			}

			for (i = 0; i < 20; i++) {

				if (nome[i] == null && (i + 1) < i) {
					for (int j = i; j < i - 1; j++) {

						String pacienteTroca = nome[j];
						nome[j] = nome[j + 1];
						nome[j + 1] = pacienteTroca;
					}
				}
			}

			System.out.println("Deseja voltar ao menu? Sim ou Não");
			deseja = dado.next();

		} while (deseja.equals("Sim"));

	}

}
