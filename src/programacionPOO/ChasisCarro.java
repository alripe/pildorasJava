package programacionPOO;

public class ChasisCarro { //clase private int ruedas;

    public ChasisCarro(int largo, int ancho, int motor, int ruedas) { //metodo constructor
        this.largo = largo;
        this.ancho = ancho;
        this.motor = motor;
        this.ruedas = ruedas;
    }

    public void setColor(String seleccionaColor) {
        color = seleccionaColor;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public boolean getManual() {
        return manual;
    }

    public boolean getAutomatico() {
        return automatico;
    }

    public String getColor() {
        return color;
    }

    public String getMuestraInformacion(){
        return "La plataforma tiene un ancho de: "+ancho+
        "\nun largo de: "+largo+
        "\nun motor de: "+ motor+
        "\ntiene: "+ruedas+
        "\ntiene caja automatica " +getAutomatico()+
        "\ntiene caja manual " +getManual()+
        "\ntiene un color " + getColor();
    }
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private String color;
    private boolean manual;
    private boolean automatico;
}




//setters definidores modificar el valor de una variable o propiedad de un objeto void


//getters captadores devolver el valor de las propiedades de los objetos + return