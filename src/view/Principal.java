package view;

import controller.Cidades;
import controller.Funcoes;

public class Principal {
	public static void main(String[] args) {

		Menu menu = new Menu();
		Funcoes funcoes = new Funcoes();
		Cidades cidade = new Cidades();

		do {
			menu.showMenu();
			funcoes.showFuncoes(menu.getOpcao(), cidade);
		} while (menu.getOpcao() != 0);
	}
}
