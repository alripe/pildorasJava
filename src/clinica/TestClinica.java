package clinica;

import javax.swing.JOptionPane;

public class TestClinica  {
    
    public static void main(String args[]){
       
        Doctor doc1 = new Doctor();


        
        doc1.setRut(JOptionPane.showInputDialog("¿Cual es tu rut?"));
        doc1.setNombre(JOptionPane.showInputDialog("¿Cual es tu nombre?"));
        doc1.setApellido(JOptionPane.showInputDialog("¿Cual es tu apellido?"));
        doc1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("¿Cual es tu edad?")));
        doc1.setEspecialidad(JOptionPane.showInputDialog("¿Cual es tu especialidad?"));
        doc1.setTurno(Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto dura tu turno?")));


        
        
        doc1.mostrarDatosDoctor();
        
    }
}
