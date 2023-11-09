import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.Dimension;



public class Agregarventana extends JPanel implements ActionListener {

    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private GUI gui;

    public Agregarventana(GUI gui,List<Candidato> candidatos) {
        this.gui = gui;
        this.candidatos = candidatos;
        initComponents();
    }
    private List<Candidato> candidatos;

    public void initComponents() {
        JFrame frame = new JFrame("Agregar Ventana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setVisible(true);

        jTextField1 = new JTextField();
        jLabel1 = new JLabel();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();

        jLabel1.setText("Inserte los atributos del candidato");

        jLabel2.setText("Nombre");

        jLabel3.setText("Cedula");

        jLabel4.setText("Origen(ciudad del valle)");

        jLabel5.setText("es de derecha? (true = si , false = no)");

        jLabel6.setText("Partido");

        jLabel7.setText("Promesas");

        jTextField1.setPreferredSize(new Dimension(200,20));
        jTextField2.setPreferredSize(new Dimension(200,20));
        jTextField3.setPreferredSize(new Dimension(200,20));
        jTextField4.setPreferredSize(new Dimension(200,20));
        jTextField5.setPreferredSize(new Dimension(200,20));
        jTextField6.setPreferredSize(new Dimension(200,20));


        jButton1.setText("atras");
        jButton1.addActionListener(this);

        jButton2.setText("guardar");
        jButton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                jButton2ActionPerformed(e);
            }});

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(173, 173, 173)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(169, 169, 169)
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGap(34, 34, 34)))
                    .addContainerGap(177, Short.MAX_VALUE)
        ));
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addGap(23, 23, 23)
                )
        );
        frame.add(this);
        frame.setVisible(true);
    }

    public void jButton2ActionPerformed(ActionEvent evt) {
        if(evt.getSource() == jButton2){
        String Nombre = jTextField1.getText();
            int cedula = Integer.parseInt(jTextField2.getText());
            Ciudad origen = obtenerCiudad(jTextField3.getText());
            Boolean derecha = Boolean.parseBoolean(jTextField4.getText().toLowerCase());
            Partido partido = obtenerPartidoDesdeTexto(jTextField5.getText());
            String promesas = jTextField6.getText();
            int votos = 0;

            Candidato candidato = new Candidato(Nombre,cedula,origen,derecha,partido,promesas,votos);
            candidatos.add(candidato);
            gui.agregarCandidato(candidato);
            
    }
        }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton1) {
            GUI ventana = new GUI();
           ventana.setVisible(true);
           JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
           frame.dispose();
        }}

    private Ciudad obtenerCiudad(String textoCiudad) {
        return Ciudad.valueOf(textoCiudad.toLowerCase());
    }

    private Partido obtenerPartidoDesdeTexto(String textoPartido) {
        return Partido.valueOf(textoPartido.toLowerCase());
    }

    public static void main(String[] args) throws Exception {
        List<Candidato> listaCandidatos = new ArrayList<>();
        GUI ventana = new GUI();
            new Agregarventana(ventana,listaCandidatos);
    }
}
    
