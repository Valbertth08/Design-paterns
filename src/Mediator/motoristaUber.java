
package Mediator;

public class motoristaUber  extends Motorista{
    public motoristaUber(String name, Double preco, Mediator mediator) {
        super(name, preco, mediator);
    }
    @Override
    Double enviarPreco(Motorista motorista) {
        return null;
    }
}
