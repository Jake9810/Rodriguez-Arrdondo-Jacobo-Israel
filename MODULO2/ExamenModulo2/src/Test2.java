import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Test2 {
    public static void main(String[] args) {
        // TODO: Crea una instancia llamada `frame` de la clase correcta
        JFrame frame=new JFrame();
        JButton button = new JButton(" Pulsame :| ");
        // TODO: Corrige las XXXX por el código correcto
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Ajusta el texto del botón a "Gracias :D"
                button.setText(" Gracias :D ");
            }
        });

        // TODO: Agrega el botón a la instancia `frame`
        frame.setTitle("Hola mundo");
        frame.setSize(200, 200);
        frame.add(button);
        frame.setVisible(true);
    }
}