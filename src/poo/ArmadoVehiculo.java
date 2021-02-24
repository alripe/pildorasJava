package poo;

import javax.swing.*;

public class ArmadoVehiculo {

    public static void main(String[] args) {

        //objetos----------------------------------------------------------------------------------
        chasisVehiculo coche1 = new chasisVehiculo();
        Furgoneta coche2 = new Furgoneta(150,4);
        Furgoneta2021 coche2021 = new Furgoneta2021(true);

        //chasisCoche
        coche1.estableceColor("rojo");
        coche1.tipoAsiento("si");
        coche1.climatizadorCarro("no");
        coche1.PesoCarroTotal();
        //Furgoneta--------------------------------------------------------------------------------
        coche2.estableceColor("blanco");
        coche2.tipoAsiento("no");
        coche2.climatizadorCarro("si");
        coche2.PesoCarroTotal();
        //furgoneta---------------------------------------------------------------------------------
        //coche2021

        System.out.println(coche1.dimeCaracteristicas());
        System.out.println(coche1.dimeColor());
        System.out.println(coche1.muestraAsiento());
        System.out.println(coche1.muestraClimatizador());
        System.out.println(coche1.muestraPesoCarro());
        System.out.println();
        System.out.println(coche2.dimeCaracteristicas());
        System.out.println(coche2.dimeColor());
        System.out.println(coche2.muestraAsiento());
        System.out.println(coche2.muestraClimatizador());
        System.out.println(coche2.mustraCapacidad());
        System.out.println(coche2.muestraPlazasExtra());
        System.out.println(coche2.muestraPesoCarro());




    }

}