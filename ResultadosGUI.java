import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ResultadosGUI extends JFrame implements ActionListener {

    private JButton jButton1;
    private JLabel tituloLabel;
    private JLabel ganadorLabel;
    private JLabel propuestaLabel;
    private JLabel partidoLabel;
    private JLabel ciudadesLabel;
    private JTextArea ganadorTextArea;
    private JTextArea propuestaTextArea;
    private JTextArea partidoTextArea;
    private JTextArea ciudadesTextArea;
    private GUI gui;

    public ResultadosGUI(GUI gui) {
        this.gui = gui;
        initComponents();
        mostrarResultados();
    }

    public void initComponents() {
        setTitle("Resultados de la Elección");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setVisible(true);

        // Inicializar etiquetas
        tituloLabel = new JLabel("RESULTADOS DE LA ELECCIÓN");
        ganadorLabel = new JLabel("1. Candidato ganador:");
        propuestaLabel = new JLabel("2. Propuesta del candidato ganador:");
        partidoLabel = new JLabel("3. Partido con más candidatos inscritos:");
        ciudadesLabel = new JLabel("4. Top 3 de las ciudades con menos candidatos:");

        // Configurar las áreas de texto como de solo lectura
        ganadorTextArea = new JTextArea(5, 20);
        propuestaTextArea = new JTextArea(10, 20);
        partidoTextArea = new JTextArea(5, 20);
        ciudadesTextArea = new JTextArea(10, 20);

        ganadorTextArea.setEditable(false);
        propuestaTextArea.setEditable(false);
        partidoTextArea.setEditable(false);
        ciudadesTextArea.setEditable(false);

        // Botón "atras"
        jButton1 = new JButton("atras");
        jButton1.addActionListener(this);

        // Crear un panel para organizar los componentes
        JPanel panel = new JPanel();

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addComponent(tituloLabel)
                .addComponent(ganadorLabel)
                .addComponent(ganadorTextArea)
                .addComponent(propuestaLabel)
                .addComponent(propuestaTextArea)
                .addComponent(partidoLabel)
                .addComponent(partidoTextArea)
                .addComponent(ciudadesLabel)
                .addComponent(ciudadesTextArea)
                .addComponent(jButton1)
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(tituloLabel)
                .addComponent(ganadorLabel)
                .addComponent(ganadorTextArea)
                .addComponent(propuestaLabel)
                .addComponent(propuestaTextArea)
                .addComponent(partidoLabel)
                .addComponent(partidoTextArea)
                .addComponent(ciudadesLabel)
                .addComponent(ciudadesTextArea)
                .addComponent(jButton1)
        );

        setContentPane(panel);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton1) {
            GUI ventana = new GUI();
            ventana.setVisible(true);
            dispose();
        }
    }

    private void mostrarResultados() {
        Candidato ganador = gui.obtenerCandidatoGanador();
        if (ganador != null) {
            ganadorTextArea.setText("Nombre: " + ganador.getNombre() + "\nCédula: " + ganador.getCedula());
            propuestaTextArea.setText(gui.obtenerPropuestaCandidatoGanador());
        } else {
            ganadorTextArea.setText("No hay candidato ganador");
            propuestaTextArea.setText("");
        }

        Partido partidoConMasCandidatos = gui.obtenerPartidoConMasCandidatos();
        if (partidoConMasCandidatos != null) {
            partidoTextArea.setText(partidoConMasCandidatos.toString());
        } else {
            partidoTextArea.setText("No hay partido con más candidatos");
        }

        List<Ciudad> top3Ciudades = gui.obtenerTop3CiudadesMenosCandidatos();
        if (!top3Ciudades.isEmpty()) {
            StringBuilder ciudadesText = new StringBuilder();
            for (Ciudad ciudad : top3Ciudades) {
                ciudadesText.append(ciudad).append("\n");
            }
            ciudadesTextArea.setText(ciudadesText.toString());
        } else {
            ciudadesTextArea.setText("No hay ciudades con menos candidatos");
        }
    }


    
    public static void main(String args[]) {
        GUI gui = new GUI();
        new ResultadosGUI(gui);
    }
}
