import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarVotos extends JFrame implements ActionListener {

    private JButton agregarButton;
    private JButton volverButton;
    private JButton resultadoButton;
    private JLabel tituloLabel;
    private JLabel candidatoLabel;
    private JLabel votosLabel;
    private JComboBox<String> candidatoComboBox;
    private JTextField votosTextField;

    public AgregarVotos() {
        initComponents();
    }

    public void initComponents() {
        setTitle("Agregar Votos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setVisible(true);

        // Inicializar etiquetas
        tituloLabel = new JLabel("AGREGAR VOTOS");
        candidatoLabel = new JLabel("Candidato:");
        votosLabel = new JLabel("Votos:");

        // Crear un ComboBox para seleccionar candidato
        String[] candidatos = { "Candidato 1", "Candidato 2", "Candidato 3" };
        candidatoComboBox = new JComboBox<>(candidatos);

        // Campo de texto para ingresar la cantidad de votos
        votosTextField = new JTextField(10);

        // Botón para agregar votos
        agregarButton = new JButton("Agregar Votos");
        agregarButton.addActionListener(this);

        // Botón para volver atrás
        volverButton = new JButton("Volver");
        volverButton.addActionListener(this);

        // Botón para ver los resultados
        resultadoButton = new JButton("Resultados");
        resultadoButton.addActionListener(this);


        // Crear un panel para organizar los componentes
        JPanel panel = new JPanel();

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addComponent(tituloLabel)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(candidatoLabel)
                    .addComponent(candidatoComboBox)
                )
                .addGroup(layout.createSequentialGroup()
                    .addComponent(votosLabel)
                    .addComponent(votosTextField)
                )
                .addGroup(layout.createSequentialGroup()
                    .addComponent(agregarButton)
                    .addComponent(volverButton)
                    .addComponent(resultadoButton)
                )
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(tituloLabel)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(candidatoLabel)
                    .addComponent(candidatoComboBox)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(votosLabel)
                    .addComponent(votosTextField)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarButton)
                    .addComponent(volverButton)
                    .addComponent(resultadoButton)
                )
        );

        setContentPane(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == agregarButton) {
            
        } else if (e.getSource() == volverButton) {
            GUI ventana = new GUI();
            ventana.setVisible(true);
            this.dispose();
        } else if (e.getSource() == resultadoButton) {
            // Abrir una nueva ventana para mostrar los resultados
            ResultadosGUI resultados = new ResultadosGUI();
            resultados.setVisible(true);
            this.dispose();
        }
    }
    public static void main(String args[]) {
        new AgregarVotos();
        }
}