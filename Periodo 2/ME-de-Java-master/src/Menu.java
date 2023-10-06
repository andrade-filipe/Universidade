import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class Menu extends JFrame {
    /*Criação dos Botões*/
    private JButton button_Cadastro_Cliente;
    private JButton button_Consulta_Cliente;
    private JButton button_Cadastro_Pet;
    private JButton button_Consulta_Pet;
    private JButton button_Venda_Pet;
    private JButton button_Relatorio;
    /*Criação dos Arrays*/
    private ArrayList<Cliente> lista_Cliente;
    private ArrayList<Pet> lista_Pet;
    private ArrayList<String> lista_Venda;

    public Menu() {
        /*Geração do FrontEnd*/
        this.setTitle("Loja");
        setBounds(0,0,700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        button_Cadastro_Cliente = new JButton();
        button_Cadastro_Cliente.setText("Cadastrar Cliente");
        button_Cadastro_Cliente.setBounds(10, 10, 150, 50);
        this.add(button_Cadastro_Cliente);

        button_Consulta_Cliente = new JButton();
        button_Consulta_Cliente.setText("Consultar Cliente");
        button_Consulta_Cliente.setBounds(170, 10, 150, 50);
        this.add(button_Consulta_Cliente);

        button_Cadastro_Pet = new JButton();
        button_Cadastro_Pet.setText("Cadastrar Pet");
        button_Cadastro_Pet.setBounds(10, 70, 150, 50);
        this.add(button_Cadastro_Pet);

        button_Consulta_Pet = new JButton();
        button_Consulta_Pet.setText("Consultar Pet");
        button_Consulta_Pet.setBounds(170, 70, 150, 50);
        this.add(button_Consulta_Pet);

        button_Venda_Pet = new JButton();
        button_Venda_Pet.setText("Vender Pet");
        button_Venda_Pet.setBounds(10, 130, 150, 50);
        this.add(button_Venda_Pet);

        button_Relatorio = new JButton();
        button_Relatorio.setText("Relatório");
        button_Relatorio.setBounds(170, 130, 150, 50);
        this.add(button_Relatorio);

        lista_Cliente = new ArrayList<Cliente>();
        lista_Pet = new ArrayList<Pet>();
        lista_Venda = new ArrayList<String>();

        /*Funcionalidade: Cadastro de Clientes*/
        button_Cadastro_Cliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Cliente cliente = new Cliente();
                cliente.setId_Cliente(lista_Cliente.size() + 1);
                cliente.setNome_Cliente(JOptionPane.showInputDialog("Nome"));
                cliente.setCpf_Cliente(JOptionPane.showInputDialog("CPF"));
                cliente.setTelefone_Cliente(JOptionPane.showInputDialog("Telefone"));
                lista_Cliente.add(cliente);
                JOptionPane.showMessageDialog(null,
                        "Cadastro de cliente realizado com sucesso!",
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        /*Funcionalidade: Consulta de Clientes*/
        button_Consulta_Cliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                for (Cliente cliente : lista_Cliente) {
                    JOptionPane.showMessageDialog(null,
                            "ID: " + cliente.getId_Cliente() +
                            "\n Nome: " + cliente.getNome_Cliente() +
                                    "\n CPF: " + cliente.getCpf_Cliente() +
                                    "\n Telefone: "+ cliente.getTelefone_Cliente(),
                            "Clientes",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        /*Funcionalidade: Cadastro de Pets*/
        button_Cadastro_Pet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                /*Define o tipo de ração e divide os pets entre Gato,Cachorro e Passaro*/
                String question_1 = JOptionPane.showInputDialog("Ração para:" +
                        "\n [Cachorro / Gato / Passaro]");

                if (question_1.equalsIgnoreCase("gato")) {
                    Gato pet = new Gato();
                    pet.setRacao_Pet("Gato");
                    String question_2 = JOptionPane.showInputDialog("é domesticado?");
                    if (question_2.equalsIgnoreCase("sim")) {
                        pet.setDomesticado(true);
                        pet.exec_pet(pet);
                        pet.setId_Pet(lista_Pet.size()+1);
                        lista_Pet.add(pet);
                    } else {
                        pet.setDomesticado(false);
                        pet.exec_pet(pet);
                        pet.setId_Pet(lista_Pet.size()+1);
                        lista_Pet.add(pet);
                    }
                }
                else if (question_1.equalsIgnoreCase("passaro")) {
                    Passaro pet = new Passaro();
                    pet.setRacao_Pet("Passaro");
                    String question_2 = JOptionPane.showInputDialog("Asas cortadas?");
                    if (question_2.equalsIgnoreCase("sim")) {
                        pet.setAsa_Cortada(true);
                        pet.exec_pet(pet);
                        pet.setId_Pet(lista_Pet.size()+1);
                        lista_Pet.add(pet);
                    } else {
                        pet.setAsa_Cortada(false);
                        pet.exec_pet(pet);
                        pet.setId_Pet(lista_Pet.size()+1);
                        lista_Pet.add(pet);
                    }
                }
                else {
                    Cachorro pet = new Cachorro();
                    pet.setRacao_Pet("Cachorro");
                    pet.setPelo(JOptionPane.showInputDialog("Tipo de Pelo:" +
                            "\n [sem pelo / raso / curto / médio / longo]"));
                    pet.exec_pet(pet);
                    pet.setId_Pet(lista_Pet.size()+1);
                    lista_Pet.add(pet);
                }

                JOptionPane.showMessageDialog(null,
                        "Cadastro de pet realizado com sucesso!",
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        /*Funcionalidade: Consulta de Pets*/
        button_Consulta_Pet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                for (Pet pet : lista_Pet) {
                    JOptionPane.showMessageDialog(null,
                            "Nome: " + pet.getNome_Pet() +
                                    "\n Apelido: " + pet.getApelido_Pet() +
                                    "\n Id: "+ pet.getId_Pet() +
                                    "\n Entrada: " + pet.getData_Entrada(),
                            "Pets",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        /*Funcionalidade: Venda de Pets*/
        button_Venda_Pet.addActionListener(new ActionListener() {
            /*Escolhe o pet que vai ser vendido*/
            public void actionPerformed(ActionEvent evt) {
                int id_do_Pet = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Pet"));
                Pet chosen_Pet = lista_Pet.get(id_do_Pet - 1);
                JOptionPane.showMessageDialog(null,
                        "\n Nome: " + chosen_Pet.getNome_Pet() +
                        "\n Apelido:" + chosen_Pet.getApelido_Pet() +
                        "\n Sexo: " + chosen_Pet.getSexo_Pet() +
                                "\n Idade:" + chosen_Pet.getIdade_Pet(),
                        "Conferência",
                        JOptionPane.INFORMATION_MESSAGE);
                /*Escolhe o cliente comprador*/
                int id_do_Cliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Cliente"));
                Cliente comprador = lista_Cliente.get(id_do_Cliente - 1);
                JOptionPane.showMessageDialog(null,
                        "Nome: " + comprador.getNome_Cliente() +
                        "\n CPF: " + comprador.getCpf_Cliente() +
                        "\n Telefone: " + comprador.getTelefone_Cliente(),
                        "Conferência Cliente",
                        JOptionPane.INFORMATION_MESSAGE);
                /*Confirma tudo e salva numa lista de vendas, e remove o pet da lista de pets*/
                Date data_Venda = new Date();
                lista_Venda.add(chosen_Pet + "\n" + comprador.getCpf_Cliente() + "\n" + data_Venda);
                JOptionPane.showMessageDialog(null,
                        "Pet: " + chosen_Pet.getNome_Pet() +
                                "\b" + chosen_Pet.getId_Pet() +
                        "\n Comprador: " + comprador.getCpf_Cliente() +
                        "\n Data da Venda: " + data_Venda,
                        "Venda Concluida!",
                        JOptionPane.INFORMATION_MESSAGE );
                        lista_Pet.remove(chosen_Pet.getId_Pet() - 1);
            }
        });
        /*Funcionalidade: Relatório com as quantidades de Ração por animal*/
        button_Relatorio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ArrayList<Integer> racao_Gato;
                ArrayList<Integer> racao_Passaro;
                ArrayList<Integer> racao_Cachorro;

                racao_Gato = new ArrayList<>();
                racao_Passaro = new ArrayList<>();
                racao_Cachorro = new ArrayList<>();
                /*Separa os animais de acordo com sua classe em outras 3 listas
                * contendo a quantidade de raçoes deles*/
                for (Pet pet : lista_Pet) {
                    if (pet.getClass().equals(Gato.class)){
                        racao_Gato.add(pet.getRacao_Quantd_Gramas());
                    }
                    else if (pet.getClass().equals(Passaro.class)) {
                        racao_Passaro.add(pet.getRacao_Quantd_Gramas());
                    }
                    else {
                        racao_Cachorro.add(pet.getRacao_Quantd_Gramas());
                    }
                    /*Soma as quantidades de todos os animais*/
                }
                int total_Gato = 0;
                for (int i = 0; i < racao_Gato.size(); i++) {
                    int x = racao_Gato.get(i);
                    total_Gato += x;
                }
                int total_Passaro = 0;
                for (int i = 0; i < racao_Passaro.size(); i++) {
                    int x = racao_Passaro.get(i);
                    total_Passaro += x;
                }
                int total_Cachorro = 0;
                for (int i = 0; i < racao_Cachorro.size(); i++) {
                    int x = racao_Cachorro.get(i);
                    total_Cachorro += x;
                }
                /* Resultado é mostrado na tela*/
                JOptionPane.showMessageDialog(null,
                        "Gato: " + total_Gato +
                        "\n Passaro: " + total_Passaro +
                        "\n Cachorro: " + total_Cachorro
                        ,"Total de Ração para a semana",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
