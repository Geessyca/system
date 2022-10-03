package SistemaGrafica;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {
    JButton CC, Sair,MostrarServicos, VenderServiços,MostrarServicosVendidos;
    Vector <Servicos> servicos = new Vector<Servicos>();
    NovoServico v = new NovoServico(this);
    public Main(){
        getContentPane().setLayout(null);
        setTitle("Principal");
        Handler objeto = new Handler();

        //Parte dos botoes
        MostrarServicos = new JButton("Mostrar serviços");
        MostrarServicos.setBounds(10,10,250,30);
        MostrarServicos.addActionListener(objeto);
        add(MostrarServicos);
        MostrarServicosVendidos = new JButton("Mostrar serviços vendidos");
        MostrarServicosVendidos.setBounds(10,40,250,30);
        MostrarServicosVendidos.addActionListener(objeto);
        add(MostrarServicosVendidos);
        VenderServiços = new JButton("Cadastrar venda");
        VenderServiços.setBounds(10,70,250,30);
        VenderServiços.addActionListener(objeto);
        add(VenderServiços);
        CC = new JButton("Cadastrar serviços");
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
            if(e.getSource()==VenderServiços) {
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
