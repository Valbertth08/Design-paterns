package Mediator;

public class motoristaTaxi extends Motorista{

    public motoristaTaxi(String name, Double preco, Mediator mediator) {
        super(name, preco, mediator);
    }

    @Override
    Double enviarPreco(Motorista motorista) {
        return motorista.getPreco();
    }
}
