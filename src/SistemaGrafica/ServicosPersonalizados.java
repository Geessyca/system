package SistemaGrafica;
import java.awt.event.*;
import javax.swing.*;

import SistemaGrafica.ServicosImpressos.Handler;
class ServicosPersonalizados extends JDialog{
	JButton jbtCadastrar1, jbtFechar1;
    JLabel jlDes,jlNumReg,jlPreco, jlQuant;
	JTextField jtfDes, jtfNumReg,jtfPreco, jtfQuant;
	Main mn;
    public ServicosPersonalizados(Main r) {
        this.mn = r;
        getContentPane().setLayout(null);
        Handler obj = new Handler();
        setTitle("Cadastro de Serviços Personalizados");

        //botoes
        jbtCadastrar1 = new JButton("Cadastrar");
        jbtCadastrar1.setBounds(10,10,250,30);
        jbtCadastrar1.addActionListener(obj);
        add(jbtCadastrar1);
        jbtFechar1 = new JButton("Voltar");
        jbtFechar1.setBounds(10,420,150,30);
        jbtFechar1.addActionListener(obj);
        add(jbtFechar1);

        //textfield
        jtfNumReg = new JTextField();
        jtfNumReg.setText("");
        jtfNumReg.setBounds(200,100,150,30);
        add(jtfNumReg);
        jtfDes = new JTextField();
        jtfDes.setText("");
        jtfDes.setBounds(200,180,150,30);
        add(jtfDes);
        jtfQuant = new JTextField();
        jtfQuant.setText("");
        jtfQuant.setBounds(200,260,150,30);
        add(jtfQuant);
        jtfPreco = new JTextField();
        jtfPreco.setText("");
        jtfPreco.setBounds(200,340,150,30);
        add(jtfPreco);
        

        

        //textlabel
        jlNumReg = new JLabel();
        jlNumReg.setText("ID do produto:");
        jlNumReg.setBounds(50, 100, 150, 30);
        add(jlNumReg);
        jlDes = new JLabel();
        jlDes.setText("Descricao:");
        jlDes.setBounds(50, 180, 150, 30);
        add(jlDes);
        jlQuant = new JLabel();
        jlQuant.setText("Quantidade:");
        jlQuant.setBounds(50, 260, 150, 30);
        add(jlQuant);
        jlPreco = new JLabel();
        jlPreco.setText("Preço:");
        jlPreco.setBounds(50, 340, 150, 30);
        add(jlPreco);

        
        setBounds(10,10,400,500);

    }
public class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
                if(e.getSource() == jbtCadastrar1){
                        Personalizados aux = new Personalizados();
                        aux.setDescricao(jtfDes.getText());
                        aux.setNumeroRegistro(jtfNumReg.getText());
                        aux.setPreco(Double.parseDouble(jtfPreco.getText()));
                        aux.setQuantidade(Integer.parseInt(jtfQuant.getText()));
                        aux.setVenda("1");
                        mn.cadastra(aux);
                        jtfDes.setText("");
                        jtfNumReg.setText("");
                        jtfPreco.setText("");
                        jtfQuant.setText("");
                }
                if(e.getSource() == jbtFechar1){
                        setVisible(false);
                }
        }
}
}