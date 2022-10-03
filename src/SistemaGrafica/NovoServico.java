package SistemaGrafica;
import java.awt.event.*;
import javax.swing.*;

public class NovoServico extends JDialog{
    JButton jbtServicosDigitais,jbtFechar1, jbtServicoImpressos,jbtServicosPersonalizados ;
    Main mn;
    ServicoDigital tq;
    ServicosPersonalizados tr;
    ServicosImpressos tc;
    public NovoServico(Main r) {
        this.mn = r;
        getContentPane().setLayout(null);
        Handler obj = new Handler();
        setTitle("Cadastro de serviços");    
        
        tq = new ServicoDigital(this.mn);
        tr = new ServicosPersonalizados(this.mn);
        tc = new ServicosImpressos(this.mn);
        //botoes
        jbtServicosDigitais = new JButton("Serviços Digitais");
        jbtServicosDigitais.setBounds(10,10,250,30);
        jbtServicosDigitais.addActionListener(obj);
        add(jbtServicosDigitais);
        jbtServicoImpressos = new JButton("Serviços Impressos");
        jbtServicoImpressos.setBounds(10,60,250,30);
        jbtServicoImpressos.addActionListener(obj);
        add(jbtServicoImpressos);
        jbtServicosPersonalizados = new JButton("Personalizados");
        jbtServicosPersonalizados.setBounds(10,110,250,30);
        jbtServicosPersonalizados.addActionListener(obj);
        add(jbtServicosPersonalizados);
        jbtFechar1 = new JButton("Voltar");
        jbtFechar1.setBounds(10,340,150,30);
        jbtFechar1.addActionListener(obj);
        add(jbtFechar1);

        setBounds(10,10,400,500);
}
public class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
                if(e.getSource() == jbtServicosDigitais){
                        tq.setVisible(true);
                }
                if(e.getSource() == jbtServicoImpressos){
                        tc.setVisible(true);
                }
                if(e.getSource() == jbtServicosPersonalizados){
                        tr.setVisible(true);
                }
                if(e.getSource() == jbtFechar1){
                        setVisible(false);
                }
        }
}
}