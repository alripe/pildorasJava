package poo;

public class chasisVehiculo {

    private int ruedas;
    private int motor;
    private int pesoPlataforma;
    private int largo;
    private int ancho;
    private String color;
    private int pesoTotal;
    private boolean asientoCarro, climatizadorCarro;

    //metodo cosntructor
    public chasisVehiculo() {

        ruedas=4;
        motor=600;
        pesoPlataforma=500;
        largo=2000;
        ancho=300;
    }

    //metodo para mostrar las caracteristicas del metodo cosntructor del objeto Audi
    public String dimeCaracteristicas() { //GETTER
        return "El vehiculo tiene " + ruedas + " ruedas " + "tiene un motor de " + motor + " cc"
                + " un peso de plataforma de " + pesoPlataforma + " un largo de " + largo/1000 + " metros"
                + " un ancho " + ancho + " cm";
    }//-----------------------------------------------------------


    //metodo para elegir el tipo de color del carro
    public void estableceColor(String tipoColor) { //SETTER
        color=tipoColor;
    }
    public String dimeColor() { //GETTER
        return "El color del automovil es " + color;
    }//-----------------------------------------------------------


    //metodo para elegir si el carro tiene asientos de cuero o no
    public void tipoAsiento(String eligeTipoAsiento) { //SETTER

        if(eligeTipoAsiento.equalsIgnoreCase("si")) {
            asientoCarro=true;
        }else
            asientoCarro=false;
    }
    public String muestraAsiento() { //GETTER

        if(asientoCarro==true) {
            return " El carro tiene asientos de cuero ";
        }else {
            return " El carro tiene asientos de serie ";
        }
    }//-----------------------------------------------------------


    //metodo para elegir si el carro tiene climatizador o no
    public void climatizadorCarro(String eligeClimatizador) {//SETTER
        if(eligeClimatizador.equalsIgnoreCase("si")) {
            climatizadorCarro=true;
        }else {
            climatizadorCarro=false;
        }
    }
    public String muestraClimatizador() {//GETTER
        if(climatizadorCarro==true) {
            return " El carro tiene climatizador ";
        }else {
            return " El carro no cuenta con climatizador";
        }
    }//-----------------------------------------------------------


    //metodo para calcular el peso del carro despues del climatizar y los asientos de cuero
    public void  PesoCarroTotal() {//SETTER
        int pesoCarroceria=500;
        pesoTotal = pesoCarroceria + pesoPlataforma;
        if(asientoCarro==true) {
            pesoTotal= pesoTotal + 50;
        }
        if(climatizadorCarro==true) {
            pesoTotal= pesoTotal + 20;
        }
    }

    public String muestraPesoCarro() {
        return "El peso del carro es " + pesoTotal;
    }
}