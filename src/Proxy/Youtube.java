package Proxy;

public class Youtube {

    private BibliotecaYoutube bibliotecaYoutube;

    public Youtube(BibliotecaYoutube bibliotecaYoutube) {

        this.bibliotecaYoutube = bibliotecaYoutube;
    }

    public  void  mostrarOpcao(){
        bibliotecaYoutube.BaixarVideo();
        bibliotecaYoutube.ListarVideos();
    }
}
