package programacionPOO;

import javax.swing.JOptionPane;

public class Modelos {
    public static void main(String[]args){

        ComponentesCompu DELL = new ComponentesCompu();
        ComponentesCompu MAC = new ComponentesCompu();

        JOptionPane.showMessageDialog(null,"La laptop DELL sus caracteristicas son: \n"+
                DELL.CPU +" \n" +
                DELL.RAM +" \n" +
                DELL.TarjetaMadre+ " \n" +
                DELL.DiscoDuro+ " \n"+
                DELL.Grafica);

        JOptionPane.showMessageDialog(null,"La laptop MAC sus caracteristicas son: \n"+
                MAC.CPU +" \n" +
                MAC.RAM+" \n" +
                MAC.TarjetaMadre+ " \n" +
                MAC.DiscoDuro+ " \n");

    }
}
