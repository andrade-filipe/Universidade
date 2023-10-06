package Exercicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Formulario extends JFrame {

	private JButton btCadastroCidade;
	private JButton btConsultaCidade;
	private JButton btAlterarCidade;
	private JButton btExcluirCidade;
	private ArrayList<Cidade> listaCidade;
	
	public Formulario () {
		this.setTitle("Sistema");
        setBounds(0,0,700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        btCadastroCidade = new JButton();
        btCadastroCidade.setText("Cadastrar Cidade");
        btCadastroCidade.setBounds(10, 10, 150, 50);
        this.add(btCadastroCidade);
        
        btConsultaCidade = new JButton();
        btConsultaCidade.setText("Consultar Cidade");
        btConsultaCidade.setBounds(170, 10, 150, 50);
        this.add(btConsultaCidade);
        
        btAlterarCidade = new JButton();
        btAlterarCidade.setText("Alterar Cidade");
        btAlterarCidade.setBounds(330, 10, 150, 50);
        this.add(btAlterarCidade);
        
        btExcluirCidade = new JButton();
        btExcluirCidade.setText("Excluir Cidade");
        btExcluirCidade.setBounds(490, 10, 150, 50);
        this.add(btExcluirCidade);
        
        listaCidade = new ArrayList<Cidade>();
        
        btCadastroCidade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Cidade cidade = new Cidade();
            	cidade.setCodigo(listaCidade.size()+1);
            	cidade.setNome(JOptionPane.showInputDialog("Nome"));
            	cidade.setUf(JOptionPane.showInputDialog("UF"));
            	listaCidade.add(cidade);
            	JOptionPane.showMessageDialog(null, "Cadastro da cidade realizado com sucesso!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        btConsultaCidade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	for (Cidade cidade : listaCidade) {
            		JOptionPane.showMessageDialog(null, "Nome: " + cidade.getNome() + "\n UF: " + cidade.getUf(), "Cidades", JOptionPane.INFORMATION_MESSAGE);
				}
            }
        });
        
        btAlterarCidade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	String nome = JOptionPane.showInputDialog("Nome");
            	int indice = -1;
            	for (Cidade cidade : listaCidade) {            		
            		if (nome.equalsIgnoreCase(cidade.getNome())) {
            			indice = cidade.getCodigo();
            		}
				}
            	if (indice == -1) {
            		JOptionPane.showMessageDialog(null, "Cidade não existe!", "Alerta", JOptionPane.WARNING_MESSAGE);
            	} else {
            		Cidade cidade = new Cidade();
            		cidade.setNome(JOptionPane.showInputDialog("Nome"));
                	cidade.setUf(JOptionPane.showInputDialog("UF"));
                	listaCidade.set(indice-1, cidade);
                	JOptionPane.showMessageDialog(null, "Cidade alterada com sucesso!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            	}
            	
            }
        });
        
        btExcluirCidade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	String nome = JOptionPane.showInputDialog("Nome");
            	int indice = -1;
            	for (Cidade cidade : listaCidade) {            		
            		if (nome.equalsIgnoreCase(cidade.getNome())) {
            			indice = cidade.getCodigo();
            		}
				}
            	if (indice == -1) {
            		JOptionPane.showMessageDialog(null, "Cidade não existe!", "Alerta", JOptionPane.WARNING_MESSAGE);
            	} else {
            		Cidade cidade = new Cidade();
                	listaCidade.remove(indice-1);
                	JOptionPane.showMessageDialog(null, "Cidade excluída com sucesso!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            	}
            	
            }
        });
    }
	
	public static void main(String[] args) {
		Formulario form = new Formulario();
		form.setVisible(true);
	}

}
