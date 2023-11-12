package Comand;

public class MudarCanal implements Comando{
    Tv televisao ;
    Integer canal;

    public MudarCanal(Tv televisao, Integer canal) {
        this.televisao = televisao;
        this.canal = canal;
    }

    @Override
    public void executar() {
        televisao.mudarCanal(this.canal);
    }
}
