package controller;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Funcoes {

	Cidades cidade = new Cidades();

	Scanner sc = new Scanner(System.in);

	public void showFuncoes(int opcao, Cidades cidade) {

		switch (opcao) {

		case 0:
			System.out.println("Finalizado!\n");
			System.out.println("--------------\n");
			break;

		case 1:
			System.out.println("---- Cadastro Cidades ----\n");
			System.out.print("Cidade: ");
			String nomeCidade = sc.nextLine();

			Cidades[] cidades = cidade.getCidade();
			for (int i = 0; i < cidades.length; i++) {
				if (cidades[i] == null) {
					cidades[i] = new Cidades(nomeCidade);
					System.out.println("Cidade de " + nomeCidade + " cadastrada com sucesso!");
					break;
				}
			}
			System.out.println("\n--------------\n");
			break;

		case 2:

			System.out.println("---- Registro de Acidentes ----\n");
			cidades = cidade.getCidade();
			for (int i = 0; i < cidades.length; i++) {
				if (cidades[i] == null) {
					break;
				}
				System.out.println((i + 1) + ". " + cidades[i].getNomeCidades());
				System.out.println();
			}
			int codCidade = -1;

			boolean entradaValida = false;
			do {
				try {
					System.out.print("Informe o código da cidade: ");
					codCidade = sc.nextInt() - 1;
					entradaValida = true;
				} catch (Exception e) {
					System.out.println("Entrada inválida!\n");
					sc.nextLine();
				}
			} while (entradaValida == false);

			System.out.print("Informe a quantidade de acidentes ocorridos: ");
			int qtdAcidentes = sc.nextInt();
			cidades[codCidade].setAcidente(qtdAcidentes);

			System.out.println("Acidentes cadastrados com sucesso!\n");
			System.out.println("--------------\n");
			break;

		case 3:

			System.out.println("---- Estatísticas ----\n");
			cidades = cidade.getCidade();
			int totAcidentes = 0;
			int totCidades = 0;
			for (int i = 0; i < cidades.length; i++) {
				if (cidades[i] != null) {
					System.out.println("Acidentes ocorridos na cidade de " + cidades[i].getNomeCidades() + ": "
							+ cidades[i].getAcidentes());
					totAcidentes += cidades[i].getAcidentes();
					totCidades++;
				} else {
					break;
				}

			}

			double media = (double) totAcidentes / totCidades;
			System.out.printf("Média: %.2f acidentes por cidade", media);
			System.out.println("\n--------------\n");

			break;

		case 4:
			System.out.println("---- Gravação de Dados ----\n");
			try {
				System.out.print("Informe o nome do arquivo: ");
				String nomeArq = sc.nextLine();

				FileWriter arquivo = new FileWriter(nomeArq + ".txt");
				PrintWriter gravador = new PrintWriter(arquivo);

				cidades = cidade.getCidade();

				for (int i = 0; i < cidades.length; i++) {
					if (cidades[i] != null) {
						gravador.println("Cidade: " + cidades[i].getNomeCidades());
						gravador.println("Acidentes: " + cidades[i].getAcidentes());
						gravador.println();
					} else {
						break;
					}
				}

				gravador.close();
				System.out.println("Dados gravados com sucesso!");
			} catch (Exception e) {
				System.out.println("Erro ao gravar os arquivos!");
			}

			System.out.println("\n--------------");
			break;
		}
	}
}
