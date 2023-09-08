package Composite;

public class Main {
    public static void main(String[] args) {

        CaixaDeJogo caixa1 = new CaixaDeJogo();
        caixa1.addJogo(new Jogo("Resident Evil",200.00));
        caixa1.addJogo(new Jogo("GTA ",50.00));

        CaixaDeJogo caixa2 = new CaixaDeJogo();
        caixa2.addJogo(caixa1);
        caixa2.addJogo(new Jogo("Bomba Patch",200.00));

        caixa2.mostrarJogo();

    }
}
