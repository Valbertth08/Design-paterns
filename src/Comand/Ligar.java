package Comand;

public class Ligar implements Comando{
    private Tv televisao;

    public Ligar(Tv televisao) {
        this.televisao = televisao;
    }

    @Override
    public void executar() {
        this.televisao.ligar();
    }
}
