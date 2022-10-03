package SistemaGrafica;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
public class MostrarServicosVendidos extends JDialog{
	JButton jbtFechar;
	JTextArea jtaTDados;
	Vector<Servicos> servicos;
        JLabel jlnometela;
	public MostrarServicosVendidos(Vector<Servicos> v) {
		servicos = v;
		getContentPane().setLayout(null);
		setTitle("Dados");
		Handler obj = new Handler(); 
                
                //textlabel
                jlnometela = new JLabel();
                jlnometela.setText("Todos os serviços ja vendidos:");
                jlnometela.setBounds(150, 40, 300, 100);
                add(jlnometela);
                
                //Botoes
		jbtFechar = new JButton("Voltar");
		jbtFechar.setBounds(200, 10, 150, 30);
		jbtFechar.addActionListener(obj);
		add(jbtFechar);
		jtaTDados = new JTextArea();
		jtaTDados.setBounds(50, 100, 600, 300);
		jtaTDados.setText(dados());
		add(jtaTDados);
		setBounds(120,120,700,500);
		setVisible(true);
		setModal(true);
	}

	public String dados() {
		String p = "";
		for(int i=0;i<servicos.size();i++) {
                    if(servicos.get(i).getVenda() != "1"){
                        p = p + "\n" + servicos.get(i).todosDadosVenda();
                    }
			
		}
		return p;
	}
	
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == jbtFechar) {
				setVisible(false);
			}
		}
	}
}

