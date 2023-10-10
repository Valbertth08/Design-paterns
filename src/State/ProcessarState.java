package State;

public class ProcessarState {

    private State state;


    public ProcessarState(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void MostrarEstadoAtual(){
        state.MostrarEstadoAtual();
    }

}
