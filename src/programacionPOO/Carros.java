package programacionPOO;

public class Carros {
    public static void main(String[]args){

        ChasisCarro chevyHector = new ChasisCarro(4000,1000,1600,5);
        ChasisCarro chevyAlex = new ChasisCarro(3000,500,1800,4);

        chevyHector.setColor("verde");
        chevyHector.setManual(true);
        chevyHector.setAutomatico(false);
        System.out.println(chevyHector.getMuestraInformacion());

        System.out.println();

        chevyAlex.setColor("blanco");
        chevyAlex.setManual(false);
        chevyAlex.setAutomatico(true);
        System.out.println(chevyAlex.getMuestraInformacion());
    }
}
