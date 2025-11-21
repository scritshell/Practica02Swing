/*
* Proyecto: swing_p02_CsibiSebastian
* Paquete: vista
* Archivo: PanelImagen.java
* Autor/a: Sebastian Csibi
* Fecha: 21 oct 2025 17:45:10
*
* Descripción:
* [La clase PanelImagen que dibuja la imagen de la taza de Java y permite usarla como el icono en los cuadros de diálogo.
*
*
* Licencia:
* [Todos los derechos reservados]
*/
package vista;

import javax.swing.*;
import java.awt.*;

/**
 * PanelImagen: panel decorativo que contiene un título
 * y la imagen de la taza de Java, con borde y fondo personalizado.
 */
public class PanelImagen extends JPanel {
	/** la imagen del icono de java. */
    private JLabel etiquetaImagen;
    
    /** Etiqueta de texto con el título */
    private JLabel etiquetaTitulo;
    
    /** Icono con la imagen de la taza de java */
    private ImageIcon iconoJava;

    /**
     * Constructor que inicializa el panel con título y imagen
     */
    public PanelImagen() {
        this.setLayout(null);
        this.setBackground(new Color(240, 240, 240));

        /* Carga la imagen como ImageIcon */
        iconoJava = new ImageIcon(getClass().getResource("/recursos/icono.png"));

        /* Título */
        etiquetaTitulo = new JLabel("Aplicación Java", SwingConstants.CENTER);
        etiquetaTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        etiquetaTitulo.setForeground(Color.BLUE);
        etiquetaTitulo.setBounds(140, 10, 220, 30);
        this.add(etiquetaTitulo);

        /* Imagen de la taza */
        etiquetaImagen = new JLabel(iconoJava);
        etiquetaImagen.setBounds(180, 60, 128, 128);
        this.add(etiquetaImagen);
    }

    /**
     * Devuelve el icono ya cargado para usar en los cuadros de diálogo
     * @return icono de la taza de Java
     */
    public ImageIcon getIcono() {
        return iconoJava;
    }
}