package Comand;

public class Desligar implements Comando{
    private Tv televisao;

    public Desligar(Tv televisao) {
        this.televisao = televisao;
    }
    @Override
    public void executar() {
        televisao.Desligar();
    }
}
