package jcombomax2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Vent
 */
public class JComboMax2 extends JFrame{
    JComboBox lista;
        String cidades[] = {"Rio de Janeiro", "São Paulo", "Minas Gerais", "Espírito Santo", "Bahia", "Pernambuco", "Rio de Janeiro do Sul", "Acre"};
    JButton exibir;
    JLabel rotulo;
    public JComboMax2(){
        super("Exemplo de JComboMax");
        Container tela = getContentPane();
        setLayout(null);
        exibir = new JButton("Exibir");
        rotulo = new JLabel("");
        lista = new JComboBox(cidades);
        lista.setEditable(true);
        lista.setMaximumRowCount(5);
        lista.setBounds(50,50,150,30);
        exibir.setBounds(270,50,100,30);
        rotulo.setBounds(50,150,200,30);
        exibir.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            rotulo.setText("O estado é: "+lista.getSelectedItem());
            }});
        tela.add(lista);
        tela.add(exibir);
        tela.add(rotulo);
        setSize(400, 250);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JComboMax2 app = new JComboMax2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// TODO code application logic here
    }
    
}
