package view;

import java.util.Scanner;

public class Menu {

	private int opcao;

	Scanner sc = new Scanner(System.in);

	public int getOpcao() {
		return opcao;
	}

	public void showMenu() {
		System.out.println("---- MENU ----\n");
		System.out.println("01. Cadastro Cidade");
		System.out.println("02. Cadastro Acidente");
		System.out.println("03. Estatísticas");
		System.out.println("04. Gravar Dados");
		System.out.println("00. Finalizar");
		System.out.print("Opção: ");
		this.opcao = sc.nextInt();
		System.out.println("\n--------------\n");
	}
}
