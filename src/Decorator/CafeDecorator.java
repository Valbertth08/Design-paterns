package Decorator;

public abstract class CafeDecorator implements CafeBasico {

    private CafeBasico cafe;

    public CafeDecorator(CafeBasico cafe) {
        this.cafe = cafe;
    }

    public CafeBasico getCafe() {
        return cafe;
    }
}
