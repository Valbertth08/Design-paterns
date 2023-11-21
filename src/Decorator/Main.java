    package Decorator;

    public class Main {
        public static void main(String[] args) {

            CafeBasico cafe = new CafeConcreto();

            CafeDecorator CafeComLeite= new Leite(cafe);
            CafeComLeite.exibirIgredientes();

            CafeDecorator leiteCreme= new Leite(new CremeDeLeite(cafe));
            leiteCreme.exibirIgredientes();

            CafeDecorator leiteCremeAçucar= new Açucar(leiteCreme);
            leiteCremeAçucar.exibirIgredientes();


        }
    }
