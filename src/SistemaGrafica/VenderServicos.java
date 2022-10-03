package SistemaGrafica;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
public class VenderServicos extends JDialog{
	JButton jbtFechar,jbtConfirmar;
        JTextField jtfId, jtfQuant;
	Vector<Servicos> produtos;
        JLabel jlIdServico, jlQuantidade,jtfInfo;
	public VenderServicos(Vector<Servicos> v) {
		produtos = v;
		getContentPane().setLayout(null);
		setTitle("Vender serviços");
		Handler obj = new Handler(); 
                
                jbtConfirmar = new JButton("Confirmar");
                jbtConfirmar.setBounds(10,10,150,30);
                jbtConfirmar.addActionListener(obj);
                add(jbtConfirmar);
                jbtFechar = new JButton("Voltar");
                jbtFechar.setBounds(200,10,150,30);
                jbtFechar.addActionListener(obj);
                add(jbtFechar);
                //textlabel
                jlIdServico = new JLabel();
                jlIdServico.setText("Digite a id do serviço vendido:");
                jlIdServico.setBounds(10, 90, 180, 30);
                add(jlIdServico);
                jtfId = new JTextField();
                jtfId.setText("");
                jtfId.setBounds(200, 90, 100, 30);
                add(jtfId);
                jlQuantidade = new JLabel();
                jlQuantidade.setText("Digite quantidade a ser vendida:");
                jlQuantidade.setBounds(10, 130, 180, 30);
                add(jlQuantidade);
                jtfQuant = new JTextField();
                jtfQuant.setText("");
                jtfQuant.setBounds(200, 130, 100, 30);
                add(jtfQuant);
                jtfInfo = new JLabel();
                jtfInfo.setText("");
                jtfInfo.setBounds(100, 170, 300, 30);
                add(jtfInfo);
                
                setBounds(120,170,450,250);
		setVisible(true);
        }
        
        public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == jbtFechar) {
				setVisible(false);
			}
                        if(e.getSource() == jbtConfirmar) {
                               	int ident = Integer.parseInt(jtfId.getText());
                               	
                                int i = 0;
                                while(true){
                                    int a =Integer.parseInt(produtos.get(i).getNumeroRegistro());                  
                                    if( a == ident){
                                    	int pedido=Integer.parseInt(jtfQuant.getText());
                                    	int disp=(produtos.get(i).getQuantidade());
                                    	if(pedido<disp) {
                                    		produtos.get(i).setVenda("-1");
                                    		int resul = disp-pedido;
                                    		produtos.get(i).setQuantidade(resul);
                                    		produtos.get(i).setQuantidadeVenda(pedido);
                                    		jtfId.setText("");
                                    		jtfQuant.setText("");
                                    		jtfInfo.setText("Venda Realizada");
                                    	}
                                    	else {
                                        jtfInfo.setText("Sem produtos");
                                        jtfId.setText("");
                                        jtfQuant.setText("");
                                    	}
                                    }
                                    else{
                                        jtfInfo.setText("ID incorreto");
                                    }
                                    i = i+1;
                                }
			}
		}
	}
}