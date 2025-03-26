import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcoAplicacion extends JFrame {

    // Sirve para crear un cuadro de texto

    private JTextField cadroTexto;

    public EcoAplicacion() {

        super();

        // Gracias a esta funcion ya añadida desde la propia libreria podremos añadir un ttulo al recuadro

        setTitle("Eco Aplicación");


        // Sirve para agrupar los componentes de la interfaz grafica, por lo caul sirve para organizar y contener otros componentes y estilos asi mejorando la organizacion visual de tu aplicacion

        JComponent crearboton = crearboton();
        JComponent crearPanelCadro = crearPanelCadro();
        cadroTexto = (JTextField) crearPanelCadro;

        // El JSplitPana permite al usuario arrastrar el divisor para cambiar el tamaño de las areas, lo qie porporciona una interfaz mas segura

        JSplitPane panelPrincipal = new JSplitPane(JSplitPane.VERTICAL_SPLIT , crearboton, crearPanelCadro); //El vertical split sirve para dividir la ventada de arriba hacia abajo
        getContentPane().add(panelPrincipal);
        pack();
        setVisible(true);

    }

    private JComponent crearboton (){

        JPanel botoneira2 = new JPanel();
        JButton btnHola = new JButton("klk"); // Creacion del boton con su repectivo texto

        btnHola.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        System.out.println("Hola"); // Imprime en consola cuando se presiona el boton
                        // Aqui podria ir codigo para hacer algo con el texto del cuadro de texto
                        cadroTexto =

                    }
                });

        botoneira2.add(btnHola);
        return botoneira2;

    }
    private JComponent crearPanelCadro(){

        JTextField txtCadro = new JTextField(); // Objeto para manejar cuadros de texto para una linea

        return txtCadro;
    }
}
