package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) throws Exception {
		ConverteController con = new ConverteController();

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número (0 a 1000): "));
		while(valor > 1000) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número (0 a 1000 apenas) : "));
		}
		con.DecToBin(valor);
	}

}
