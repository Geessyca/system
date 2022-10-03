package SistemaGrafica;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {
    JButton CC, Sair,MostrarServicos, VenderServi�os,MostrarServicosVendidos;
    Vector <Servicos> servicos = new Vector<Servicos>();
    NovoServico v = new NovoServico(this);
    public Main(){
        getContentPane().setLayout(null);
        setTitle("Principal");
        Handler objeto = new Handler();

        //Parte dos botoes
        MostrarServicos = new JButton("Mostrar servi�os");
        MostrarServicos.setBounds(10,10,250,30);
        MostrarServicos.addActionListener(objeto);
        add(MostrarServicos);
        MostrarServicosVendidos = new JButton("Mostrar servi�os vendidos");
        MostrarServicosVendidos.setBounds(10,40,250,30);
        MostrarServicosVendidos.addActionListener(objeto);
        add(MostrarServicosVendidos);
        VenderServi�os = new JButton("Cadastrar venda");
        VenderServi�os.setBounds(10,70,250,30);
        VenderServi�os.addActionListener(objeto);
        add(VenderServi�os);
        CC = new JButton("Cadastrar servi�os");
        CC.setBounds(10,100,250,30);
        CC.addActionListener(objeto);
        add(CC);
        Sair = new JButton("Sair");
        Sair.setBounds(10,130,250,30);
        Sair.addActionListener(objeto);
        add(Sair);
        
        setBounds(100,100,300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==CC){
                    v.setVisible(true);
            }
            if(e.getSource()==Sair) {
                    setVisible(false);
            }
            if(e.getSource()==VenderServi�os) {
                    new VenderServicos(servicos);
            }
            if(e.getSource()==MostrarServicos) {
                    new ExibirServicos(servicos);
            }
            if(e.getSource()==MostrarServicosVendidos) {
                    new MostrarServicosVendidos(servicos);
            }
        }
    }
    public static void main(String[] args) {
        new Main();
    }
    public void cadastra(Servicos c){
            servicos.add(c);
    }
}
