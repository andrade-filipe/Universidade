package br.unit.aula9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BJavax2 extends JFrame {
	
	private JButton btSomar;
	
	public BJavax2 () {
		this.setTitle("Somar");
        setBounds(125,125,250,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        btSomar = new JButton();
        btSomar.setText("Somar");
        btSomar.setBounds(40, 100, 100, 50);
        this.add(btSomar);
        
        btSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
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
        		
        		JOptionPane.showMessageDialog(null, "A soma dos números é: " + sum, "Results", JOptionPane.PLAIN_MESSAGE);            
            }
        });
    }

	public static void main(String[] args) {
		
		
		BJavax2 exemplo = new BJavax2();
	    exemplo.setVisible(true);
		
		
	}
	
	

}
