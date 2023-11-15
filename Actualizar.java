

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Actualizar extends JPanel implements ActionListener {
    private GUI gui;
       
        public Actualizar(GUI gui, List<Candidato> candidatos) {
            this.gui = gui;
            this.candidatos = candidatos;
            initComponents();
        }

        private List<Candidato> candidatos;

                       
        private void initComponents() {
            JFrame frame = new JFrame("actualizar");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 300);
            frame.setVisible(true);
    
            jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        for (Candidato candidato : candidatos) {
            jComboBox2.addItem(candidato.getNombre());
        }
        jComboBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nombre", "cedula", "origen", "derecha?", "partido", "promesas" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione el atributo a editar");

        jButton1.setText("atras");
        jButton1.addActionListener(this);

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("escriba el nuevo dato para el candidato");

        jTextField1.setText("");

        jLabel3.setText("Actualizar valor de candidato");

        jLabel4.setText("seleccione el candidato");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2)
                        .addGap(107, 107, 107))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jComboBox1, 0, 101, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
        
                if ("Nombre".equals(atributo)) {
                    candidato.setNombre(nuevoValor);
                } else if ("Cédula".equals(atributo)) {
                    candidato.setCedula(Integer.parseInt(nuevoValor));
                } else if ("Origen".equals(atributo)) {
                    candidato.setOrigen(obtenerCiudad(nuevoValor));
                } else if ("Derecha".equals(atributo)) {
                    candidato.setDerecha(Boolean.parseBoolean(nuevoValor));
                } else if ("Partido".equals(atributo)) {
                    candidato.setPartidoc(obtenerPartidoDesdeTexto(nuevoValor));
                } else if ("Promesas".equals(atributo)) {
                    candidato.setPromesas(nuevoValor);
                }
        
                JOptionPane.showMessageDialog(this, "Candidato actualizado correctamente.");
            }
        }

            public void jComboBox2ActionPerformed(ActionEvent evt) {
                int selectedIndex = jComboBox2.getSelectedIndex();
            
                if (selectedIndex >= 0 && selectedIndex < candidatos.size()) {
                    Candidato candidato = candidatos.get(selectedIndex);
                    
                    // Mostrar el nombre del candidato en jTextField1 (esto es un ejemplo, puedes mostrar otros atributos).
                    jTextField1.setText(candidato.getNombre());
                }
            }
    
        private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {}                                                                                
    
    
                       
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JComboBox<String> jComboBox2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JTextField jTextField1;
                        
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jButton1) {
                GUI ventana = new GUI();
           ventana.setVisible(true);
           JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
           frame.dispose();
            }
        }

        private Ciudad obtenerCiudad(String textoCiudad) {
            return Ciudad.valueOf(textoCiudad.toLowerCase()); 
        }
    
        private Partido obtenerPartidoDesdeTexto(String textoPartido) {
            
            return Partido.valueOf(textoPartido.toLowerCase());
        }
        public static void main(String[] args) throws Exception {
            List<Candidato> listaCandidatos = new ArrayList<>();
            GUI ventana = new GUI();
            new Actualizar(ventana,listaCandidatos);
                }
    }



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class Actualizar extends JPanel implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
