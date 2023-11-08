import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class GUI extends JFrame implements ActionListener {
    ArrayList <Candidato> listaCandidatos = new ArrayList<Candidato>();
    public void agregarCandidato(Candidato candidato) {
        listaCandidatos.add(candidato);
    }

    public List<Candidato> getListaCandidatos() {
        return listaCandidatos;
    }
    private JLabel jLabel1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private Agregarventana agregarventana;

    public GUI() {
        initComponents();
    }

    private void initComponents() {
        setTitle(" GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);

        JPanel panel = new JPanel();

        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();

        jLabel1.setText("Por favor seleccione la opción");

        jButton1.setText("agregar candidato");
        jButton1.addActionListener(this);

        jButton2.setText("actualizar candidato");
        // ActionListener para jButton2

        jButton3.setText("eliminar candidato");
        jButton3.addActionListener(this);

        jButton4.setText("buscar por nombre");
        jButton4.addActionListener(this);

        jButton5.setText("lista de candidatos");
        jButton5.addActionListener(this);

        jButton6.setText("gestión de votos");
        // ActionListener para jButton6

       GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(jLabel1)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                )
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                )
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED) // Espacio entre jLabel1 y botones
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                )
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED) // Espacio entre botones 1-3 y botones 4-6
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                )
        );

        getContentPane().add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton1) {
            Agregarventana newframe = new Agregarventana();
           newframe.setVisible(true);
            this.dispose();
        }
        
        if (e.getSource() == jButton2) {
            Actualizar newframe = new Actualizar();
           newframe.setVisible(true);
            this.dispose();
        }
        if (e.getSource() == jButton3) {
            BORRAR  borrarGUI = new BORRAR();
            borrarGUI.setVisible(true);
            this.dispose();
        } 
        if (e.getSource() == jButton4) {
            BUSCAR  buscarGUI = new BUSCAR();
            buscarGUI.setVisible(true);
            this.dispose();
        } 
        if (e.getSource() == jButton5) {
            LISTAR  listarGUI = new LISTAR();
            listarGUI.setVisible(true);
            this.dispose();
        } 
    }

    

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI gui = new GUI();
                gui.setVisible(true);
            }
        });
    }
}
