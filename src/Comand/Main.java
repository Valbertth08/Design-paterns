package Comand;

public class Main {

    public static void main(String[] args) {

        ControleRemoto controleRemoto= new ControleRemoto();
        Tv televisao= new Tv();
        controleRemoto.addComandos(new Ligar(televisao));
        controleRemoto.addComandos(new MudarCanal(televisao,10));
        controleRemoto.addComandos(new Desligar(televisao));

        controleRemoto.execute();
    }
}
