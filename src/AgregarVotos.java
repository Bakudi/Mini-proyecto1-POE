import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AgregarVotos extends JFrame implements ActionListener {

    private GUI gui; 

    public AgregarVotos(GUI gui) {
        this.gui = gui;
        initComponents();
    }

    private JButton agregarButton;
    private JButton volverButton;
    private JButton resultadoButton;
    private JLabel tituloLabel;
    private JLabel candidatoLabel;
    private JLabel votosLabel;
    private JComboBox<Candidato> candidatoComboBox;
    private JTextField votosTextField;

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
        
        candidatoComboBox = new JComboBox<>(gui.getListaCandidatos().toArray(new Candidato[0]));
        
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
        add(candidatoComboBox);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == agregarButton) {
            // Obtener el candidato seleccionado del JComboBox
            Candidato candidatoSeleccionado = (Candidato) candidatoComboBox.getSelectedItem();
    
            // Obtener la cantidad de votos desde el JTextField
            int cantidadVotos = Integer.parseInt(votosTextField.getText());
    
            // Actualizar la cantidad de votos del candidato seleccionado
            candidatoSeleccionado.agregarVotos(cantidadVotos);
        } else if (e.getSource() == volverButton) {
            gui.setVisible(true);
            dispose();
        } else if (e.getSource() == resultadoButton) {
            // Abrir una nueva ventana para mostrar los resultados
            new ResultadosGUI(gui);
            dispose();
        }
    }
    public static void main(String args[]) {
        GUI gui = new GUI();
        new AgregarVotos(gui);
        }
}

