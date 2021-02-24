package poo;

public class Furgoneta extends chasisVehiculo {

    private int capacidadCarga;

    private int plazasExtra;

    public Furgoneta(int capacidadCarga, int plazasExtra){
        super();
        this.capacidadCarga=capacidadCarga;
        this.plazasExtra=plazasExtra;
    }

    public Furgoneta(){
    }

    public String  mustraCapacidad(){
        return "La capaciadad extra es "  + capacidadCarga;
    }

    public String muestraPlazasExtra(){
        return " Las plazas extra son " + plazasExtra;
    }
}
