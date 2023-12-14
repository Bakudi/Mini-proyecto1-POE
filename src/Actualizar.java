import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Actualizar extends JPanel implements ActionListener {

    private GUI gui;
    private List<Candidato> candidatos;

    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JTextField jTextField1;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;

    public Actualizar(GUI gui, List<Candidato> candidatos) {
        this.gui = gui;
        this.candidatos = candidatos;
        initComponents();
    }

    private void initComponents() {
        JFrame frame = new JFrame("actualizar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setVisible(true);

        jComboBox1 = new JComboBox<>();
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jComboBox2 = new JComboBox<>();

        for (Candidato candidato : candidatos) {
            jComboBox2.addItem(candidato.getNombre());
        }

        jComboBox2.addActionListener(this::jComboBox2ActionPerformed);

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{"Nombre", "Cédula", "Origen", "Derecha", "Partido", "Promesas"}));
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);

        jLabel1.setText("Seleccione el atributo a editar");

        jButton1.setText("Atrás");
        jButton1.addActionListener(this);

        jButton2.setText("Actualizar");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jLabel2.setText("Escriba el nuevo dato para el candidato");

        jLabel3.setText("Actualizar valor de candidato");

        jLabel4.setText("Seleccione el candidato");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jTextField1)
                                                                        .addComponent(jComboBox2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(92, 92, 92))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(181, 181, 181)
                                                .addComponent(jLabel3)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jButton1)
                                .addGap(30, 30, 30)
                                .addComponent(jButton2)
                                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(55, 55, 55))
        );

        frame.add(this);
        frame.setVisible(true);
    }

    public void jButton2ActionPerformed(ActionEvent evt) {
        int selectedIndex1 = jComboBox1.getSelectedIndex();
        int selectedIndex2 = jComboBox2.getSelectedIndex();

        if (selectedIndex1 >= 0 && selectedIndex2 >= 0 && selectedIndex2 < candidatos.size()) {
            Candidato candidato = candidatos.get(selectedIndex2);

            String atributo = (String) jComboBox1.getSelectedItem();
            String nuevoValor = jTextField1.getText();

            switch (atributo) {
                case "Nombre":
                    candidato.setNombre(nuevoValor);
                    break;
                case "Cédula":
                    candidato.setCedula(Integer.parseInt(nuevoValor));
                    break;
                case "Origen":
                    candidato.setOrigen(obtenerCiudad(nuevoValor));
                    break;
                case "Derecha":
                    candidato.setDerecha(Boolean.parseBoolean(nuevoValor));
                    break;
                case "Partido":
                    candidato.setPartidoc(obtenerPartidoDesdeTexto(nuevoValor));
                    break;
                case "Promesas":
                    candidato.setPromesas(nuevoValor);
                    break;
            }

            JOptionPane.showMessageDialog(this, "Candidato actualizado correctamente.");
        }
    }

    public void jComboBox2ActionPerformed(ActionEvent evt) {
        int selectedIndex = jComboBox2.getSelectedIndex();

        if (selectedIndex >= 0 && selectedIndex < candidatos.size()) {
            Candidato candidato = candidatos.get(selectedIndex);
            jTextField1.setText(candidato.getNombre());
        }
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton1) {
            GUI ventana = new GUI();
            ventana.setVisible(true);
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
        }
    }

    private Ciudad obtenerCiudad(String textoCiudad) {
        return Ciudad.valueOf(textoCiudad.toUpperCase());
    }

    private Partido obtenerPartidoDesdeTexto(String textoPartido) {
        return Partido.valueOf(textoPartido.toUpperCase());
    }

    public static void main(String[] args) throws Exception {
        List<Candidato> listaCandidatos = new ArrayList<>();
        GUI ventana = new GUI();
        new Actualizar(ventana, listaCandidatos);
    }
}

