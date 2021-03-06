package lovivido;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Portatil
 */
public class LoVividoMethods {

    String name;
    String age;

    int month;
    int day;
    int hour;
    int year;

    public void register() {

        name = JOptionPane.showInputDialog("Escriba su nombre: ");
        age = JOptionPane.showInputDialog("Escriba su edad: ");

        year = Integer.parseInt(age);

        month = (year * 12);
        day = (year * 365);
        hour = (day * 24);
    }

    public void show() {
        JOptionPane.showMessageDialog(null, "Meses: " + month, "Numero de meses vividos de " + name, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + day, "Numero de días vividos de " + name, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + hour, "Numero de horas vividos de " + name, JOptionPane.INFORMATION_MESSAGE);
    }
}
