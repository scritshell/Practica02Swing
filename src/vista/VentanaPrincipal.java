/*
* Proyecto: swing_p02_CsibiSebastian
* Paquete: vista
* Archivo: VentanaPrincipal.java
* Autor/a: Sebastian Csibi
* Fecha: 21 oct 2025 17:44:28
*
* Descripción:
* [La clase VentanaPrincipal, la cual gestiona los cuadros de diálogo secuenciales]
*
* Licencia:
* [Todos los derechos reservados]
*/
package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
	/** Etiqueta principal donde se muestra el texto resultante de las selecciones del usuario. */
    private JLabel etiquetaResultado;
    
    /** Icono personalizado de la taza de Java, utilizado en los cuadros de diálogo. */
    private ImageIcon iconoJava;
    
    /**
     * Constructor de la clase VentanaPrincipal!
     * 
     * Este constructor, configura la ventana principal, inicializa los componentes,
     * crea el panel con la imagen y ejecuta la secuencia de diálogos
     * 
     */
    
    public VentanaPrincipal() {
        super("Swing P02 - JOptionPane");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        /* Crea panel con imagen decorativa */
        PanelImagen panel = new PanelImagen();
        iconoJava = panel.getIcono();
        /* Crea una etiqueta donde se mostrará el resultado de la selección del usuario */
        etiquetaResultado = new JLabel("", SwingConstants.CENTER);
        etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 18));
        etiquetaResultado.setBounds(50, 100, 400, 50);
        this.add(etiquetaResultado);
        /* Añade el panel al marco principal */
        panel.setBounds(200, 10, 100, 80);
        this.add(panel);
        /* Ejecuta los cuadros de diálogo.*/
        ejecutarSecuencia();

        this.setVisible(true);
    }
    
    
    /**
     * Este método, ejecuta la secuencia de cuadros de diálogo utilizando JOptionPane
     *
     * Este método:
     *  Muestra un mensaje de advertencia al usuario.
     *  Solicita su nombre mediante un cuadro de entrada.
     *  Saluda al usuario con un mensaje personalizado.
     *  Ofrece tres opciones para seleccionar.
     *  Confirma si el usuario está de acuerdo con su elección
     *
     */
    
    private void ejecutarSecuencia() {
    	
    	/* El mensaje de advertencia con icono personalizado */
        JOptionPane.showMessageDialog(this, "Estás ejecutando una aplicación Java.", "Advertencia", JOptionPane.WARNING_MESSAGE, iconoJava);
       
        /* Se le pregunta al usuario su nombre */
        String nombre = JOptionPane.showInputDialog(this, "¿Cuál es tu nombre?");
        JOptionPane.showMessageDialog(this, "¡Hola " + nombre + "!", "Saludo", JOptionPane.INFORMATION_MESSAGE);
        
        /* Se le da al usuario 3 opciones por elegir */
        String[] opciones = {"Opción A", "Opción B", "Opción C"};
        int seleccion = JOptionPane.showOptionDialog(this, "Elige una de las siguientes opciones:", "Selección de opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, iconoJava, opciones, opciones[0]);

        String textoSeleccion = switch (seleccion) {
            case 0 -> "Has elegido la Opción A.";
            case 1 -> "Has elegido la Opción B.";
            case 2 -> "Has elegido la Opción C.";
            default -> "No has seleccionado ninguna opción.";
        };

        etiquetaResultado.setText(textoSeleccion);
        etiquetaResultado.repaint();
        
        /* Se confirma la seleccion del usuario 	*/
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás de acuerdo con tu selección?", "Confirmar selección", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.NO_OPTION) {
            etiquetaResultado.setText("");
        }
    }
}