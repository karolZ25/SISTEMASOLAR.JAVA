import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainApp extends JFrame {
    private JTextField nombreUsuarioField;
    private JTextField cuerpoCelesteField;
    private Usuario usuario;

    public MainApp() {
        setTitle("Manual del Sistema Solar ⋆｡‧˚ʚ☀️ɞ˚‧｡⋆");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();

        // Inicializar el usuario con un historial vacío
        usuario = new Usuario();
    }

    private void initUI() {
        BackgroundPanel panel = new BackgroundPanel("imagenes/fondo1.jpg");
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel bienvenidaLabel = new JLabel("Bienvenido al Manual del Sistema Solar 🔭🌌");
        bienvenidaLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        bienvenidaLabel.setForeground(Color.WHITE);
        bienvenidaLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel instruccionLabel = new JLabel("Por favor, ingresa tu nombre completo:");
        instruccionLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        instruccionLabel.setForeground(Color.WHITE);
        instruccionLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        nombreUsuarioField = new JTextField();
        nombreUsuarioField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        JLabel cuerpoCelesteLabel = new JLabel("¿Qué cuerpo celeste te interesa?");
        cuerpoCelesteLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        cuerpoCelesteLabel.setForeground(Color.WHITE);
        cuerpoCelesteLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        cuerpoCelesteField = new JTextField();
        cuerpoCelesteField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        JButton buscarButton = new JButton("Buscar");
        buscarButton.setAlignmentX(Component.LEFT_ALIGNMENT); 
        buscarButton.setBackground(new Color(91, 81, 107));
        buscarButton.setForeground(Color.WHITE);
        buscarButton.addActionListener(e -> {
            String cuerpoCeleste = cuerpoCelesteField.getText();
            usuario.agregarBusqueda(cuerpoCeleste);
            abrirInformacion(cuerpoCeleste);
        });

        JButton historialButton = new JButton("Historial");
        historialButton.setAlignmentX(Component.LEFT_ALIGNMENT); 
        historialButton.setBackground(new Color(91, 81, 107));
        historialButton.setForeground(Color.WHITE);
        historialButton.addActionListener(e -> mostrarHistorial());


        panel.add(bienvenidaLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(instruccionLabel);
        panel.add(nombreUsuarioField);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(cuerpoCelesteLabel);
        panel.add(cuerpoCelesteField);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(buscarButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(historialButton);

        add(panel);
    }

    private void abrirInformacion(String cuerpoCeleste) {
        CuerpoCeleste data = buscarCuerpoCeleste(cuerpoCeleste);
        if (data == null) {
            JOptionPane.showMessageDialog(this, "No se encontró información sobre " + cuerpoCeleste);
            return;
        }

        JFrame infoFrame = new JFrame("Información de " + data.getNombre());
        infoFrame.setSize(600, 500);
        infoFrame.setLayout(new BorderLayout());
        infoFrame.getContentPane().setBackground(Color.BLACK);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPanel.setBackground(Color.BLACK);

        JLabel nombreLabel = new JLabel("Nombre: " + data.getNombre());
        nombreLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        nombreLabel.setForeground(Color.WHITE);
        nombreLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JTextArea descripcionArea = crearTextoArea("Descripción: " + data.getDescripcion());
        JTextArea adicionalArea = crearTextoArea(data.obtenerInformacionAdicional());

        ImageIcon icon = new ImageIcon(data.getImagenPath());
        Image originalImage = icon.getImage();
        int imageWidth = 300;
        int imageHeight = (int) ((double) originalImage.getHeight(null) / originalImage.getWidth(null) * imageWidth);
        Image scaledImage = originalImage.getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);

        JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        contentPanel.add(nombreLabel);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPanel.add(descripcionArea);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPanel.add(adicionalArea);

        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getViewport().setBackground(Color.BLACK);

        JButton volverButton = new JButton("Volver a la página principal");
        volverButton.addActionListener(e -> infoFrame.dispose());
        volverButton.setBackground(new Color(91, 81, 107));
        volverButton.setForeground(Color.WHITE);

        infoFrame.add(imageLabel, BorderLayout.NORTH);
        infoFrame.add(scrollPane, BorderLayout.CENTER);
        infoFrame.add(volverButton, BorderLayout.SOUTH);

        infoFrame.setVisible(true);
    }

    private JTextArea crearTextoArea(String texto) {
        JTextArea textArea = new JTextArea(texto);
        textArea.setFont(new Font("SansSerif", Font.PLAIN, 14));
        textArea.setForeground(Color.WHITE);
        textArea.setBackground(Color.BLACK);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        return textArea;
    }

    private void mostrarHistorial() {
        JFrame frameHistorial = new JFrame("Historial de Búsquedas");
        frameHistorial.setSize(300, 200);
        frameHistorial.setLayout(new BorderLayout());

        JTextArea areaHistorial = new JTextArea();
        areaHistorial.setEditable(false);
        areaHistorial.setForeground(Color.WHITE); 
        areaHistorial.setBackground(Color.BLACK); 

        for (String busqueda : usuario.getHistorialBusquedas()) {
            areaHistorial.append(busqueda + "\n");
        }

        frameHistorial.add(new JScrollPane(areaHistorial), BorderLayout.CENTER);
        frameHistorial.setVisible(true);
    }

    private CuerpoCeleste buscarCuerpoCeleste(String nombre) {
        List<CuerpoCeleste> cuerposCelestes = DatosCuerposCelestes.obtenerCuerposCelestes();
        for (CuerpoCeleste cuerpo : cuerposCelestes) {
            if (cuerpo.getNombre().equalsIgnoreCase(nombre)) {
                return cuerpo;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainApp app = new MainApp();
            app.setVisible(true);
        });
    }
}

class Usuario {
    private List<String> historialBusquedas;

    public Usuario() {
        historialBusquedas = new ArrayList<>();
    }

    public void agregarBusqueda(String busqueda) {
        historialBusquedas.add(busqueda);
    }

    public List<String> getHistorialBusquedas() {
        return historialBusquedas;
    }
}