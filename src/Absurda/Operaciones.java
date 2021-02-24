package Absurda;
import javax.swing.JOptionPane;
import staticos.Operaciones.*;

public class Operaciones {
    public static void main(String []args){

        NumCero numeroCero = new NumCero();
        NumUno NumeroUno = new NumUno();
        NumeroUno.setUno();
        NumTres NumeroTres = new NumTres();
        NumCuatro NumeroCuatro = new NumCuatro();
        NumCinco NumeroCinco =  new NumCinco();
        NumCinco NumeroCincoDouble =  new NumCinco();
        NumSeis NumeroSeis =new NumSeis();
        NumSiete NumeroSiste =new NumSiete();
        NumOcho NumeroOcho =new NumOcho();
        NumNueve NumeroNueve =new NumNueve();


        JOptionPane.showMessageDialog(null,staticos.Operaciones.suma(5,6));
    }
}
