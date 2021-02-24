package poo;

public class Furgoneta2021 extends Furgoneta {

    public Furgoneta2021(boolean pantallaTactil) {
        super();
        this.pantallaTactil = pantallaTactil ;
    }

    public String mostrarDatosFurgoneta(){
        return "La futgoneta tiene pantalla tactil" + pantallaTactil;
    }

    private boolean pantallaTactil;
}
