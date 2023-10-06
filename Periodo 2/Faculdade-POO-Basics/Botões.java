package br.unit.aula9;


import javax.swing.JOptionPane;

public class BJavax {

	public static void main(String[] args) {
		String s1;
		String s2;
		int n1;
		int n2;
		int sum;
		
		s1 = JOptionPane.showInputDialog("Digite um número");
		s2 = JOptionPane.showInputDialog("Digite outro número");
		
		n1 = Integer.parseInt(s1);
		n2 = Integer.parseInt(s2);
		
		sum = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "A soma dos números: " + sum, "Results", JOptionPane.PLAIN_MESSAGE);
		
	}

}
